// stringSplit.java - Reads diskfile by records (lines), breaks lines into
//		tokens using the String.split() method
// Demonstrates:	String.split(), BufferedReader, InputStreamReader,
//		FileInputStream
//
// 3/04 
//

import java.io.*;
import java.lang.System;


public class stringSplit
{
	public static void main( String[] args ) throws Exception
	{
		int rV;
		String buff;

		if( args.length != 1 )
		{
			System.err.println( "I need ! 1 filename to read\n" );
			System.exit( 1 );
		}

		FileInputStream fileIn = new FileInputStream( args[0] );

			// "chaining" I/O classes 
		BufferedReader bIn =
			new BufferedReader( new InputStreamReader( fileIn ));

		buff = bIn.readLine();

		while( buff != null )
		{
			System.out.println( "line: " + buff );
			String[] toks = buff.split( "\\s+" );
				/* Note, this RE makes all adjacent whitespace a single delimiter
				 * Compare this to simply using "\\s"
				 * Note that the backslash itself needs to be escaped, since it has
				 * meaning to the String class, who will interpret it before sending
				 * it to the split() method.
				 */

			for( String t : toks )
			{
				System.out.println( t );
			}

			System.out.print( "\n" );
			
			buff = bIn.readLine();
		}	// while more lines

	}	// main

}	// class fileTokInp

