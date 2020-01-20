package javadatetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeExample1
{
	public static void main(String[] args)
	{
		//current time
		LocalTime time=LocalTime.now();
		System.out.println(time);
		LocalDate dtf=LocalDate.now();
		DateTimeFormatter date=DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(dtf.format(date));
		
		//specific time
		LocalTime time1=LocalTime.of(4,30,45);
		System.out.println(time1);
		System.out.println("Hour : "+time1.getHour());
		System.out.println("Minute : "+time1.getMinute());
		System.out.println("Second : "+time1.getSecond());
		
		//plus methods
		System.out.println("Hour : "+time1.plusHours(2));
		System.out.println("Minute : "+time1.plusMinutes(30));
		System.out.println("Second : "+time1.plusSeconds(6000000));
		
		//mInus methods
		System.out.println("Hour : "+time1.minusHours(3));
		System.out.println("Minute : "+time1.minusMinutes(45));
		System.out.println("Second : "+time1.minusSeconds(500000));
		
		LocalTime time2=LocalTime.of(8,36,56);
		System.out.println(time2);
		
		//compareTo example
		if(time.compareTo(time2)==0)
		{
			System.out.println("time1 and time 2 are equal");
		}
		else
			System.out.println("time1 and time2 are not equal");
		
		LocalTime time3=LocalTime.of(12,56,13);
		//isBefore example
		if(time.isBefore(time3))
		{
			System.out.println("time1 comes before time3");
		}
		
		//isAfter example
		if(time.isAfter(time2))
		{
			System.out.println("time1 comes after time2");
		}
	}

}
