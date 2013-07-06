// vehicle.java - example base class
// Demonstrates:	inheritance
//
// 3/04 
//

public class vehicle
{
	protected String _name;	// just its own pet name
	protected int _numWheels;

	public vehicle( String name )
	{
		_name = name;
		this._numWheels = 0;	// this is superfluous here
	}
}


