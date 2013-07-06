// byRef.java - simple messages
// Demonstrates:	pass by reference, final variables, Integer, StringBuffer
//
// 3/04 
//
// Notes:
// 	Interesting, hey?  Final isn't quite const
//

import java.io.*;


public class byRef
{
	public static void foo( final Integer i )
	{
		// i = new Integer( 86 );		// still can't do this
		System.out.println( "\nfoo> i is: " + i + "\n" );
	}

	public static void foo( final StringBuffer s )
	{
		s.append( ".org" );
		System.out.println( "\nfoo> s is: " + s + "\n" );
	}

	public static void bar( Integer i )
	{
		i = new Integer( 86 );
		System.out.println( "\nbar> i is: " + i + "\n" );
	}

	public static void main(String[] args) throws Exception
	{
		final Integer j = new Integer( 12 );
		final StringBuffer localString = new StringBuffer( "gnu" );

		foo( j );
		bar( j );

		foo( localString );

		System.out.println( "\nmain> After calling bar, j is: " + j + "\n" );
		System.out.println( "\nmain> After calling bar, localString is: "
				+ localString + "\n" );
	}	// main

}	// class byRef

		
		
