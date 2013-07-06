// fileIoRecords.java - Reading diskfile, parsing by line
// Demonstrates:	BufferedReader, InputStreamReader, System
//
// 3/04 
//
//

import java.io.*;
import java.util.*;

public class fileIoRecords
{
	public static void main(String argv[]) throws IOException
	{
		FileInputStream stream = new FileInputStream( argv[0] );
		InputStreamReader reader = new InputStreamReader(stream);
		BufferedReader buff = new BufferedReader( reader );

		String line = buff.readLine();

		while( buff.ready() ) 
		{
			System.out.println( "read: " + line );

			// attempt to get next record
			line = buff.readLine();
		}
	}
}

