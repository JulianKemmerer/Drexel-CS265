// first.java - Simple first example
// Demonstrates:	System, String, int, long, double
//
// 3/04 
//
//


import java.io.*;

public class first
{
	public static void main( String[] argv )
	{
		System.out.print( "Been a long time since I\n" );
		System.out.print( "played w/Java\n" );

		int i = 12;

		System.out.print( "i is: " );
		System.out.println( i );

		// The easiest way to make a number into a string:
		double PI = 3.1415926535;
		String piStr = "" + PI;
		System.out.println( "Pi is: " + piStr );

		// or, do it this way
		String notherStr = String.valueOf( PI );
		System.out.println( "Pi is still: " + piStr );

		long l = 17l;
		// try declaring PI as a float, see what happens.  

		// how 'bout booleans?
		boolean flag = true ;
		System.out.println( "Here's the flag: " + flag ) ;
	}
} 	// class first


