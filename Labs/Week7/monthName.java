// Io.java - Anoter simple example
//	Given a month # (1-12), prints the name of the month
// Demonstrates:	Integer, Integer.parseInt, array
//
// 3/04 
//
//


import java.io.*;

public class monthName
{
	static String months[] = 
	{
		null, "January", "February", "March", "April", "May",
		"June", "July", "August", "September", "October",
		"November", "December"
	};

	public static void main( String[] argv )
	{
		int m = Integer.parseInt( argv[0] );
		System.out.println( months[ m ] );
	}
} 	// class monthName


