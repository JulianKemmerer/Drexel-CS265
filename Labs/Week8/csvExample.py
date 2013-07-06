#!/usr/bin/python
# csvExample.py - simple example, parsing a CSV file
#
# Kurt Schmidt
#
# Oct '07
#
# DEMONSTRATES - csv, csv.reader, sys.argv
#
# NOTES: reads stdin, or a (single) file from the command line
#

import csv, sys

if len( sys.argv ) < 2 : # read stdin
	fh = sys.stdin
else :
	try :
		fh = file( sys.argv[1] )
	except IOError, e :
		print "%s:  Could not open %s:  %s\n" % \
			( sys.argv[0], sys.argv[1], e[1] )
		sys.exit( 1 )

input = csv.reader( fh )

for l in input :
	for field in l :
		print field
	print

