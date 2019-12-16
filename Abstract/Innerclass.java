package Abstract;

public class Innerclass {
	private int a=13;
	public class inner
	{
		public void fun()
		{
			System.out.print("The value of a is "+a);
		}
	}
	public static void main(String[] args)
	{
		Innerclass obj=new Innerclass();
		Innerclass.inner o=new Innerclass().new inner();
		o.fun();
	}

}
