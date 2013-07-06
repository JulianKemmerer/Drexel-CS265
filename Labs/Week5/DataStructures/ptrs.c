/*
 * ptrs.c - playing around w/pointers
 *
 * Kurt Schmidt
 * Feb '06
 *
 */

#include <stdlib.h>
#include <stdio.h>
#include <string.h>

char buffer[100];

int main()
{
	strcpy( buffer, "on the footsteps of dawn" );

	printf( "\nbuffer is:\n\t%s\n", buffer );

	char *s = buffer;

	printf( "After assignment, s is:\n\t%s\n", s );

	strcat( s, "... who's never ever been born" );

	printf( "\nAfter modifying s, it is:\n\t%s\n", s );
	printf( "But buffer is:\n\t%s\n", buffer );

	printf( "\nTry again...\n" );

	strcpy( buffer, "on the footsteps of dawn" );

	s = (char*) malloc( 100 );
	strcpy( s, buffer );
	strcat( s, "... who's never ever been born" );

	printf( "After modifying s, it is:\n\t%s\n", s );
	printf( "But buffer is:\n\t%s\n", buffer );

	free( s );
	s = NULL;

	printf( "\n" );

	return 0;
}
