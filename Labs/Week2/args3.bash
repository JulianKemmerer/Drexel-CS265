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

echo 'Using $*'
echo '--------'
for i in "$*" ; do
	echo $i
done

echo ""

echo 'Using $@'
echo '--------'
for i in "$@" ; do
	echo $i
done

echo ""
