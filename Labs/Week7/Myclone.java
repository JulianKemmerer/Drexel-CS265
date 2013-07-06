// Myclone.java - looking at the Object.clone() method, and the Cloneable
// i/f
// Demonstrates:	Cloneable implements
//
// 3/04 
//
//


import java.io.*;

public class Myclone implements Cloneable
{
	public int i ;

	public Myclone( int i )
	{
		this.i = i;
	}

	public Myclone clone()
	{
		return new Myclone( i );
	}

	public static void main( String[] argv )
	{
		Myclone i = new Myclone( 13 ) ;

		Myclone j = i.clone() ;
	}
} 	// class monthName


