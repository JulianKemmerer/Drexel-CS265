// pokerSuit.java - simple messages
// Demonstrates:	representing typesafe enums w/classes
//
// 3/04 
//
// Note:  This is thanks to:
//	http://developer.java.sun.com/developer/Books/shiftintojava/page1.html
//

//package edu.drexel.cs.kschmidt.CS265.cards;

/**
 * Enumerates the 4 suits in a standard poker deck.  The constructor is
 * private.  Each suit is represented by a static attribute, an instance of
 * this class.
 *
 * @author Kurt Schmidt
 */
public class pokerSuit implements Comparable 
{
		/** 
		 * The name of the suit ("hearts", "spades", etc.)
		 */
	private final String _name;

		/**
		 * The relative rank of the suit.  <b>Note</b>, this is <i>not</i> the
		 * card rank; rather a basis for comparing 2 suits.  In poker, e.g., the
		 * ace of spades is the highest card in the deck.  Then hearts,
		 * diamonds, clubs
		 */
	private final Integer _rank;

		/**
		 * c'tor that ignores rank.  Private.  Called to create each static
		 * attribute.
		 *
		 * @param String The name of the suit
		 */
	private pokerSuit( String name )
	{ _name = name; _rank = new Integer( 0 ); }

		/**
		 * c'tor that accepts a ranking.  Private.  Called to create each static
		 * attribute.
		 *
		 * @param String The name of the suit
		 * @param Integer rank
		 */
	private pokerSuit( String name, Integer rank )
	{ _name = name; _rank = rank; }

		/**
		 * Returns the name of the suit
		 *
		 * @return String
		 */
	public String toString()  { return _name; }

		/**
		 * Uses poker suit rank
		 *
		 * @param rhs object to be compared to
		 *
		 * @return int this.rank.compareTo( rhs.rank )
		 */
	public int compareTo( Object rhs )
	{
		return this._rank.compareTo( ((pokerSuit)rhs).rank() );
	}

		/**
		 * Returns rank so that others can compare
		 *
		 * @return _rank
		 */
	public Integer rank() { return _rank; }

	public static final pokerSuit CLUBS =
		new pokerSuit( "clubs", new Integer(1) );
	public static final pokerSuit DIAMONDS =
		new pokerSuit( "diamonds", new Integer(2) );
	public static final pokerSuit HEARTS =
		new pokerSuit( "hearts", new Integer(4) );
	public static final pokerSuit SPADES =
		new pokerSuit( "spades", new Integer(8) );
}

// can be made smarter by assigning a "rank" to each, and adding a comparison
// method.  Smarter still if rank were powers of 2.  The notion of "current"
// could be saved in a static variable, incremented as the static finals are
// built.

