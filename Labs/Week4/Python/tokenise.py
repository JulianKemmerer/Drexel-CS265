#!/usr/bin/python
# tokens.py - an example of using C++-like << operator for input
#
# Kurt Schmidt
# 3/2011
#
# Python 2.6.2 on
# Linux 2.6.28-17-generic #58-Ubuntu i686 GNU/Linux
#
# DEMONSTRATES:  yield streams
#

import sys

def tokenise( fin ) :
	'''generator, serves up one token at a time
	input - a valid, openo file handle (object)
	output - next token (as a string)
	side-effects - input pointer is moved'''

	for line in fin :
		for tok in line.split() :
			yield tok

def main( args ) :
	if len( args ) < 2 :  # read stdin
		f = sys.stdin
	else :
		f = open( args[1] )

	tokens = tokenise( f )
	for t in tokens :
		print t

if __name__ == '__main__' :
	sys.exit( main( sys.argv ))
