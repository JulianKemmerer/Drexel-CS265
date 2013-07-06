#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#define WORDMAX 101

main()
{
  char thisword[WORDMAX], sig[WORDMAX];
  int compchar();
  while( scanf( "%s", thisword ) != EOF ) {
     strcpy( sig, thisword );
     qsort( sig, strlen(sig), sizeof(char), compchar );
     printf( "%s %s\n", sig, thisword );
  }
}

int compchar( a, b )
char *a, *b;
{
	if( *a < *b )
		return(-1);
	else if (*a == *b)
		return(0);
	else return(1);
}
