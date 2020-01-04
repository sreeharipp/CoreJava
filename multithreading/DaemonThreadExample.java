package multithreading;

public class DaemonThreadExample extends Thread
{
	public void run()
	{
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Daemon Thread works");
		}
		else
			System.out.println("User Thread work");
	}
	public static void main(String[] args)
	{
		 DaemonThreadExample t1=new  DaemonThreadExample();
		 DaemonThreadExample t2=new  DaemonThreadExample();
		 DaemonThreadExample t3=new  DaemonThreadExample();
		 t1.setDaemon(true);
		 t1.start();
		 t2.start();
		 t3.setDaemon(true);
		 t3.start();
		 
	}

}
