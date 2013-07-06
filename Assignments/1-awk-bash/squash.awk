$1 != prev && NR >1{
	printf "%s", words
	prev = $1
	words = $2
	prevWord = $2
	if (NR > 1) printf "\n"
}

$1 == prev && $2 != prevWord{
	prevWord = $2
  words = words " " $2 
}

NR == 1{
	prev = $1
	words = $2
	prevWord = $2
}

END{ 
	printf "\n" 
}

