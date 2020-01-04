package multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Task implements Runnable
{
	private String name;
	public Task(String name)
	{
		this.name=name;
	}
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				if(i==1)
				{
					Date date=new Date();
					SimpleDateFormat ft=new SimpleDateFormat("hh:mm:ss");
					System.out.println("Time Initialization for Task "+this.name+" is "+ft.format(date));
				}
				else
				{
					Date date=new Date();
					SimpleDateFormat ft=new SimpleDateFormat("hh:mm:ss");
					System.out.println("Time Initialization for Task "+this.name+" is "+ft.format(date));
					
				}
				Thread.sleep(1000);
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		System.out.println(this.name+" completed.");
	}

}
