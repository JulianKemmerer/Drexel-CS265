#!/bin/bash
# usage: getopts.bash [-a] [-b arg] [-c] args...
# Example showing how to use getopts to process command options
echo $*
echo $OPTIND
while getopts ":ab:cC" opt; do
	case $opt in
		a  ) echo "option a, at index $OPTIND";;
		b  ) echo "option b with arg = $OPTARG, at index $OPTIND";;
		c | C ) echo "option $opt, at index $OPTIND";;
		? ) echo "usage: $0 [-a] [b arg] [-c] args..."
	  	     exit 1;;
	esac
done
# OPTIND is set to the number of the first positional parameter past the options
# i.e. the number of the next argument to be processed.
# The expression $(( ... )) is an arithmetic expression
echo "\$OPTIND = $OPTIND"
shift $(($OPTIND -1))

echo -e "\nHere are the remaining arguments:"
for i in "$@" ; do
	echo -e "\t$i"
done

