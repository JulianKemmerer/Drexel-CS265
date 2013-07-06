// Arr.java - built-in arrays
// Demonstrates:	array.length, resizing, bounds checking
//
// 3/04 
//

import java.io.*;


public class Arr
{
	public static void main(String[] args) throws Exception
	{
		int[] a = { 74, 011, 23, 0xff };

		System.out.println( "\nArray has " + a.length + " elements:" );

		for( int i=0; i<a.length; ++i )
		{
			System.out.print( "" + a[i] + ", " );
		}

		System.out.print( "\n\n" );

		// Bounds checking?
		// a[4] = 99;	// this throws a java.lang.ArrayIndexOutOfBoundsException

	 // Resize?
	 // a.length = 5;	// nope, length is a final property

	}	// main

};	// class Arr

