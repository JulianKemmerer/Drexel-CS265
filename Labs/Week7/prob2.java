public class prob2
{
	public static void main( String[] args )
	{
		if(args.length >=1)
		{
			String s = args[0];
			int num = Integer.parseInt(s);
			if(num%2 == 0)
			{
			  System.out.println("Even");
			}
			else
			{
			  System.out.println("Odd");
			}
		}
		else
		{
			System.out.println("Error: No number supplied");
		}
	}
}

