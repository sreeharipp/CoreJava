package javadatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;
import java.time.temporal.TemporalAdjusters;

public class MothEnumExample 
{
	public static void main(String[] args)
	{
		Month m=Month.valueOf("January".toUpperCase());
		System.out.printf("For the month of %s all sunday are:%n",m);
		LocalDate ld=Year.now().atMonth(m).atDay(1).with(TemporalAdjusters.firstInMonth(DayOfWeek.SUNDAY));//firstInmonth searches for the first occurrence of the parameter and returns that date
		Month mi=ld.getMonth();
		while(mi==m)
		{
			System.out.printf("%s%n",ld);
			ld=ld.with(TemporalAdjusters.next(DayOfWeek.SUNDAY));//Returns the next day-of-week adjuster, which adjusts the date to the first occurrence of the specified day-of-week after the date being adjusted. 
			mi=ld.getMonth();
			
		}
		Month m1=Month.from(LocalDate.now());
		System.out.println(m1.getValue());
		System.out.println(m1.name());
		System.out.println(m1.minus(2));
		System.out.println(m1.plus(2));
		System.out.println("Total Number of days"+m1.length(true));
		
	}

}
