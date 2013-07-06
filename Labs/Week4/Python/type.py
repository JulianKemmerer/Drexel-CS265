#!/usr/bin/python
#
# type.py - using type
#
# Kurt Schmidt
# 5/06
#
#	Demonstrates: type, str, int
#

from math import pi
i = 24
s = "Kurt Schmidt"

if type( i ) == type( int() ) :
	print i, "is an integer"

if type( pi ) == type( float() ) :
	print pi, "is a float"

if type( s ) == type( str() ) :
	print '"%s" is a string' % s

if type( i ) == type( [] ) :
	print i, "is a list"
else :
	print i, "is *not* a list!"

if type( s ) == type( [] ) :
	print '"%s" is a list' % s
else :
	print '"%s" is *not* a list' % s


l = [ "a", i, s, "b" ]

if type( l ) == type( [] ) :
	print l, "is a list"
else :
	print l, "is *not* a list!"


t = ( "a", i, s, "b" )

if type( t ) == type( [] ) :
	print t, "is a list!"
else :
	print t, "is *not* a list"

if type( t ) == type( () ) :
	print t, "is a tuple"
else :
	print t, "is *not* a tuple!"


d = { 'Jaga':24, 'Ski':4, 13:'Kurt' }

if type( d ) == type( [] ) :
	print d, "is a list!"
else :
	print d, "is *not* a list"

if type( d ) == type( {} ) :
	print d, "is a dict"
else :
	print d, "is *not* a dict!"


class Foo :
	'''Just a quick demo class'''
	def __init__( self, n=None ) :
		print "Foo's init called"
		self.name = n

	def __str__( self ) :
		rv = "I'm a Foo!"
		if self.name :
			rv += '  My name is: ' + self.name
		return rv

class Bar( Foo ) :
	'''Child of a quick demo class'''
	def __init__( self, n=None ) :
		print "Bar's init called"
			# Parent's init must be called explicitly (if at all)
		Foo.__init__( self, n )

	def __str__( self ) :
		rv = "I'm a Bar!"
		if self.name :
			rv += '  My name is: ' + self.name
		return rv


f = Foo()
if type( f ) == type( Foo() ) :
		# Note, an unnamed Foo() was created above
	print str(f), "is a foo"
else :
	print str(f), "is *not* a dict!"

b = Bar( 'Dopey' )
if type( b ) == type( Bar() ) :
	print str( b ), "is a Bar"
if type( b ) == type( Foo() ) :
	print str( b ), "is also a Foo"

