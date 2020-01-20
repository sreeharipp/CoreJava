package javadatetime;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.Temporal;

public class JavaZoneOffsetExample 
{
	public static void main(String[] args)
	{
		ZoneOffset z1=ZoneOffset.UTC;//A ZoneOffset represents the period of time that local time differs from UTC/Greenwich.
		Temporal temp=z1.adjustInto(ZonedDateTime.now());
        System.out.println(temp);
        ZoneOffset z2=ZoneOffset.ofHours(5);
        System.out.println(z2);
        ZoneOffset z3=ZoneOffset.ofHoursMinutes(5,30);
        System.out.println(z3);
        boolean b1=z1.isSupported(ChronoField.OFFSET_SECONDS);//A ZoneOffset represents the period of time that local time differs from UTC/Greenwich.
        //(isSupported)This checks if this offset can be queried for the specified field. If false, then calling the range and get methods will throw an exception. 
        System.out.println(b1);
        boolean b2=z1.isSupported(ChronoField.SECOND_OF_MINUTE);//This counts the second within the minute, from 0 to 59. This field has the same meaning for all calendar systems. 
        System.out.println(b2);
	}

}
