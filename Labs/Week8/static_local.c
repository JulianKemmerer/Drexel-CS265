#include <stdio.h>

int count()
{
	static int n = 4;
	n += 2;

	return n-2;
}

int main()
{
	int i;
	for( i=0; i<20; ++i )
		printf( "%d\n", count() );
	printf( "\n" );

	return 0;
}
