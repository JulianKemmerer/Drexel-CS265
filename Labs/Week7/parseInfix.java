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


public class parseInfix
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
			System.out.println( "Parsing: " + buff );
			StringTokenizer st = new StringTokenizer( buff );

			while( st.hasMoreTokens() )
			{
				String s = st.nextToken() ;
				System.out.print( s );
				if( Character.isDigit( s.charAt(0) ))
					System.out.println( "  is an operand!" ) ;
				else
					System.out.println( "  is an operator!" ) ;

			}	// while same line

			System.out.print( "\n" );
			
			buff = bIn.readLine();
		}	// while more lines

	}	// main

}	// class fileTokInp

		
		
