linecount=0

cat ~/.bashrc | while read line ; do
	(( linecount += 1 ))
	echo $linecount
done

echo -e "\nAfter loop, linecount is: $linecount\n"

echo -e "Compare to this loop, which reads your keyboard:\n"

linecount=0

read -p "Enter something => " l
while [ $l != 'q' ] ; do
	(( linecount += 1 ))
	echo $linecount
	read -p "Enter something ('q' to quit) => ", l
done

echo -e "\nAfter 2nd loop, linecount is: $linecount\n"
