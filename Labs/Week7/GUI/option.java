// option.java - simple messages
// Demonstrates:	JOptionPane
//
// 3/04 
//

import javax.swing.JOptionPane;

public class option
{
	public static void main( String[] argv )
	{
		String msg = "Would you like to exit?";
		final String title = "Option Title";

		int rV;

		do
		{
			rV = JOptionPane.showOptionDialog(
					null, msg, title, JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, null, null );
			
			switch( rV )
			{
				case JOptionPane.NO_OPTION:
					msg = "You chose \"No\""; break;
				case JOptionPane.CANCEL_OPTION:
					msg = "You chose \"Cancel\""; break;
				case JOptionPane.CLOSED_OPTION:
					msg = "You clicked the little closing 'x'"; break;
				default:
					msg = "Didn't see it";
			}

			msg = msg + "\nUse \"Yes\" to quit";
		} while( rV != JOptionPane.YES_OPTION );

		// When using windows, you need to explicitly exit
		System.exit( 0 );
	}
} 	// class option


