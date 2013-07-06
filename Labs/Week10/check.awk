#!/bin/awk -f
# check.awk - just verifies output that's been sorted
#

#BEGIN { IGNORECASE = 1 }

NR==1 { last = $1 }

NR > 1 {
	if( last > $1 )
	{
		printf( "line %d:  %s followed %s\n", NR, $1, last )
		exit 1
	}
	else
		last = $1
}

END { print "\nDone!" }
