// popup.java - simple messages
// Demonstrates:	JOptionPane
//
// 3/04 
//

import javax.swing.JOptionPane;

public class popup
{
	public static void main( String[] argv )
	{
		JOptionPane.showMessageDialog(
				null, "Well, this\nis a\ndefault popup.  :/" );
		JOptionPane.showMessageDialog(
				null, "This\nis an ERROR\npopup",
				"Optional Title", JOptionPane.ERROR_MESSAGE );
		JOptionPane.showMessageDialog(
				null, "This\nis an WARNING\npopup",
				"Optional Title", JOptionPane.WARNING_MESSAGE );
		JOptionPane.showMessageDialog(
				null, "This\nis an INFORMATION\npopup",
				"Optional Title", JOptionPane.INFORMATION_MESSAGE );
		JOptionPane.showMessageDialog(
				null, "This\nis an PLAIN\npopup",
				"Optional Title", JOptionPane.PLAIN_MESSAGE );

		// When using windows, you need to explicitly exit
		System.exit( 0 );
	}
} 	// class args


