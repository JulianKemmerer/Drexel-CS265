#!/usr/bin/python
#
# gen_func.py - another way of faking a static variable, using a
#		generator function.  Essentially, delayed evaluation of a sequence
#
# Kurt Schmidt
# 12/07
#
# DEMONSTRATES:  yield
#

def get_next_filename_gen( startIdx=0 ) :
	'''Returns a serial of filenames'''
	idx = startIdx
	while 1 :
		s = str( idx )
		s = s.rjust( 5, '0' )
		yield 'tmp' + s
		idx += 1

def main() :
	"""A "main" function, called below.
	   This is a doc string, serves as a nice function header description"""
	
	filename = get_next_filename_gen( 8 )

	print "here's a filename:", filename.next()
	print "and the next:", filename.next()
	print "and the next:", filename.next()
	print "and the next:", filename.next()

if __name__ == "__main__" :
	main()
