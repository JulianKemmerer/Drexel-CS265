// pokerClient.java - Using the pokerSuit class
// Demonstrates:	packages
//
// 3/04 
//

  // This is probably broken, possibly passe
//import edu.drexel.cs.kschmidt.CS265.cards.pokerSuit;
import java.io.*;


public class pokerClient
{
	public static void main( String[] argv )
	{
		pokerSuit thisCard = pokerSuit.SPADES;
		pokerSuit otherCard = pokerSuit.DIAMONDS;

		if( thisCard.compareTo( otherCard ) > 0 )
			System.out.println( "\nAce of " + thisCard.toString() +
					" beats an ace of " + otherCard.toString() + "!\n" );
		else
			System.out.println( "\nUh-oh.  Not right.\n" );
	}	// main

}

