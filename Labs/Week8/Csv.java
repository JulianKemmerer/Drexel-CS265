import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class Csv
{
  List<CSVLine> lines = new ArrayList<CSVLine>();
  
  public Csv(String fileName)
  {
	System.out.println("Trying to read file: " + fileName);
	
	//Try to read from the file
	try
	{
	  //Read each line
	  BufferedReader in = new BufferedReader(new FileReader(fileName));
	  String str = "";
	  while ((str = in.readLine()) != null)
	  {
		  //Create a new CSVLine for each line
		  lines.add(new CSVLine(str));
	  }
	  in.close();
	}
	catch (IOException e)
	{
	  System.out.println(e.toString());
	}
  }
 
  //Test driver main
  public static void main(String args[])
  {
	  System.out.println("Hello World!");

	  //The Csv contructor outputs debug information that fits the criteria of "outputs something you can easily check for correctness (this might include the # of fields per line). "
	  Csv csv = new Csv("test.csv");

	  //Lines can be accessed by using
	  //csv.lines[index]
	  //Fields can be accessed by using
	  //csv.lines[lineIndex].fields[fieldIndex]
	  //lines and fields are lists so their count be obtained using .size()
  }
}