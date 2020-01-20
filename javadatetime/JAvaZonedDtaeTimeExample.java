package javadatetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class JAvaZonedDtaeTimeExample 
{
	public static void main(String[] args)
	{
		ZonedDateTime zone=ZonedDateTime.parse("2020-01-03T10:00:10+05:30[Asia/Calcutta]");
		System.out.println(zone);
		LocalDateTime ldt=LocalDateTime.of(2020,Month.JANUARY,03,10,26);
		ZoneId india=ZoneId.of("Asia/Kolkata");
		ZonedDateTime zone1=ZonedDateTime.of(ldt,india);
		System.out.println("In india Central Time Zone Is: "+zone1);
		ZoneId tokyo=ZoneId.of("Asia/Tokyo");
		ZonedDateTime zone2=zone1.withZoneSameInstant(tokyo);
		System.out.println("In tokyo cental time zone is: "+zone2);
		ZonedDateTime zone3=ZonedDateTime.now();
		System.out.println(zone3.getZone());
		ZonedDateTime m=zone3.minus(Period.ofDays(126));
		System.out.println(m);
		ZonedDateTime p=zone3.plus(Period.ofDays(126));
		System.out.println(p);
	}

}
