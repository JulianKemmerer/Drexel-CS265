#!/usr/bin/python
#
# input.py - example of reading the standard input.
#
# Kurt Schmidt
# 5/06
#
#	Demonstrates: raw_input, split
#

def main() :
	"""A "main" function, called below.
	   This is a doc string, serves as a nice function header description"""
	
	# Do NOT use input() for now.  This is really just delayed evaluation.
	#		The input string is parsed by the interpreter (HUGE security issue,
	#		and probably not what you were looking for).

	line = raw_input( "Enter a line of stuff: " )

	print( "Okay, you entered this:\n\t" )

	print line

	print( "\nHere's each token, broken out:" )
	for w in line.split() :
		print w

	print ""

	age = int( raw_input( "Enter your age => " ))

	print "At your next birthday you will be " + str( age+1  )

	print "\n"

if __name__ == "__main__" :
	main()
