// MoneyTest - tests the Money class
//
// Kurt Schmidt
// 8/06
//
// JUnit 4 ?
//
// editor: tabstop=2
//

//import org.junit.Test;
import junit.framework.*;

public class MoneyTest extends TestCase {

	private Money m12CHF;
	private Money m14CHF;
	private Money md13CHF;

		// c'tor
	public MoneyTest( String name ) {
		super( name );
	}

		// this is run before every test
	protected void setUp() {
		m12CHF= new Money( 12, "CHF" );  
		m14CHF= new Money( 14, "CHF" );        
		md13CHF = new Money( -13, "CHF" );  // a negative amount.  Allowed?
	}

		// this is run after every test
	protected void tearDown() {
		// I have no cleaning up to do
		// Just here for example
	}

		// This guy adds *all* of the tests of this class to the test suite
		// 	(uses reflection)
	public static Test suite() {
		return new TestSuite( MoneyTest.class );
	}

		//	This is a little easier to follow what is actually happening
		//	It allows us to choose which tests to add
//	public static Test suite() {
//		TestSuite suite= new TestSuite();
//		suite.addTest( new MoneyTest( "testEquals" ));
//		suite.addTest( new MoneyTest( "testAdd" ));
//		return suite;
//	}

	/*%%%%%%% The test methods %%%%%%%%%%%%%%*/

	public void testEquals() {
		Money expected = new Money( 12, "CHF" );
		assertEquals( expected, m12CHF );
		assertEquals( m12CHF, m12CHF );
		assertNotSame( expected, m12CHF );
		assertFalse( m12CHF.equals( m14CHF ));
		assertFalse( expected.equals( m14CHF ));
	}

	public void testAdd() {
		Money expected26 = new Money( 26, "CHF" );
		Money expectedd1 = new Money( -1, "CHF" );
		
		assertNotNull( expected26 );
		assertNotNull( expectedd1 );

		Money result26 = m12CHF.add( m14CHF );
		assertNotNull( result26 );
		assertEquals( expected26, result26 );
	
		result26 = m14CHF.add( m12CHF );
		assertNotNull( result26 );
		assertEquals( expected26, result26 );

		Money resultd1 = m12CHF.add( md13CHF );
		assertNotNull( resultd1 );
		assertEquals( expectedd1, resultd1 );
	}

	public static void main( String args[] ) {
		String[] caseName = { MoneyTest.class.getName() };
		junit.textui.TestRunner.main( caseName );
	}

//	public static void main( String [] argv )
//	{
//		MoneyTest t = new MoneyTest( "money test" );
//		t.setUp();
//		t.testEquals();
//		t.testAdd();
//	}
}
