package multithreading;

public class MultiThreading4 extends Thread
{
    public void run()
    {
    	try
    	{
    		System.out.println("Music player is running");
    		Thread.sleep(1000);
    		
    	}
    	catch(InterruptedException e)
    	{
    		System.out.println("whatsapp message recived");
    	}
    	finally
    	{
    		System.out.println("Music plays");
    	}
    }
	public static void main(String[] args)
	{
		MultiThreading4 t=new MultiThreading4();
		t.start();
		t.interrupt();	
		
	}
}