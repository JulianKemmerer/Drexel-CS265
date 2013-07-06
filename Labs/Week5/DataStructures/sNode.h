/*
 * sNode.h - a struct, used in singly-linked lists of strings
 *
 * Kurt Schmidt
 * Feb '06
 *
 */

#include "stdlib.h"

typedef struct sNode
{
	char *data;
	struct sNode *next;
} sNode;

typedef sNode* List;
