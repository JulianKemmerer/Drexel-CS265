#!/usr/bin/python
#
# email.py - a mailer
#
# Kurt Schmidt
# 2/07
#
# python 2.4.3, on cygwin 1.5.21
#
# EDITOR: cols = 80, tabstop = 2
#
# CREDIT: the send_mail function is largely stolen from Tim Morgan (who
#	 can't remember if he wrote this) at:
#	 http://snippets.dzone.com/posts/show/2038
#
# USAGE:
#		much like mutt's command-line (to avoid confusing my brain further)
#
#		The config file:
#			~/.pmailrc (by default), containing variable/value pairs (w/out
#			spaces):
#				<variable>=<value>
#			May contain the following values:
#				- send_from - your email address
#				- server - the smtp server to use
#				- login - (set, if server requires authentication.  Will prompt for
#					password)
#

DEBUG = False

import sys
from getopt import getopt
from getpass import getpass
import smtplib
import os
from email.MIMEMultipart import MIMEMultipart
from email.MIMEBase import MIMEBase
from email.MIMEText import MIMEText
from email.Utils import COMMASPACE, formatdate
from email import Encoders


scriptname = os.path.basename( sys.argv.pop( 0 ))

def usage() :
	print '''
Usage:
  %(script)s [ -b <addr> ] [ -c <addr> ] [ -a <file> ] [ -s <server> ]
  	[ -l login ] [ -f <from> ] [ -i <msg> ] [ -r <file> ] <addr> ...
  %(script)s -?|-h
  
    -a  attach a file (using MIME)
    -b  BCC address
    -c  CC address
    -f  Sender's address.  A config file is coming.  If not set, will try to
        use LOGIN@HOST
    -h, -?  prints out usage msg
    -i  msg (string), the body of the msg.  Or, read from stdin
    -l  The login name, if the server is SMTPAuth (will be prompted for
        password)
    -r  Read <file>, rather than ~/.pmailrc
    -s  The server to send through (should be in a config file)

  ''' % { 'script':scriptname }


def	send_mail( send_from, send_to, subject, text, cc, \
		bcc, attachments, server, login, passwd ) :

	assert type( send_to )==list
	assert type( attachments )==list
	assert type( cc )==list
	assert type( bcc )==list

	msg = MIMEMultipart()
	msg['From'] = send_from
	msg['To'] = COMMASPACE.join( send_to )
	#msg['To'] = send_to[0]
	msg['CC'] = COMMASPACE.join( cc )
	#msg['CC'] = cc[0]
	msg['BCC'] = COMMASPACE.join( bcc )
	#msg['BCC'] = bcc[0]
	msg['Date'] = formatdate( localtime=True )
	msg['Subject'] = subject

	msg.attach( MIMEText( text ) )

	for f in attachments :
		part = MIMEBase( 'application', "octet-stream" )
		part.set_payload( open( f, "rb" ).read() )
		Encoders.encode_base64( part )
		part.add_header( 'Content-Disposition', 'attachment; filename="%s"' % 
			os.path.basename( f ))
		msg.attach( part )

	server = smtplib.SMTP( server )
	if login :
		server.login( login, passwd )
	server.sendmail( send_from, send_to, msg.as_string() )
	server.close()



def parse_rc( env ) :

	rcName = env[ 'rcFile' ]

	f = open( rcName, 'r' )

	for l in f :
		l = l.strip()
		if l[0] != '#' :
			option, arg = l.split( '=' )
			option = option.strip()
			arg = arg.strip()

			if env[option] is None :
				env[option] = arg



def init( options, recipients, env ) :

	env['rcFile'] = os.environ['HOME'] + '/.pmailrc'

	env['login'] = None
	env['passwd'] = None
	env['subject'] = None
	env['to'] = recipients
	env['cc'] = []
	env['bcc'] = []
	env['attachments'] = []
	env['body'] = None
	env['send_from'] = None
	env['server'] = None

	for p in options :
		option = p[0].strip( '-' )
		if option == 'a' :
			env['attachments'].append( p[1] )
		elif option == 'b' :
			env['bcc'].append( p[1] )
		elif option == 'c' :
			env['cc'].append( p[1] )
		elif option == 'f' :
			env['send_from'] = p[1]
		elif option == 'i' :
			env['body'] = p[1]
		elif option == 'l' :
			env['login'] = p[1]
		elif option == 'r' :
			env['rcFile'] = p[1]
		elif option == 's' :
			env['subject'] = p[1]
		else :
			usage()
			return False

	parse_rc( env )

		# prompt for recipients
	if len( recipients ) == 0 :
		recipients.append( raw_input( "\nTo: " ).strip() )

		# prompt for subject
	if not env['subject'] :
		env['subject'] = raw_input( "\nSubject: " ).strip()

		# get msg (body)
	if env['body'] :		# read the body file
		f = open( env['body'], 'r' )
	else :			# get it from stdin
		f = sys.stdin
	env['text'] = f.read()

		# check for login, get password
	if env['login'] :	# we'll need a password
		env['passwd'] = getpass(
				"\nEnter password for %(login)s on %(server)s => "
				% env )

	return True



def main( argv=sys.argv ) :

	optlist, recipients = getopt( sys.argv, "?ha:b:c:f:i:l:s:r:" )
	env = {}

	if init( optlist, recipients, env ) :

		if DEBUG :
			print "### Here are the values to be passed to send_mail:"
			for k in env :
				print "\t",k,"=",env[k]
		else :
			send_mail( env['send_from'], recipients, env['subject'], env['text'],
				env['cc'], env['bcc'], env['attachments'], env['server'],
				env['login'], env['passwd'] )


if __name__ == '__main__' :
	main()
