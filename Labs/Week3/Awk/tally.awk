BEGIN { FS = "," }
{ tally[ $1 ] += $2 }
END {
	for( n in tally )
	{
		print n, tally[n]
	}
}
