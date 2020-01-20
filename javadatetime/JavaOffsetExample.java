package javadatetime;

import java.time.OffsetTime;
import java.time.temporal.ChronoField;

public class JavaOffsetExample 
{
	public static void main(String[] args)
	{
		OffsetTime off=OffsetTime.now();
		int h=off.get(ChronoField.CLOCK_HOUR_OF_DAY);
		System.out.println(h);
		int m=off.get(ChronoField.MINUTE_OF_DAY);
		System.out.println(m);
		int s=off.get(ChronoField.SECOND_OF_DAY);
		System.out.println(s);
		int h1=off.getHour();
		System.out.println(h1+"Hour");
		int m1=off.getMinute();
		System.out.println(m1+"MInutes");
		int s1=off.getSecond();
		System.out.println(s1+"seconds");
	}

}
