#!/bin/bash
# eg.bash - just shows examples of the basic components of bash scripting
#
# Kurt Schmidt
#	1/04
# 
# Platform: Linux 2.6.18.6 
# 
# EDITOR: tabstop=2, cols=80
# 
# This is a comment

listFile="listOfOpenDirs"

debugOn="n"

read -p "Do you want to see the script as it executes? (y/n) => " debugOn
if [ "$debugOn" == "y" -o "$debugOn" == "Y" ] ; then
	set -x		# very useful switch to the set command
fi

# You can run simple commands:

echo -e "Hello $USER\n"

	# find all .html files (just files, not directories or links):
find . -type f -name "*.html" -print

	# find *all* html files (.htm, .html, .HTM, .HTML):
find . -type f -name "*.[hH][tT][mM]*" -print

	# find all files modifed in the last day:
find . -type f -mtime -1 -print

	# find all the emails in your default mail directory that mention Heidi,
	# save to file
find ~/.Maildir -exec grep Heidi {} \; -print > heidi.list

	# find and delete all backups left by vim (*~) in all subdirectories:
find . -name "*~" -exec \rm {} \;

	# find files out in /tmp that should be cleaned up, remove 'em
#find /tmp -user $USER -mtime +1 -exec \rm -i -rf {} \;

	# see if Kurt is grading (on this machine) ...
ps -ef | grep kschmidt | grep grade

# VARIABLES

str1="hello"					# Note that lack of spaces around the '='
str2="World"

echo -n "$str1 " 			# the -n suppresses the newline
echo $str2

str3="${str1}${str2}" # alternate form, nice when you don't want spaces
echo -e "\t\t$str3"		# the -e allows C-style escape characters in string

echo
#	CONDITIONALS
if [ "$str1" \> "$str2" ] ; then
	echo "$str1 comes before $str2"
else
	echo "$str2 comes before $str1"
fi

if [[ "$str1" < "$str2" ]] ; then		# note that caps come before lowercase
	echo "$str1 comes before $str2"
else
	echo "$str2 comes before $str1"
fi

x=3		# integer arithmetic only
y=5

if (( x < y )) ; then
	echo "x is less than y"
	(( x = y + 2 ))
elif (( x == y )) ; then
	echo "x is equal to y"
else
	echo "x is greater than y"
	(( y = x - 1 ))
fi

# Careful about base
echo $((017))
echo $((0x23))

echo "x is now $x, and y is $y"

echo
# LOOPS

	# Look for open class directories
for user in cam23 rad44 kschmidt ; do
	if [[ -r ~${user}/CS265 ]] ; then
		echo $user >> $listFile
	fi
done

cat $listFile

if [[ -f $listFile ]] ; then
	for user in $(cat $listFile) ; do
	# for user in `cat $listFile` ; do
		echo "Mailing $user..."
		#mail -s "Close class directories!" $user < /dev/null
	done
fi

resp="y"

while [[ "$resp" == "y" ]] ; do
	read -p "Would you like to continue this loop (y/n)? => " resp
done

resp="y"

while [[ "$resp" != "n" && "$resp" != "N" ]] ; do
	read -p "Would you like to continue this loop (y/n)? => " resp
done


	# a C-style for loop:
for (( i=1; i<=10; i++ )) ; do
	echo ${i}Q
done

echo -e "\nYou're welcome!\n"

# FUNCTIONS

	# Functions are nice, can be grouped into "include" files, and sourced
	# when needed.


function foo()	# this doesn't mean no args
{
	if [[ ! -d ~/tmp ]] ; then
		mkdir ~/tmp
		chmod 700 ~/tmp
	fi

	listFile="~/tmp/deleteMe"	# be nasty to caller
	echo "foo was here w/args $*" >> $listFile

	local resp="notAnIssue"		# local variable

	for arg ; do
		echo $arg
	done

	echo "I'm returning 13, because I can"

	return 13
}

	# to call the function:

foo these are my args

echo "foo returned $?"
echo "\$listFile is now: $listFile"
echo "\$resp is still: $resp"


