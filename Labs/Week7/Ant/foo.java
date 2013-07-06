
import java.io.*;

public class foo extends bar
{
	protected int j;

	public foo( int b, int j )
	{
		super( b );
		this.j = j;
	}

	public static void main( String[] argv )
	{
		System.out.println(
				"\nYou're in foo's main!  The command-line args are:\n" );

		for( int i=0; i<argv.length; ++i )
			System.out.println( "" + i + ": " + argv[i] );

	}

}	// class foo
