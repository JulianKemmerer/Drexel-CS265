#!/bin/bash
# rv - just playing w/the exit command
#
# Kurt Schmidt
#	1/04
# 

if [[ -z $1 ]] ; then
	echo -e "\nHey, try passing a numeric argument in this time!\n"
	exit
fi

exit $1

