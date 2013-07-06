/******-*-c-*-**********************************************************
 * quicksort.c - C implementation of quicksort
 * 
 * CS265
 * winter '05
 * 
 * gcc 3.3.1 on Mandrake 9.2
 ***********************************************************************/

#include <stdlib.h>
#include <string.h>
#include <assert.h>

/* swap:  interchange v[i] and v[j]. */
void swap(char *v[], int i, int j)
{
     char *temp;

     temp = v[i];
     v[i] = v[j];
     v[j] = temp;
}


/* quicksort: sort v[0]..v[n-1] into increasing order. */
void quicksort(char *v [], int n)
{
     int i, last;
     if (n <= 1)                         /* nothing to do */
         return;
     swap(v,0,rand() % n);       /* move pivot element to v[0] */
     last = 0;
     for (i = 1; i < n; i++)         /* partition */
           if (strcmp(v[i],v[0]) < 0)
               swap(v,++last, i);
     assert((last >= 0) && (last < n));
     swap(v, 0, last);                 /* restore pivot */
     quicksort(v,last);               /* recursively sort each part. */
     quicksort(v+last-1, n-last-1);
}

