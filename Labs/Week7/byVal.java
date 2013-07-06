// byVal.java - passing arguments to methods
// Demonstrates:	pass by value, final, 
//
// 3/04 
//

import java.io.*;


public class byVal
{
	public static void foo( final int i )
	{
		// ++i;	// can't do this
		System.out.println( "\nfoo> i is: " + i + "\n" );
	}

	public static void bar( int i )
	{
		++i;	
		System.out.println( "\nbar> i is: " + i + "\n" );
	}

	public static void main(String[] args) throws Exception
	{
		final int j = 12;

		foo( j );
		bar( j );

		System.out.println( "\nmain> After calling bar, j is: " + j + "\n" );
	}	// main

};	// class byVal

		
		
