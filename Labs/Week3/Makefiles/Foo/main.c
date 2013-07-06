/* main.c - driver
 * 
 * CS265/571
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include "foo.h"

char *user;

int main( void )
{
	user = getenv( "USER" );

	printf( "\nfoo-main:\n\n" );
	printf( "Hello, %s!\n", user );
	wallOfVoodoo( myEnvVar );
	printf( "\n\n" );

	return( 0 );
}
