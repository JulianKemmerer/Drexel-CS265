// Finally.java - Get input via dialog
// Demonstrates:	JOptionPane.showInputDialog
// Demonstrates:	try, catch, finally
//
// 3/04 
//
// Notes:
//	Give it w/2 ints to see finally in action
// 	Give it w/strings to see NumberException caught twice
// 	Give it only one int to see a NoSuchElement caught in main()
//

import java.io.*;
import java.util.StringTokenizer;

public class Finally
{
	public static int getAdd2Nrs() throws Exception
	{
		int i=0, j=0;
		int rV;

		String buff;

			// "chaining" I/O classes 
		BufferedReader bIn =
			new BufferedReader( new InputStreamReader( System.in ));

		System.out.print( "\nEnter 2 numbers => " );

		StringTokenizer st = new StringTokenizer( bIn.readLine() );

		try
		{
			i = Integer.parseInt( st.nextToken() );
			j = Integer.parseInt( st.nextToken() );
		}
		catch( NumberFormatException e )
		{
			System.err.println( "\nYou didn't enter 2 integers!" );
			System.err.println( e.toString() );

			throw e;
		}
		finally
		{
			System.out.println( "\nFinally.getAdd2Nrs> finally clause.  Always "
					+ "executes.  Cleanup here." );
		}

		return i+j;
	}	// getAdd2Nrs
		
	public static void main( String[] argv )
	{
		try
		{
			int rV = getAdd2Nrs();
			System.out.println( "\nSum is: " + rV + "\n" );
		}
		catch( Exception e )
		{
			System.err.println( "\nFinally.main> Caught exception" );
			System.err.println( e.toString() );
		}

		System.exit( 13 );
	}	// main

}; 	// class Finally


