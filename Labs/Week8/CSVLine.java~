import java.util.List;
import java.util.ArrayList;


public class CSVLine
{
  public List<String> fields = new ArrayList<String>();

  public CSVLine(String wholeLine)
  {
	System.out.println("Processing Whole Line: " + wholeLine);
	//Parse the wholeLine into string fields
	//From lab: A field is quoted if the first non-blank character is a double-quote
	//From lab: Double-quotes may appear inside quoted fields; they must be escaped with another double-quote.
	//"LU" ,  86.25   ,   "11/4/1998"   , "He said, ""What?!!"""   ,   "2:19PM"   ,  +4.0625   ,   "abc"
	processFieldAndRemove(wholeLine);
	System.out.println("Num Fields: " + fields.size() + "\n\n");
  }


  //I apologize for how messy this function is... :-( It was a long Sunday night...
  public void processFieldAndRemove(String line)
  {
	//System.out.println("Processing: " + line);
	//Look for " and ,
	int quoteIndex = line.indexOf('"');
	int commaIndex = line.indexOf(',');
	Boolean quotedField = false;

	//Terminating case
	if(line == "")
	{
	  //Done
	}
	else
	{
	  //Continue processing
	  //Determine if the first (working) field is quoted
	  if(quoteIndex == -1)
	  {
		//Entire line has no quotes
		quotedField = false;
	  }
	  else
	  {
		//If index of " is before index of , then field is quoted
		if(quoteIndex < commaIndex && quoteIndex != -1)
		{
		  quotedField = true;
		}
		else if(quoteIndex > commaIndex && commaIndex !=-1)
		{
		  quotedField = false;
		}
		else if(quoteIndex > commaIndex && commaIndex ==-1)
		{
		  quotedField = true;
		}
		else
		{
		  System.out.println("Error in character indices!");
		}
	  }
	  System.out.println(line + " \n\tcomma: " + commaIndex + " \n\tquote: " + quoteIndex + " \n\tquoted?: " + quotedField);


	  if(quotedField)
	  {
		//Field is quoted
		//Take everything between first and last quotes
		//Loop through each char one at a time
		//Keep track of the quotes
		int numQuotes = 0;
		int fieldEndingComma = -1;
		for (int i = 0; i < line.length(); i++)
		{
		  char c = line.charAt(i);
		  //Process char
		  if(c == '"')
		  {
			numQuotes++;
		  }
		  else if( c == ',')
		  {
			//If even number of quotes
			if(numQuotes %2 == 0)
			{
			  //This comma falls outside grouping of quotes
			  //Field ends here
			  fieldEndingComma = i;
			  break;
			}
			else
			{
			  //Odd ,ignore this comma
			}
		  }
		}

		//Get text from field
		String tmpField = "";
		if(fieldEndingComma != -1)
		{
		  //Get text between start and fieldEndingComma
		  tmpField = line.substring(0, fieldEndingComma);
		  //Remove tmpField from line
		  line = line.substring(fieldEndingComma +1, line.length());
		}
		else
		{
		  //This is last field
		  tmpField = line;
		  line = "";
		}

		//Remove any double quotes and make them single quotes
		tmpField = tmpField.replaceAll("\"\"", "\"");
		//Remove first and last chars (quotes)
		tmpField = tmpField.substring(1,tmpField.length()-1);
		tmpField = tmpField.trim();
		System.out.println("Found quoted field: " + tmpField + "\n");
		fields.add(tmpField);
		processFieldAndRemove(line);
	  }
	  else
	  {
		//Field is not quoted
		//If first char is comma
		if(commaIndex == 0)
		{
		  //Remove comma in first position
		  line = line.substring(1,line.length());
		}

		//Get text from field
		String tmpField = "";
		if(line.indexOf(',') != -1)
		{
		  //Take everything from beginning to comma
		  tmpField = line.substring(0,line.indexOf(','));
		  //Add this newly gathered field
		  tmpField = tmpField.trim();
		  System.out.println("Found unquoted field: " + tmpField + "\n");
		  fields.add(tmpField);
		  //Remove the field from the line and reprocess
		  line = line.substring(line.indexOf(',')+1, line.length());
		}
		else
		{
		  //This is last field
		  tmpField = line;
		  tmpField = tmpField.trim();
		  System.out.println("Found last unquoted field: " + tmpField + "\n");
		  fields.add(tmpField);
		  line = "";
		}
		processFieldAndRemove(line);
	  }
	}
  }
}
