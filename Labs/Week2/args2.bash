#!/bin/bash
# args - shows how to look at command-line args
#
# Kurt Schmidt
#	1/04
# 

if [ -z "$1" ] ; then
	echo -e "\nHey, try passing some arguments in this time!\n"
	exit
fi

numArgs=$#

echo -e "We got $numArgs args"

echo -e "\nOkay, \$0, the name of the script, is: $0"

echo -e "\nWe loop over the arguments destructively:"
i=1;
while [ ! -z "$1" ] ; do
	echo -e "$i:\t$1"
	(( ++i ))
	shift
done
echo

