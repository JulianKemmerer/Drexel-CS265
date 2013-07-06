// intArgs.java - Reads command-line args, converts to integers
// Demonstrates:	Integer, argv, String
//
// 3/04 
//
//


import java.io.*;
import javax.management.*;

public class intArgs
{
	/** @author Kurt Schmidt
	 *  @param argv - array of integer strings
	 */

	public static void main( String[] argv ) 
	{
		int l = argv.length;

		try {
			for( int i = 0; i< l; ++i ) {
				int n = Integer.parseInt( argv[i] );
				System.out.println( n );
			}
		}
		catch( NumberFormatException e ) {
			System.out.println( "Caught a NumberFormatException!:" );
			System.out.println( e );
		}
		catch( Exception e ) {
			System.out.println( "Caught a generic Exception!:" );
			System.out.println( e );
		}
		finally {
			System.out.println( "We're in the finally block!" );
		}

	Integer a = new Integer( 5 );
	Integer b = new Integer( 13 );

	a = null;

	//a = a + 8;
	//a.toString();

	//System.out.println( "a is now: " + a + "\n" );

	} // main

} 	// class intArgs


