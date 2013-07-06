#!/usr/bin/python
#
# args.py - reading command-line args
#
# Kurt Schmidt
# 5/06
#
#	Demonstrates: sys.argv
#

import sys

argc = len( sys.argv )

print "There are", argc, "arguments"

for i in range( argc ) :
	print i, sys.argv[i]

print ""

print "--OR--"

for a in sys.argv :
	print a

