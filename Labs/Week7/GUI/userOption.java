// userOption.java - simple messages, OK, Cancel
// Demonstrates:	JOptionPane.showOptionDialog
//
// 3/04 
//

import javax.swing.JOptionPane;

public class userOption
{
	public static void main( String[] argv )
	{
		String msg = "Which weapon will you take\ninto the maze?";
		final String title = "Choose Weapon";
		final Object[] options =
			{ "Sword", "Pen", "Laser ptr", "Lucky charm" };

		int rV;

		do
		{
			rV = JOptionPane.showOptionDialog(
					null, msg, title, JOptionPane.DEFAULT_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, options, options[1] );
		} while( rV == JOptionPane.CLOSED_OPTION );

		msg = "You chose the ";

		switch( rV )
		{
			case 0:
				msg += "Sword"; break;
			case 1:
				msg += "Pen"; break;
			case 2:
				msg += "Laser ptr"; break;
			case 3:
				msg += "Lucky charm"; break;
			default:
				msg = "Didn't see it"; break;
		}

		msg += ".\nGood choice";

		JOptionPane.showMessageDialog(
				null, msg, "Choice", JOptionPane.INFORMATION_MESSAGE );

		// When using windows, you need to explicitly exit
		System.exit( 13 );
	}
} 	// class userOption


