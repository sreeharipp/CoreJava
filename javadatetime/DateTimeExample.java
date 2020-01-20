package javadatetime;

import java.time.LocalDate;
import java.time.Month;

public class DateTimeExample 
{
	public static void main(String[] args)
	{
		//current date
		LocalDate localdate=LocalDate.now();
		System.out.println("Today's Date is: "+localdate);
		
		//specific date
		LocalDate localdate2=LocalDate.of(2020,Month.JANUARY, 02);
		System.out.println(localdate2);
		LocalDate localdate3=LocalDate.of(1997, Month.MARCH, 26);
		System.out.println(localdate3);
		System.out.println("Year : "+localdate.getYear());
		System.out.println("Month : "+localdate.getMonth().getValue());
		System.out.println("Day of Month : "+localdate.getDayOfMonth());
		System.out.println("DAy of week : "+localdate.getDayOfWeek());
		System.out.println("DAy of Year : "+localdate.getDayOfYear());
		
		//Localdate's plus methods
		System.out.println("Addition of days : "+localdate.plusDays(5));
		System.out.println("Addition of months : "+localdate.plusMonths(15));
		System.out.println("Addition of weeks : "+localdate.plusWeeks(45));
		System.out.println("Addition of YEars : "+localdate.plusYears(5));
		
		//LocalDate's minus Methods
		System.out.println("Subtraction of days: "+localdate.minusDays(5));
		System.out.println("Subtraction of months: "+localdate.minusMonths(15));
		System.out.println("Subtraction of weeks: "+localdate.minusWeeks(45));
		System.out.println("Subtraction of years: "+localdate.minusYears(5));
		
		//isEqual example
		if(localdate.isEqual(localdate3))
		{
			System.out.println("localdate1 and localdate3 are equal");
		}
		else
			System.out.println("localdate1 and localdate3 are not equal");
		
		//ifAfter example
		if(localdate.isAfter(localdate2))
			System.out.println("localdate2 comes after localdate2");
		
		//isBefore example
		if(localdate3.isBefore(localdate))
			System.out.println("localdate3 comes before localdate2");
		
	}

}
