package multithreading;

public class MultiThreadingexample3 extends Thread
{
	public static void main(String[] args)
	{
		MultiThreadingexample3 t1=new MultiThreadingexample3();
		t1.start();
	}
	public void run()
	{
		System.out.println("Am in run method by extending thread class");
	}

}
