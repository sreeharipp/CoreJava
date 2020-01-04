package ExceptionHandlingExample;

public class EXceptionHandlingexample 
{
	static void check()throws ArithmeticException
	{
		System.out.println("Inside check function");
		throw new ArithmeticException("Face Kollam");
	}
	public static void main(String[] args)
	{
		try
		{
			check();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Caught"+e);
		}
	}

}
