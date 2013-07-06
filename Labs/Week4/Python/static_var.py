#!/usr/bin/python
#
# static_var.py - one way of faking a static variable (would be better to
#	 use a generator function, or a callable object)
#
# Kurt Schmidt
# 12/07
#

def get_next_filename() :
	'''Returns a serial of filenames'''
	s = str( get_next_filename.ctr )
	get_next_filename.ctr += 1
	s = s.rjust( 5, '0' )
	return 'tmp' + s

get_next_filename.ctr = 8
	# this, here, is the trick.  *everything* in Python is an object, and we
	# can define attributes on objects.  At least, ones we define.

def main() :
	"""A "main" function, called below.
	   This is a doc string, serves as a nice function header description"""
	
	print "here's a filename:", get_next_filename()
	print "and the next:", get_next_filename()
	print "and the next:", get_next_filename()
	print "and the next:", get_next_filename()

if __name__ == "__main__" :
	main()
