#!/usr/bin/python
#
# grep.py - an example of a simple grep
#
# Kurt Schmidt
# 7/06
#
#	Demonstrates: open, close, readline, sys.argv, slice, regexp, search
#
# Note:  Will use *Python* regular expressions, not the various flavors
#		provided by the standard grep utility
#

import sys
import re

def usage() :
	print "Usage:"
	print "\t" + sys.argv[0] + " <pattern> <file> [<file>]*"

def searchFile( fileName, pattern="kurt" ) :
	bStdIn = False

	if fileName == "" :		# read stdin
		fh = sys.stdin
		prefix = ""
		bStdIn = True
	else :	# it really is a disk file
		fh = open( fileName, "r" )
		prefix = fileName + ": "
	
	for l in fh :
		l = l.strip()

			# Here's the actual search
		if re.search( pattern, l ) :
			print prefix + l
	
	if not bStdIn :
		fh.close()


def main() :
	if len( sys.argv ) < 2 :
		print "No search pattern!"
		usage()
		sys.exit( 1 )
	pattern = sys.argv[1]

	if len( sys.argv ) < 3 :
		filelist = [ "" ]
	else :
		filelist = sys.argv[2:]

	for file in filelist :
		searchFile( file, pattern )

print "Starting program"
if __name__ == '__main__' :
	main()
print "Ending program"
