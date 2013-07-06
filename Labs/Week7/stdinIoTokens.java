// tokenInput.java - parses stdin by line, then token
// Demonstrates:	StreamTokenizer, BufferedReader, InputStreamReader
//
// 3/04 
//
// NOTE: Tokenizer classes are being deprecated.  Use String.split()
// 	instead.  See stringSplit.java
//

import java.util.StringTokenizer;
import java.io.*;


public class stdinIoTokens
{
	public static void main(String[] args) throws Exception
	{
		int rV;
		String buff;

			// "chaining" I/O classes 
		BufferedReader bIn =
			new BufferedReader( new InputStreamReader( System.in ));

		System.out.println(
				"Please type some tokens, followed by the \"Enter\" key =>");

		buff = bIn.readLine();
		
		StringTokenizer st = new StringTokenizer( buff );

		while( st.hasMoreTokens() )
		{
			System.out.println( st.nextToken() );
		}	// while
	}	// main

};	// class tokenInput

