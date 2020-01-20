package javadatetime;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeExample2 
{
	public static void main(String[] args)
	{
		LocalDate localdate1=LocalDate.of(2019,Month.JANUARY,01);
		LocalDate localdate2=LocalDate.of(2020,Month.FEBRUARY,01);
		
		//number of days in a month
		System.out.println("Number of days in "+localdate1.getMonth()+" : "+localdate1.lengthOfMonth());
		System.out.println("Number of days in "+localdate2.getMonth()+" : "+localdate2.lengthOfMonth());
		
		//number of days in a year
		System.out.println("Number of days in "+localdate1.getYear()+" : "+localdate1.lengthOfYear());
		System.out.println("Number of days in "+localdate2.getYear()+" : "+localdate1.lengthOfYear());
		if(localdate1.isLeapYear())
			System.out.println(localdate1.getYear()+" is a leap year");
		else
			System.out.println(localdate1.getYear()+" is not a leap year");
		if(localdate2.isLeapYear())
			System.out.println(localdate2.getYear()+" is a leap year");
		else
			System.out.println(localdate2.getYear()+" is not a leap year");
			
	}

}
