// sNode.java - an example of a singly-linked list
//
// Kurt Schmidt
// Jan '06
//
// Notes:
//	To compile: $ javac sNode.java
//	To run: $ java sNode
//

class sNode
{
	public int data;
	public sNode next = null;

	public sNode( int d ){ data=d; }

	// Note: there are Java/OO people rolling over here, making data public
	//	It's JFD, so...

	public static void main( String[] argv )
	{
		sNode L, p, q, t;

		L = new sNode( 3 );

		t = new sNode( 24 );
		L.next = t;

		t = new sNode( 43 );
		t.next = L;
		L = t;

		t = new sNode( 28 );
		t.next = L.next;
		L.next = t;
	}	// main

};	// class sNode

