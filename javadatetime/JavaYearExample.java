package javadatetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class JavaYearExample 
{
	public static void main(String[] args)
	{
		Year y1=Year.now();//Year is an immutable date-time object that represents a year
		System.out.println(y1);
		Year y2=Year.of(2020);
		LocalDate l=y2.atDay(100);
		System.out.println(l);
		System.out.println(y2.length());
		System.out.println(y2.isLeap());
		YearMonth y=YearMonth.now();//YearMonth is an immutable date-time object that represents the combination of a year and month
		System.out.println(y);
		String s=y.format(DateTimeFormatter.ofPattern("MM yyyy"));
		System.out.println(s);
		long l1=y.get(ChronoField.YEAR);
		System.out.println(l1);
		long l2=y.get(ChronoField.MONTH_OF_YEAR);
		System.out.println(l2);
		YearMonth ym=y.plus(Period.ofYears(2));//Period:This class models a quantity or amount of time in terms of years, months and days.
		System.out.println(ym);
		YearMonth ym1=y.minus(Period.ofYears(2));
		System.out.println(ym1);
		
	}

}
