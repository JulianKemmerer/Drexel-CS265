#!/usr/bin/python
# classes.py - An example of writing a class in Python
#
# Kurt Schmidt
# 2/09
#
# Python 2.5.2
#
# Editor: cols=80, tabstop=2
#
# Demonstrates:  classes, __init__ , __string__ , operator overloading
#


import sys

def gcd( x, y ) :
	'''Returns greatest common divisor using Euclid's algorithm'''
	while y != 0 :
		x, y = y, x%y
	return x

class Frac:
	'''Just a little wrapper for a fraction, a ratio of 2 integers:
		1. num - the numerator
		2. den - the denominator
	
	If uninitialised, num is set to None.  Should be set to None for an
	invalid fraction.

	Note, attributes are declared in __init__ (the 'ctor).
	'''

	def __init__( self, num=None, den=1 ) :
		
		if num is None :
			self.num, self.den = num, den
		elif type( num ) is type( self ) :
			self.num, self.den = num.num, num.den
		elif type( num ) is not type( int() ) \
				or type( den ) is not int :
			raise TypeError( "Frac is a ratio of integers" )
		else :
			self.den = den
			self.num = num

		self.reduce()
	
	def is_valid( self ) :
		return self.num is not None and self.den != 0

	def __str__( self ) :
		if not self.is_valid() :
			return "NaN"
		return str(self.num) + '/' + str(self.den)

	def echo( self ) :
		print self.__str__()
	
	def reduce( self ):
		'Puts the fraction in lowest terms'

		if self.is_valid() :
			g = gcd( self.num, self.den )
			self.num /= g
			self.den /= g

	def sum_with( self, rhs ) :
		'''increases value by rhs'''
		if type( rhs ) is type( int() ) :
			rhs = Frac( rhs )

		if type( rhs ) is not type( Frac() ) :
			raise TypeError( "Right operand not an int nor Frac" )

		self.num = self.num * rhs.den + self.den * rhs.num
		self.den *= rhs.den

		self.reduce()

	def __add__( self, rhs ) :
		'''Adds 2 Fracs, returns a new object'''
		rv = Frac( self )
		rv.sum_with( rhs )

		return rv

###   end Frac   ###

def main( argv=sys.argv ) :
	"A test driver"

	f = Frac()
	print 'f is: ' + f.__str__()

	g = Frac( 4, 6 )
	print 'g is: ' + g.__str__()

	f.num = 3
	f.den = 24
	f.reduce()
	print 'f is, after assignment: ' + f.__str__()

	h = Frac( 13 )
	print 'h is: ' + h.__str__()

	s = f + g
	print 'f + g is', s



if __name__ == "__main__" :		# then this was NOT included in another file
	main()
