#!/usr/bin/python

import sys

f = open( sys.argv[1], "r" )  # open file for reading (default)

l = f.readline()
d = dict();
while l :
	l = l.strip( ' \t\n' )  # get rid of leading/trailing whitespace(spaces,tabs, newlines)
	#print "Checking Line: ", l
	idThenName = l.split(' ',1) 
	#store in dictionary, id is key
	d[idThenName[0]] = idThenName[1]
	l = f.readline()

k = d.keys()
k.sort(key=int)

for key in k:
	print key, d[key]



