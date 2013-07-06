import java.io.* ;

public class dtor {
	PrintStream cout = System.out ;
	public dtor() { cout.writeln( "In default c'tor" ); }
	public dtor( int y ) {
		cout.writeln( "In c'tor, got: " + y ); }

	public ~dtor() { "I'm dying!" }

	public static void main( String [] argv ) {
		dtor x = new dtor() ;
		dtor y = new dtor( 13 ) ;
	}
}


