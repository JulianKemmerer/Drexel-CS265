/*
 * hash.c - quick example of a hash table (w/a really stupid hash function)
 *
 * Kurt Schmidt
 * Feb '06
 *
 */

#include <stdlib.h>
#include <string.h>
#include <stdio.h>

#define TABLE_SIZE  7
#define NUM_INPUTS  7

int hash( char *s )
{
	return strlen( s ) % TABLE_SIZE ;
}

struct entry
{
	char *key;
	int	val;
	struct entry *next;
};

typedef struct entry entry;

entry* table[ TABLE_SIZE ] = { NULL };

void insert( char *s, int v )
	/* this insert is not checking for duplicates.  :/ */
{
	int h = hash( s );
	entry *t = (entry*) malloc( sizeof( entry ));

	t->key = s;
	t->val = v;
	t->next = table[h];
	table[h] = t;
}

void clean_table()
{
	entry *p, *q;
	int i;

	for( i=0; i<TABLE_SIZE; ++i )
	{
		p = table[i];
		while( p != NULL )
		{
			q = p->next;
			free( p );
			p = q;
		}
	}	// for each entry
}	// clean_table


int find(char *name, int *value)
{
	int h = hash(name);
	
	entry *p, *q;
	p = table[h];
	while(p!=NULL)
	{
		if(p->key == name)
		{
			*value = p->val;
			return 1;
		}
	}

	return 0;
}

int main()
{
	char* keyList[] = { "Jaga", "Jesse", "Cos", "Kate", "Nash", "Vera",
		"Bob" };

	int valList[] = { 24, 78, 86, 28, 11, 99, 38 };

	int i;

	for( i=0; i<NUM_INPUTS; ++i )
		insert( keyList[i], valList[i] );

	char *name = "Bob";
	int data;
	if( find( name, &data ))
		   printf( "Found %s.  (S)he's %i\n\n", name, data );
	else
		   printf( "\nCouldn't find %s\n\n", name );



	/* what does the table look like here? */

	clean_table();

	return( 0 );
}
