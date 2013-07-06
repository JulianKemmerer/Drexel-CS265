/*
 * d1.c - builds a link list.  You are to trace this program
 *
 * Kurt Schmidt
 * 4/07
 *
 * EDITOR: tabstop=2, cols=80
 *
 * NOTE:  Don't try to compile or run this program.  It won't output
 *	 anything useful.  You are to read, to trace through the program, and
 *	 tell us what the list that is built is
 *
 */

#include <stdio.h>
#include "sNode.h"

int main()
{
	int i;
	int rV = 0;
	List l = NULL;
	char* input[] = { "06", "24", "3" };
	sNode *s, *t;

	for( i=0; i<3; ++i )
	{
		t = (sNode*)malloc( sizeof( sNode ));
		if( t == NULL )
		{
			fprintf( stderr, "Couldn't get memory for a node!  Exiting." );
			rV = 1;
			break;
		}
		t->data = input[i];
		t->next = l;
		l = t;
	}

	/* What does this list look like here? */

	s = l;
	while( s != NULL )
	{
		t = s->next;
		free( s );
		s = t;
	}

	return rV;
}
