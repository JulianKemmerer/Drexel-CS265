/* file:  sort2.c
 * author: Jeremy Johnson
 * Description:
 *   This program reads a sequence of strings from standard input and stores
 *   them in an array C strings (i.e. null terminated character arrays).
 *   After reading the strings, they are sorted using the standard C library
 *   sort function, qsort.  The sorted array is output to standard out.
 *
 * Notes:
 *   There are several problems with the code,
 *   1)  scanf does not check to see if the input is longer than the specified
 *       character array.  
 *   2)  The program does not catch errors from scanf
 *       nor strdup.
 *   3)  The array words has a fixed size, so that if there are more words
 *       than N, an error will occur that is not checked.
 *   4)  On Win32, using an array of size 1000000 leads to a runtime
 *       error (Segmentation Fault)
 *   How can these problems be fixed?
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
	char buffer[BUFSIZE];
	char *words[N];
	int nwords;
	int i;

	i = 0;
	while (scanf("%s",buffer) != EOF)
	{
		words[i] = strdup(buffer);
			i++;
	}
	nwords = i;
	qsort(words,nwords,sizeof(words[0]),icmp);
	for(i=0;i<nwords;i++)
		printf("%s\n",words[i]);
	return 0;
}
