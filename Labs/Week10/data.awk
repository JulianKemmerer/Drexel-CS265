#!/usr/bin/awk -f
# data.awk - given data in columnar format ( n T(n) ), one point per line, 
#		divides T(n) by n, n^2, n^3, n ln(n), n sqrt(n)
#

BEGIN {
	FS=","
	n = 1
	T = 2
	printf( "%15s%15s%15s%15s%15s%15s%15s\n", "        n", "      T(n)",
		"   T(n)/n", "  T(n)/n^2", "T(n)/n^3", " T(n)/(n ln(n))", 
		"T(n)/n/sqrt(n)" )
}

{
	printf( "%15f%15f%15f%15f%15f%15f%15f\n", $n, $T, $T/$n, $T/$n/$n,
					$T/$n/$n/$n, $T/$n/log($n),
					$T/$n/sqrt($n) )
}
