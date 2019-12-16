package Abstract;

public class Inheritance extends Abstractclass{
	public void add(int a,int b)
	{
		System.out.println((a+b));
	}
	public void subtract(int a,int b)
	{
		super.subtract(a,b);
	}

}
