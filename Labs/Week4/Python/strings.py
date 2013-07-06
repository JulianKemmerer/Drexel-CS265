#!/usr/bin/python
#	strings.py - example of using strings, slices
#
# Kurt Schmidt
# 05/06
#
# EDITOR: tabstop=2, cols=80
#

# python doesn't have characters.  Single- and double-quotes both denote
# strings, the same

first = "Kurt"
last = "Schmidt"
id = 42

# has simple operators

print 'first + last : ', first + last
print 'first + " " + last : ', first + " " + last

# print takes a comma-separated list:

print "my name is", first, last

# But, for better formatting, use concatenation

print "my name is " + last + ", " + first

	# wrap numbers in a str(), for concatenation

print "my name is " + last + ", " + first + ", and my id is: " + str( id )

	# we also have a repeat sorta operator on strings...
print "Kurt" * 3


# indexing, slicing...

print "last[3] is:", last[3]
print "last[:3] is:", last[:3]
print "last[3:] is:", last[3:]
print "last[3:5] is:", last[3:5]
print "last[:-1] is:", last[:-1]

