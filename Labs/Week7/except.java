import java.lang.* ;
import java.io.* ;
import java.util.Scanner ;

public class except
{
	public static class DumbAssException extends Exception {
		public DumbAssException( String s ) { super( s ); }
	}	// class DumbAssException

	public static class ThatsOdd extends RuntimeException {
		public ThatsOdd( String s ) { super( s ); }
	}	// class ThatsOdd

	public static PrintStream cout = System.out ;

	public static void foo( int i ) throws DumbAssException {
		cout.println( "In foo!" );
		try {
			if( i < 0 )
				throw new DumbAssException( "I said non-negative argument!" );
			if( i == 0 )
				throw new IllegalArgumentException( "I don't like zero, either." );
			if( i%2 == 1 )
				throw new ThatsOdd( "Hmmm." );
		}
		finally {
			cout.println( "in foo's finally block" );
		}
		cout.println( "Finished foo" );
	}

	public static void bar( int x ) throws Exception {
		cout.println( "In bar!" );
		try {	// outer
			try {
				cout.println( "bar:  Calling foo" );
				foo( x );
				cout.println( "bar:  Called foo" );
			}
			catch( DumbAssException e ) {
				cout.println( "In bar's DumbAssException.  Caught:" );
				cout.println( "" + e.toString() );
				cout.println( "Stacktrace:\n" );
				e.printStackTrace() ;
			}	// catch DumbAssException
			catch( IllegalArgumentException e ) {
				cout.println( "In bar's IllegalArgumentException.  Caught:" );
				cout.println( "" + e.toString() );
				cout.println( "Stacktrace:\n" );
				e.printStackTrace() ;
			}	// catch IllegalArgumentException
			catch( Exception e ) {
				cout.println( "Bar> Unkown Exception type.  Rethrowing" );
				throw (Exception) e ;
			}	// catch Exception
		}	// outer try
		finally {
			cout.println( "in bar's finally block" );
		}

		cout.println( "Finished bar" );
	}	// bar

	public static void main( String [] argv ) {
		cout.println( "Entered main..." );
		int i;
		Scanner cin = new Scanner( System.in );

		cout.print( "Enter an integer arg for foo => " ) ;
		i = cin.nextInt();
		while( i > -1000 )
		{
			try {
				bar( i ) ;
			}
			catch( Exception e )
			{
				cout.println( "\nDon't know what you did, but don't do it again.\n" );
			}
			finally
			{
				cout.print( "Enter an integer arg for foo => " ) ;
				i = cin.nextInt();
			}
		}	// while i
		cout.println( "Finished main" );
	}

}	// class except
