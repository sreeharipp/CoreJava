package multithreading;
class Number implements Runnable
{
	public void run()
	{
		for(int i=0;i<4;i++)
			System.out.println(i);
	}
}
public class MultiThreadingExample1
{
	public static void main(String[] args)
	{
		Runnable obj1=new Number();
		Number obj2=new Number();
		Thread thread1=new Thread(obj1);
		Thread thread2=new Thread(obj2);
		thread1.start();
		thread2.start();
	}

}
