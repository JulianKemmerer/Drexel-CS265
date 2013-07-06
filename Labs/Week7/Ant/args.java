// args.java - Looking at command-line args
// Demonstrates:	args []
//
// 3/04 
//
//

import java.io.*;

public class args
{
	public static void main( String[] args )
	{
		int l = args.length;
		for( int i = 0; i< l; ++i )
			System.out.println( args[i] );
		System.out.println( "\nOr, try this:\n" );
		for( String S : args )
			System.out.println( S );
	}
} 	// class args


