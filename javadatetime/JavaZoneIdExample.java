package javadatetime;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.Locale;

public class JavaZoneIdExample 
{
	public static void main(String args[])
	{
		ZoneId zid1=ZoneId.of("Asia/Kolkata");/*A time-zone ID, such as Europe/Paris. 
A ZoneId is used to identify the rules used to convert between an Instant and a LocalDateTime. There are two distinct types of ID: */

		ZoneId zid2=ZoneId.of("Asia/Tokyo");
		LocalTime id1=LocalTime.now(zid1);
		LocalTime id2=LocalTime.now(zid2);
		System.out.println(id1);
		System.out.println(id2);
		System.out.println(id1.isBefore(id2));
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
		String s=zone.getId();
		System.out.println(s);
		System.out.println(zone.getDisplayName(TextStyle.FULL, Locale.ROOT));//Gets the textual representation of the zone, such as 'British Time' or '+02:00'. 
		                                                                     //This returns the textual name used to identify the time-zone ID

	}

}
