/* file:  sorti.c
 * author: Jeremy Johnson
 * Description:
 *   This program takes a command line argument giving a range of sizes for
 *   inputs to quicksort, and times quicksort for the range of input sizes.
 *   The generated input arrays are sorted.
 *   usage:  sortr init count step 
 *   sorts for sizes init, init+step,...init+(count-1)*step
 *   e.g. sortr 1000 10 1000
 *   produces times to sort an array of size 1000, 2000, 3000, ..., 10000
 */

#include <stdio.h>
#include <assert.h>
#include <time.h>
#include <stdlib.h>
#define N 1000000         /* maximum number of integers to sort */
#define DEFSIZE 10        /* default number of integers to sort */


int main( int argc, char *argv[] )
{
	int temp;
	int numbers[N];
	int nints;
	int init, count, step;  /* range of input sizes */
	int i, j;
	clock_t t0, t1;
	double elapsed;


	if ( argc != 4 ) {
		printf( "usage:  sortr init count step\n" );
		exit( 1 );
	} else {
		init = atoi( argv[1] );
		count = atoi( argv[2] );
		step = atoi( argv[3] );
	}

	for ( i=0; i<count; i++ ) {
		nints = init + i*step;

		for ( j=0; j<nints; j++ )  /* generate input array */
			numbers[j] = j;

		t0 = clock();
		quicksort( numbers, nints );
		t1 = clock();
		elapsed = t1-t0;

		printf( "%d %f\n", nints, elapsed/CLOCKS_PER_SEC );
	}

	return 0;
}
