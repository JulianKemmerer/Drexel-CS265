#!/usr/bin/python

import sys

f = open( sys.argv[1], "r" )  # open file for reading (default)

l = f.readline()
while l :
	l = l.strip( ' \t\n' )  # get rid of leading/trailing whitespace(spaces,tabs, newlines)
	#print "Checking Line: ", l 
	total = 0.0;
	numGrades = 0.0;
	for i in l.split(' '):
		if(i.isdigit()):
			total += float(i)
			numGrades +=1.0

	print l.split(' ')[0] , total/numGrades
	l = f.readline()



