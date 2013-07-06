// bike.java - example derived class (subclass)
// Demonstrates:	inheritance
//
// 3/04 
//

public class bike extends vehicle
{
	protected boolean _standUp;

	public bike( String name )
	{
		super( name );	// call superclass' c'tor.  Must appear first
		super._numWheels = 2;	// refer to superclass' members
		_standUp = false;
	}
}


