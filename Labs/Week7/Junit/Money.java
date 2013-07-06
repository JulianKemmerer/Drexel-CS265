// Money - trivial class, to demonstrate JUnit testing
//
// Kurt Schmidt
// 8/06
//
// Note: intended to store only whole units (no change)
//

import java.io.* ;

public class Money {
	private int fAmount;
	private String fCurrency;

	public Money( int amount, String currency ) {
		fAmount = amount;
		fCurrency = currency;
	}

	public boolean equals( Object anObject ) {
		if( anObject instanceof Money ) {
			Money aMoney = (Money)anObject;
			return aMoney.currency().equals( currency() )
				&& amount() == aMoney.amount();
		}
		return false;
	}

	public int amount() {
		return fAmount;
	}

	public String currency() {
		return fCurrency;
	}

	public Money add( Money rhs ) {
		if( ! rhs.currency().equals( fCurrency ))
			return null;
		return new Money( amount()+rhs.amount(), currency() );
	}

	public static void main( String [] argv )
	{
		Money m12CHF = new Money( 12, "CHF" );
		Money m14CHF = new Money( 14, "CHF" );
		Money md13CHF = new Money( -13, "CHF" );  // a negative amount.  Allowed?

		Money expected26 = new Money( 26, "CHF" );
		Money expected1 = new Money( -1, "CHF" );

		Money result26 = m12CHF.add( m14CHF );

		if( ! expected26.equals( result26 ))
			System.out.println( "Fail 1" );

		result26 = m14CHF.add( m12CHF );
		if( ! expected26.equals( result26 ))
			System.out.println( "Fail 2" );

		Money result1 = m12CHF.add( md13CHF );
		if( ! expected1.equals( result1 ))
		{
			System.out.println( "Fail 3" );
			System.out.println( "expected1 is: " + expected1.amount() +
					expected1.currency() );
			System.out.println( "result1 is: " + result1.amount() +
					result1.currency() );
		}

	}	// main
}	// class Money
