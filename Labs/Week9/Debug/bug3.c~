#include <stdio.h>
#include <string.h>

enum {
	MAX_LINES = 20,
	MAX_LINE_LEN = 80
};

char buff[ MAX_LINE_LEN ];

char* st[ MAX_LINES ] = {NULL};
int numLines = 0;

/* prompts user for search string, stores it in s */
/* s must be of sufficient size. */
void getInput( char *s );

/* returns TRUE if s appears in table */
int inTable( const char *s );

int main( int argc, char *argv[] )
{
	FILE *fin = NULL;

	/* load table */
	if( argc < 2 )
	{
		fprintf( stdout, "\nOkay, you didn't list an input file.\n" );
		return -1;
#if 0	// this is the code that should replace the return.  Not tested
		fprintf( stdout,
			"So, type entries here, one per line.  (ctrl-D to end)\n\n");
		fin = stdin;
#endif
	}
	else
	{
		fin = fopen( argv[1], "r" );
		if( fin==NULL )
		{
			fprintf( stderr, "\nCan't open %s for reading.  Exiting.\n\n",
					argv[1] );
			return -1;
		}
	}

	while( numLines<MAX_LINES && fgets( buff, MAX_LINE_LEN, fin ))
	{
		++numLines;
		st[ numLines ] = strdup( buff );
	}

	fclose( fin );

	/* get target */
	getInput( buff );

	if( inTable( buff ))
		printf( "\nYep, got one of those.\n" );
	else
		printf( "\nSorry, check back next Sat.\n" );

	return 0;
}


void getInput( char *s )
{
	printf( "\nEnter a string to search for => " );
	fgets( s, MAX_LINE_LEN, stdin );
}

int inTable( const char *s )
{
	int i;

	for( i=0; i<numLines; ++i )
	{
		if( strcmp( st[i], s ) == 0 )
			return 1;
	}

	return 0;
}
