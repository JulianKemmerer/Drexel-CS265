// Io.java - Reading stdin, parsing by line
// Demonstrates:	BufferedReader, InputStreamReader, System
//
// 3/04 
//
//

import java.io.*;

// Notice only one public class per file.  Also automatically "extends object"
// if not explicitly written.
//
public class stdinIoRec
{
	// The Java style "main" method; may not be shortened.  Note could be written
	// "String args[]" using alternate array syntax.
	public static void main(String[] args) throws Exception
		// A "good" programmer would at least consider handling exceptions using
		// try-catch instead of just passing them up.  Java requires all "checked"
		// exceptions that can be thrown to be declared in the method declaration.
	{
			// Example of "chaining" I/O classes -- wrapping a lower level class in
			// the constructor of another class.
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			//BufferedReader is used to take advantage of its readLine method.
		
		System.out.println("Please type a line and hit the \"Enter\" key");
			// IntraString escape sequences in Java are like C.
		String s=br.readLine();
		System.out.println("\nYou typed:\n"+s);
			//String concatenation using the "+" operator.
	}
}

