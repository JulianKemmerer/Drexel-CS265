/* file:  sort1.c
 * author: Jeremy Johnson
 * Description:
 *   This program reads a sequence of strings from standard input and stores
 *   them in an array C strings (i.e. null terminated character arrays).
 *   After reading the strings, they are sorted using the quicksort code
 *   from the text (modified to sort arrays of C strings).  The sorted
 *   array is output to standard out.
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
#define N 1000000         /* maximum number of strings */

extern void quicksort( char *v[], int n );

int main()
{
	char buffer[BUFSIZE];
	char *words[N];
	int nwords;
	int i;

	/*printf( "###main> entry\n" );*/
	i = 0;
	while( scanf( "%s", buffer ) != EOF )
	{
		words[i] = strdup( buffer );  /* copy string in buffer */
			i++;
	}
	/*printf( "###main> read %d words\n", i );*/

	nwords = i;
	
	/* lets sort it 1000 times */
	for( i=0; i<500; ++i )
		quicksort( words, nwords );

	/*printf( "###main> past quicksort\n" );*/

	for( i=0; i<nwords; i++ )
		printf( "%s\n", words[i] );

	return 0;
}
