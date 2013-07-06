import java.lang.Math;

class gInt
{
  public int a = 0;
  public int b = 0;

  //Real only constructor
  public gInt(int real)
  {
	a = real;
  }

  //Both constructor
  public gInt(int real, int imaginary)
  {
	a = real;
	b = imaginary;
  }

  //Real
  public int real()
  {
	return a;
  }

  //Imaginary
  public int imag()
  {
	return b;
  }

  //Add method
  public gInt add(gInt x)
  {
	gInt result = new gInt(0,0);
	result.a = (x.a + a);
	result.b = (x.b + b);
	return result;
  }

  //Multiply method
  public gInt multiply(gInt x)
  {
	gInt result = new gInt(0,0);
	result.a = (a*x.a) - (b*x.b);
	result.b = (a*x.b) + (b*x.a);
	return result;
  }

  //L2 Norm
  public float norm()
  {
	return (float)Math.sqrt((a*a) + (b*b));
  }

  //Overload equals for testing
  public boolean equals( Object anObject )
  {
	if( anObject instanceof gInt)
	{
	  gInt agInt= (gInt)anObject;
	  return (agInt.real()== real() && agInt.imag()==imag());
	}
	return false;
  }


  
}
 