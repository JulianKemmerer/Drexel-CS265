// motorcycle.java - extends bike, implements internalCombustion
// Demonstrates:	inheritance, interfaces
//
// 3/04 
//

public class motorcycle extends bike implements internalCombustion
{
	protected boolean _running;

	public motorcycle( String name )
	{
		super( name );	// call superclass' c'tor.  Must appear first
		_numWheels = 2;
	}

	public boolean start()
	{
		_running = true;
		return true;
	}

	public void stop()
	{
		_running = false;
	}

	public boolean isRunning()
	{
		return _running;
	}

	static public void main( String [] argv )
	{
		motorcycle m = new motorcycle( "Ben" );

		m.start();

		if( m.isRunning() )
			System.out.println( "Lucky, got the bike started" );
		else
			System.out.println( "Yeah, keep trying" );
		
		m.stop();

		if( m.isRunning() )
			System.out.println( "That's not right" );
		else
			System.out.println( "Okay, the bike shut down" );
	}
		
}


