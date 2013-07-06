/* main.c - driver
 * 
 * CS265/571
 *
 */

#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "bar.h"

char *user;

int main( void )
{
	user = getenv( "USER" );

	printf( "\nbar-main:\n\n" );
	printf( "Hello, %s!\n", user );
	brachiate();
	printf( "\n\n" );

	return( 0 );
}
