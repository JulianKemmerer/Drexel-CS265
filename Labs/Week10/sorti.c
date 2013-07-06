/* file:  sorti.c
 * author: Jeremy Johnson
 * Description:
 *   This program takes a command line argument giving the size of an array of
 *   integers to be sorted.  Currently an array of integers is generated and
 *   then sorted.  The time to sort, using clock, is reported.  The sorted
 *   array is not reported, though it is checked for correctness.
 *   them in an array.  After reading the integers, they are sorted using 
 *   an implementation of quicksort from the text.  The sorted array is output to 
 *   standard out.
 */

#include <stdio.h>
#include <assert.h>
#include <time.h>
#include <stdlib.h>
#define N 1000000         /* maximum number of integers to sort */
#define DEFSIZE 10        /* default number of integers to sort */


int main(int argc, char *argv[])
{
	int temp;
	int numbers[N];
	int nints;
	int i;
	clock_t t0,t1;
	double elapsed;


	if (argc > 1)
		nints = atoi(argv[1]);
	else
		nints = DEFSIZE;

	for (i=0;i<nints;i++)
		numbers[i] = i;


	t0 = clock();
	quicksort(numbers,nints);
	t1 = clock();
	elapsed = t1-t0;
	printf("Time to sort %d elements = %f\n",nints,elapsed/CLOCKS_PER_SEC);
	return 0;
}
