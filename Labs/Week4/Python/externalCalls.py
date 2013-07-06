#!/usr/bin/python
#
#	externalCalls.py - demonstrates a system call, using the return value, and
#		capturing the output
#
#	Kurt Schmidt
#	8/06
#

import subprocess; # to get call

cmd = r'systemEg.py'

##############
# Doesn't capture stdout nor stderr

print "\nTuple returned from Popen obj:"
print "   subprocess.Popen( [cmd] ).communicate()"

proc = subprocess.Popen( [cmd] )
outTuple = proc.communicate()
rV = proc.poll()

print ""

for i in range( 0, len(outTuple) ) :
	#print i, outTuple[i]
	print "   Element %d in tuple:\n   -------------------\n%s" % (i, outTuple[i])

print "\n=> Had a return value of %d" % (rV)

##############
# captures stdout, but not stderr

print "\nTuple returned from Popen object:"
print "   subprocess.Popen( [cmd], stdout=subprocess.PIPE ).communicate()"

proc = subprocess.Popen( [cmd], stdout=subprocess.PIPE )
outTuple = proc.communicate()
rV = proc.poll()

print ""

for i in range( 0, len(outTuple) ) :
	#print i, outTuple[i]
	print "   Element %d in tuple:\n   -------------------\n%s" % (i, outTuple[i])

print "\n=> Had a return value of %d" % (rV)
print "============================="

##############
# captures both stdout and stderr, in the same place

print "\nTuple returned from Popen obj:"
print "   subprocess.Popen( [cmd], stdout=subprocess.PIPE, " + \
	"stderr=subprocess.STDOUT ).communicate()"

proc = subprocess.Popen( [cmd], stdout=subprocess.PIPE, \
		stderr=subprocess.STDOUT )
outTuple = proc.communicate()
rV = proc.poll()

print ""

for i in range( 0, len(outTuple) ) :
	#print i, outTuple[i]
	print "   Element %d in tuple:\n   -------------------\n%s" % (i, outTuple[i])

print "\n=> Had a return value of %d" % (rV)
print "============================="

##############
# captures both stdout and stderr, in different places

print "\nTuple returned from Popen obj:"
print "   subprocess.Popen( [cmd], stdout=subprocess.PIPE," + \
	"stderr=subprocess.PIPE ).communicate()"

proc = subprocess.Popen(
		[cmd], stdout=subprocess.PIPE, stderr=subprocess.PIPE )
outTuple = proc.communicate()
rV = proc.poll()

print ""

for i in range( 0, len(outTuple) ) :
	#print i, outTuple[i]
	print "   Element %d in tuple:\n   -------------------\n%s" % (i, outTuple[i])

print "\n=> Had a return value of %d" % (rV)
print "============================="

