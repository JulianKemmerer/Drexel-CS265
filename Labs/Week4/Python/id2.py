#!/usr/bin/python

import sys
isStdIn = True
if(len(sys.argv) <=1):
	#No file arg - read stdin
	f = sys.stdin
else:
	isStdIn = False
	f = open( sys.argv[1], "r" )  # open file for reading (default)

l = f.readline()
d = dict();
k = [];
while l!='\n' and l:
	if isStdIn:
		print #newline
	l = l.strip( ' \t\n' )  # get rid of leading/trailing whitespace(spaces,tabs, newlines)
	idThenName = l.split(' ',1) 
	d[idThenName[0]] = idThenName[1]
	if isStdIn:
		k = d.keys()
  	k.sort(key=int)
	for key in k:
		print key, d[key]
	l = f.readline()

if(isStdIn == False):		
	k = d.keys()
	k.sort(key=int)
	for key in k:
		print key, d[key]
	


