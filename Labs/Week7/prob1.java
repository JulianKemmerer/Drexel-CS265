public class prob1
{
  public static void main( String[] args )
  {
    if(args.length >=1)
    {
      String name = args[0];
      for(int i = 1; i <=100; i++)
      {
	System.out.print(name + " ");
      }
    }
    else
    {
      System.out.println("Error: No name supplied");
    }
  }
}

