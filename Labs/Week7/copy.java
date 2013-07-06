
import java.io.*;

public class copy implements Cloneable {
	public int i;

	public copy() { i = 13 ; }

	public copy( int n ) { i = n; }

	public static void main( String [] args ) {
			// create 2 distinct objects, w/different values
		copy a = new copy();
		copy b = new copy( 12 );
		if( a==b ) System.out.println( "Problem before assign:  a==b" );
		if( a.equals( b ))
			System.out.println( "Problem before assign:  a.equals(b)");

			// set 2 references to same object
		a = b;
		b.i = 33;
		if( a.i != 33 ) System.out.print( "*Not* the same object!" );
		if( a!=b ) System.out.print( "Not the same object either!" );

			// Now, spin off a copy.  Should be 2 distince objects
		a = (copy) b.clone();
		if( a==b ) System.out.print( "Whoops!  Still same object." );
		if( ! a.equals( b )) 
			System.out.print( "Copy didn't work" );
		
			// Check that they are distinct
		a.i = 5;
		if( b.i == 5 ) System.out.print( "Huh.  I don't know what happened." );
	}	// main
}

