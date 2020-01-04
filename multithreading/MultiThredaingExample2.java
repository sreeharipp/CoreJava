package multithreading;
class Musicplayer extends Thread
{
	public void run()
	{
		System.out.println("Music is playing");
	}
}
class MsWord implements Runnable
{
	public void run()
	{
		System.out.println("Typing Ms Word Documnet");
	}
}
public class MultiThredaingExample2
{
	public static void main(String[] args)
	{
	Musicplayer music=new Musicplayer();
	Runnable obj=new MsWord();
	Thread thread1=new Thread(obj);
	music.start();
	thread1.start();
	
	}
}
