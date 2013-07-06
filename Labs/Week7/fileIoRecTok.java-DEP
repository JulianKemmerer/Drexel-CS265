// fileTokInp.java - Reads diskfile by records (lines), breaks lines into
//		tokens
// Demonstrates:	StreamTokenizer, BufferedReader, InputStreamReader,
//		FileInputStream
//
// NOTE: Tokenizer classes are being deprecated.  Use String.split()
// 	instead.  See stringSplit.java
//
// 3/04 
//

import java.util.StringTokenizer;
import java.io.*;


public class fileIoRecTok
{
	public static void main( String[] args ) throws Exception
	{
		int rV;
		String buff;

		FileInputStream fileIn = new FileInputStream( args[0] );

			// "chaining" I/O classes 
		BufferedReader bIn =
			new BufferedReader( new InputStreamReader( fileIn ));

		buff = bIn.readLine();

		while( buff != null )
		{
			StringTokenizer st = new StringTokenizer( buff );

			while( st.hasMoreTokens() )
			{
				System.out.print( st.nextToken() + " " );
			}	// while same line

			System.out.print( "\n" );
			
			buff = bIn.readLine();
		}	// while more lines

	}	// main

}	// class fileTokInp

		
		
