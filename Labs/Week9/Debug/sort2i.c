/* file:  sort2.c
 * author: Jeremy Johnson
 * Description:
 *   This program reads a sequence of integers from standard input and stores
 *   them in an array.  After reading the integers, they are sorted using the 
 *   standard C library sort function, qsort.  The sorted array is output to 
 *   standard out.
 */

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define BUFSIZE 100     /* maximum string size */
#define N 10000         /* maximum number of strings */


int icmp(const void *p1, const void *p2)
{
	int v1, v2;

	v1 = *(int *) p1;
	v2 = *(int *) p2;
	if (v1 < v2)
		return -1;
	else if (v1 == v2)
		return 0;
	else
		return 1;
}

int scmp(const void *p1, const void * p2)
{
	char *v1, *v2;
	
	v1 = *(char **) p1;
	v2 = *(char **) p2;
	return strcmp(v1,v2);
}

int main()
{
	int temp;
	int numbers[N];
	int nints;
	int i;

	i = 0;
	while (scanf("%d",&temp) != EOF)
	{
  	  numbers[i] = temp;
          i++;
	}
	nints = i;
	qsort(numbers,nints,sizeof(numbers[0]),scmp);
        for(i=0;i<nints;i++)
		printf("%d\n",numbers[i]);
	return 0;
}
