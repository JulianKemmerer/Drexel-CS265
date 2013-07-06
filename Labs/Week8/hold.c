/* strtok.c - examining the strtok function */

#include <stdlib.h>
#include <string.h>

int main()
{
	char s[] = "This is some damned string" ;

	int len = strlen( s );

	const char *here = s;

	while( *here != '\0' )
	{
		printf( "%c\n", *here );
		++here;
	}
	printf( "\n" );

	const char* delims = " ";

	char* word = strtok( s, delims );
	while( word != NULL )
	{
		printf( "%s\n", word );
		word = strtok( NULL, delims );
	}
	printf( "\n" );

	int i;
	for( i=0; i<len; ++i )
		printf( "%02x ", s[i] );
	printf( "\n" );


	return 0;
}
