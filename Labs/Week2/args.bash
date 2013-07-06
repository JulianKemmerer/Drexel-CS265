#!/bin/bash
# args - shows how to look at command-line args
#
# Kurt Schmidt
#	1/04
# 
# NOTES:  Run w/quoted input, like:
#		args.bash a "b c" d
#

debugOn="n"

read -p "Do you want to see the script as it executes? (y/n) => " \
	debugOn
if [ "$debugOn" == "y" -o "$debugOn" == "Y" ] ; then
	set -x		# very useful switch to the set command
fi

echo "You passed in $# arguments"

if [ -z $1 ] ; then
	echo -e "\nHey, try passing some arguments in this time!\n"
	exit
fi

if (( $# < 3 )) ; then
	echo -e "\nOkay, at least 3 arguments.  Make it mildly interesting.\n"
	exit
fi

echo -e "\nOkay, \$0, the name of the script, is: $0"

echo -e "\nHere are the command line args:\n\t$*"

echo -e "\nOne way of going through the args:"
echo "$1 $2 $3 ..."

echo -e "\nBe careful!  Only works for single digits.  Past 9 this is better:"
echo "${1} ${2} ${3} ..."

echo -e "\nWe could loop over the arguments directly (\$*):"
i=0
for arg in $* ; do
	(( i+=1 ))
	echo -e "$i\t$arg "
done
echo

echo -e "\nWe could loop over the arguments directly (\"\$*\"):"
i=0
for arg in "$*" ; do
	(( i+=1 ))
	echo -e "$i\t$arg "
done
echo

echo -e "\nNot so good.  We could try this (\$@):"
i=0
for arg in $@ ; do
	(( i+=1 ))
	echo -e "$i\t$arg "
done
echo

echo -e "\nNot so good.  We could try this (\"\$@\"):"
i=0
for arg in "$@" ; do
	(( i+=1 ))
	echo -e "$i\t$arg "
done
echo


echo -e "\nOr, we could use the shift built-in command,"
echo -e "(but we lose them when we're done):"
argList="$*"	# save the list for later, maybe

i=0
while [ ! -z "$1" ] ; do
	(( i+=1 ))
	echo -e "$i\t$1"
	shift
done
echo

echo -e "\nSee, now \$1 is: \"$1\"  All gone."

