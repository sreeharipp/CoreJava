package Abstract;

public class fun {
  
	static int x=11;
	private int y=33;
	public void method1(int x)
	{
		fun t=new fun();
		this.x=22;
		y=44;
		System.out.println("Main x: "+fun.x);
		System.out.println("t.x :"+t.x);
		System.out.println("x:"+x);
		System.out.println("t.y:"+t.y);
		System.out.println("y:"+y);
	}
	public static void main(String[] args)
	{
		fun t=new fun();
		t.method1(5);
	}
}
