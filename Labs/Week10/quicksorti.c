/******-*-c-*-**********************************************************
 * quicksort.c - C implementation of quicksort (for integers)
 * 
 * CS265
 * winter '05
 * 
 * gcc 3.3.1 on Mandrake 9.2
 ***********************************************************************/

/* swap:  interchange v[i] and v[j]. */
void swap(int v[], int i, int j)
{
     int temp;

     temp = v[i];
     v[i] = v[j];
     v[j] = temp;
}


/* quicksort: sort v[0]..v[n-1] into increasing order. */
void quicksort(int v [], int n)
{
     int i, last;
     if (n <= 1)                         /* nothing to do */
         return;
//     swap(v,0,rand() % n);       /* move pivot element to v[0] */
     last = 0;
     for (i = 1; i < n; i++)         /* partition */
           if (v[i] < v[0])
               swap(v,++last, i);
     swap(v, 0, last);                 /* restore pivot */
     quicksort(v,last);               /* recursively sort each part. */
     quicksort(v+last+1, n-last-1);
}

