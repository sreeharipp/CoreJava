package javadatetime;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class InstantDayofWeekEnumExample 
{
	public static void main(String[] args)
	{
		Instant i=Instant.parse("2020-01-06T10:37:30.00Z");
		System.out.println(i);
		Instant i1=Instant.now();
		System.out.println(i1);
		Instant in=Instant.parse("2020-01-06T11:25:30.00Z");
		in=in.minus(Duration.ofDays(125));
		System.out.println(in);
		Instant in1=Instant.parse("2020-01-06T11:25:30.00Z");
		Instant in2=in1.plus(Duration.ofDays(125));
		System.out.println(in2);
		System.out.println(in.isSupported(ChronoUnit.DAYS));
		System.out.println(in.isSupported(ChronoUnit.YEARS));
		LocalDate ld=LocalDate.of(2020,Month.JANUARY,06);
		DayOfWeek dow=DayOfWeek.from(ld);
		System.out.println(dow.get(ChronoField.DAY_OF_WEEK));
		DayOfWeek d1=DayOfWeek.of(4);
		System.out.println(d1.name());
		System.out.println(d1.ordinal());
		System.out.println(d1.getValue());
		LocalDate date=LocalDate.of(2020, Month.JANUARY,06);
		DayOfWeek d2=DayOfWeek.from(date);
		System.out.println(d2.getValue());
		d2=d2.plus(3);
		System.out.println(d2.getValue());
		d2=d2.minus(3);
		System.out.println(d2.getValue());
		
	}

}
