import java.util.Calendar;

public class prob4
{
	public static void main( String[] args )
	{
		if(args.length >=1)
		{
			int num = Integer.parseInt(args[0]);
			Calendar cal = Calendar.getInstance();
			if(num == 0)
			{
			  System.out.println("Milliseconds since January 1, 1970: " + cal.getTimeInMillis());
			}
			else if(num == 1)
			{
			  System.out.println("Seconds since January 1, 1970: " + cal.getTimeInMillis()/1000);
			}
			else if(num == 2)
			{
			  System.out.println("Days since January 1, 1970: " + (cal.getTimeInMillis()/1000)/86400);
			}
			else if(num == 3)
			{
			  System.out.println("Current Date: " + cal.getTime());
			}
			else
			{
			  System.out.println("Option not regonized");
			}
		}
		else
		{
			System.out.println("Error: No option number supplied");
		}
	}
}
