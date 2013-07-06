/* Copyright (C) 1999 Lucent Technologies */
/* Excerpted from 'The Practice of Programming' */
/* by Brian W. Kernighan and Rob Pike */

#include <stdio.h>
#include <string.h>
#include <stdlib.h>
#include <assert.h>

#include "csv.h"

/* csvtest main: test CSV library */
int main(void)
{
	int i;
	char *line;

	while ((line = csvgetline(stdin)) != NULL) {
		printf("line = `%s'\n", line);
		for (i = 0; i < csvnfield(); i++)
			printf("field[%d] = `%s'\n", i, csvfield(i));
	}
	return 0;
}
