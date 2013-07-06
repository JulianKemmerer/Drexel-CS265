#!/usr/bin/python
#
# systemEg.py - prints to stdout, stderr, and returns a value
#		called from within externalCalls.py
#
# Kurt Schmidt
# 8/06
#
#	Demonstrates: sys, stdout, stderr, exit
#

# you can read from sys.stdin like any other filehandle...

import sys

cout = sys.stdout
cerr = sys.stderr

cout.write( "Here's a line to stdout\n" )
#cout.write( "Okay, here's another line to stdout\n" )
cerr.write( "Here's a line to stderr\n" )
#cerr.write( "Okay, here's another line to stderr\n" )

sys.exit( 13 )

