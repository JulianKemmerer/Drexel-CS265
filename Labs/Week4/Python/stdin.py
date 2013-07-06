#!/usr/bin/python
#
# readFile.py - Various ways of reading a file
#
# Kurt Schmidt
# 5/06
#
#	Demonstrates: readline, readlines, seek, sys, sys.stdin, stdin
#

# you can read from sys.stdin like any other filehandle...

import sys

f = sys.stdin

# you can read a single character at a time:

c = f.read( 1 )
while c :
	print c
	c = f.read( 1 )

f.close()


# You can grab a line at a time:

f = open( "students", "r" )  # open file for reading (default)

	# get rid of leading/trailing whitespace (spaces, tabs, newlines)
l = f.readline()
while l :
	l = l.strip( ' \t\n' )
	print l
	l = f.readline()


	# possibly a slicker way (python gives you an iterator over the file)
f.seek( 0 )	# get back to the beginning of the file
for l in f :
	print l		# note that the newlines are there


# you can slurp the entire file into memory - Careful!  files get big
# quickly

f.seek( 0 )	# get back to the beginning of the file

	# lines is a list of lines
lines = f.readlines()

for l in lines :
	print l.strip( ' \t\n' )

