package multithreading;
class Numbers extends Thread
{
	public void run()
	{
		
			System.out.println("Thread1 is running ");
	
	System.out.println("Thread3 is running "+Thread.currentThread().getName());
	}
}
class Numbers1 implements Runnable
{
	public void run()
	{
		for(int i=10;i<20;i++)
		{
			
			System.out.println("Thread2 is running "+Thread.currentThread().getName());
			System.out.println("Thread2 is running "+Thread.currentThread().getId());
		}
	}
	
}
public class MultiThreadingExample
{
	public static void main(String[] args)
	{
	Numbers n1=new Numbers();
	Numbers1 n2=new Numbers1();
	Thread t1=new Thread("hari");
	n1.start();
	n2.run();
	t1.start();
	}

}
