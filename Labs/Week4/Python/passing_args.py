#!/usr/bin/python
#
# passing_args.py - various ways to specify arguments
#
# Kurt Schmidt
# 12/10
#
# DEMONSTRATES:  *args, **args, printf, enumerate, sorted, dict
#

###  KEYWORD ARGS  ########################
	# must follow non-keyword args

def macD( animal, noise='moo', farmer='MacDougal' ) :
	print '''Old %s had a farm, in Ohio-i-o.
And on that farm he has a %s, in Ohio-i-o.
With a %s %s here and a %s %s there''' % \
		( farmer, animal, noise, noise, noise, noise )

	# can be called in these ways
macD( 'cow' )
macD( 'dog', 'woof' )
macD( noise='woof', animal='dog' )
macD( 'cow', farmer='MacDonald' )

	# but not in these ways
#macD( noise='mooo' ) # missing arg req'd
#macD( noise='mooo', cow ) # non-keyward arg follows keyword

print '\n'

###  ARBITRARY ARGUMENT LISTS   ########
	# must follow normal arguments

def how_many( reqd, *args ) :
	print "how_many> Here is your req'd arg:", reqd
	print "Here are the rest:"
	for i,a in enumerate( args ) :
		print '  %2d  %s' % ( i+2, str( a ))

how_many( 3, '2nd arg', 3, 'arg4' )
print '\n'

###  MAP OF KEYWORD ARGS  ###################
	# instead of an arbitrary length list of positionals, you can take an
	# arbitrary length mapping (keyword args)
	# Must follow normal args and arg lists

def print_dict( **kwargs ) :
	print 'print_dict> You passed these keyword args:'
	for k in sorted( kwargs.keys() ) :
		print ' ', k, '=', kwargs[k]

print_dict( client='John Cleese',
		answer=42, question='Life, the Universe, and Everything' )
print '\n'

###  UNPACKING LISTS  ###############################
	# If you have positional args in a list

def foo( a, b, c ) :
	print 'foo> You gave me these args:'
	print '  a =', a
	print '  b =', b
	print '  c =', c

l = [ 1, 2, 3 ]
foo( *l )
print '\n'

###  UNPACKING DICTS  ###############################
	# If you have keyword args in a mapping

d = dict( a='Do', b='Re', c='Mi' )
foo( **d )
print '\n'
