package javadatetime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TimeExample2
{
	public static void main(String[] args)
	{
		LocalTime time=LocalTime.now();
		//ISO format
		DateTimeFormatter dtf=DateTimeFormatter.ISO_LOCAL_TIME;
		System.out.println(time.format(dtf));
		
		//Hours of a day(0-23)
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("HH:mm:ss");
		System.out.println(time.format(dtf1));

		//clock hour of am-pm(1-24)
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("kk:mm:ss");
		System.out.println(time.format(dtf2));
		
		//clock hour of am-pm(1-12)
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("hh:mm:ss a");
		System.out.println(time.format(dtf3));
		
		//hour of am-pm (0-11)
		DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("KK:mm:ss a");
		System.out.println(time.format(dtf4));
		ZoneId zone1=ZoneId.of("Asia/Kolkata");
		ZoneId zone2=ZoneId.of("Asia/Tokyo");
		LocalTime time1=LocalTime.now(zone1);
		System.out.println("India time zone : "+time1);
		LocalTime time2=LocalTime.now(zone2);
		System.out.println("Japan time zone : "+time2);
		
		long hours=ChronoUnit.HOURS.between(time1, time2);
		System.out.println("Hours between two time zones: "+hours);
		long minutes=ChronoUnit.MINUTES.between(time1,time2);
		System.out.println("Minutes between two time zones: "+minutes);
		long seconds=ChronoUnit.SECONDS.between(time1,time2);
		System.out.println("Seconds between two time zones: "+seconds);
	}

}
