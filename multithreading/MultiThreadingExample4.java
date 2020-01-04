package multithreading;
class whatsapp  extends Thread
{
	
	
}
public class MultiThreadingExample4 extends Thread
{
	public static void main(String[] args)
	{
		Thread thread1=new Thread(new Runnable() {
			public void run()
			{
				System.out.println("music player is running");
				while(!Thread.interrupted())
				{
					Thread.yield();
				}
				System.out.println("Thread1 Stopped");
			}});
			Thread thread2=new Thread(new Runnable() {
				public void run()
				{
					System.out.println("Whats app notification is coming");
					try
					{
						Thread.sleep(1000);
					}catch(InterruptedException e)
					{
						System.out.println("Thread1 is stopping");
						thread1.interrupt();
					}
			}});
		thread1.start();
		thread2.start();
		
	}
	
		
	}


