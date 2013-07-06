// inputDialog.java - Get input via dialog
// Demonstrates:	JOptionPane.showInputDialog
// Demonstrates:	try, catch, finally
//
// 3/04 
//

import javax.swing.JOptionPane;

public class inputDialog
{
	public static void main( String[] argv )
	{
		final String title = "Input";
		String msg = "Enter your name";
		int i, j;

		String rV;

		rV = JOptionPane.showInputDialog( msg );

	 	msg = "You entered\n" + rV;	

		try
		{
			rV = JOptionPane.showInputDialog( "Enter first #" );
			i = Integer.parseInt( rV );

			rV = JOptionPane.showInputDialog( "Enter second #" );
			j = Integer.parseInt( rV );

			msg = "The sum of " + i + " + " + j + "\nis: " + (i+j);

			JOptionPane.showMessageDialog(
					null, msg, "Your Input", JOptionPane.INFORMATION_MESSAGE );
		}
		catch( NumberFormatException e )
		{
			msg = "Must enter integers!:\n" + e.toString();
			JOptionPane.showMessageDialog(
					null, msg, "Input Error", JOptionPane.ERROR_MESSAGE );
		}
		finally
		{
			JOptionPane.showMessageDialog( null,
					"This comes up in\neither case",
					"ProgramDone", JOptionPane.INFORMATION_MESSAGE );
		}

		// When using windows, you need to explicitly exit
		System.exit( 13 );
	}
} 	// class inputDialog


