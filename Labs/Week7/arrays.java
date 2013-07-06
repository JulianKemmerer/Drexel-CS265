// arr.java - built-in arrays
// Demonstrates:	array.length, resizing, bounds checking
//
// 3/04 
//

import java.io.*;


public class arrays {

public static void main( String[] args ) throws Exception
{
		// they are much like C-arrays.  They do NOT resize themselves

		// Here is one way to declare/initialise an array:
	int[] a = { 74, 011, 23, 0xff };

	System.out.println( "\nArray a has " + a.length + " elements:" );

		// Okay, a little smarter.  We can ask it its length
	for( int i=0; i<a.length; ++i )
	{
		System.out.print( "" + a[i] + ", " );
	}

	System.out.print( "\n\n" );

	//System.out.println( a );

		// And it does do bounds checking
	// a[4] = 99;	// this throws a java.lang.ArrayIndexOutOfBoundsException

		// Resize?
	// a.length = 5;	// nope, length is a final property
 
		// to create a new array of a given size
	int [] t = new int[ 20 ];

		// to resize a, copy it over to the new one...
	for( int i=0; i<a.length; ++i )
		t[i] = a[i];

	a = t;	// the old array is now marked for deletion
	t = null;

	System.out.println( "\nAfter resize, array a can hold "
			+ a.length + " elements:" );

		// Okay, a little smarter.  We can ask it it's length
	for( int i=0; i<a.length; ++i )
	{
		System.out.print( "" + a[i] + ", " );
	}

	System.out.print( "\n\n" );
}	// main

};	// class Arr

