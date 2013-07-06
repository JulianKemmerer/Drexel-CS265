#!/usr/bin/python
#
# getopts.py - parsing command-line arguments
#
# Kurt Schmidt
# 2/07
#
#	Demonstrates: getopts
#

import sys
from getopt import getopt

scriptname = sys.argv.pop( 0 ) # shift off the scriptname
optlist, args = getopt( sys.argv, "qvf:" )

print "Here are your options (and their args):\n", optlist
print "\nHere are the non-option args:\n", args

