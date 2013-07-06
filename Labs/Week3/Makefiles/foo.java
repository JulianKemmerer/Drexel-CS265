//  foo.java - simple example program
//
//  Kurt Schmidt
//  4/08
//
//	javac 1.6.0, on
//	Linux 2.6.20-cs-acl.nfsgroups.perfctr i686 GNU/Linux
//

import java.io.* ;

/**
 * A "hello world"-type program
 *
 * @author Kurt Schmidt
 */

public class foo
{
		// a single space
	static private final String _field_sep = " ";

	static public void main( String [] argv )
	{
		//System.out.println( _msg );

		// print a conversion table, Fahrenheit to Centigrade
		int f, c ;
		double a ;
		for( f=10; f<=100; f+=5 )
		{
			a = (double)( f-32 ) / 9 * 5 ;
			c = (int) Math.round( a );
			System.out.println( "" + f + _field_sep + c ) ;
		}
	}
}

