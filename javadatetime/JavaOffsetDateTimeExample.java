package javadatetime;

import java.time.OffsetDateTime;

public class JavaOffsetDateTimeExample
{
	public static void main(String[] args)
	{
		OffsetDateTime odt=OffsetDateTime.now();
		System.out.println(odt.getDayOfMonth());//day of month
		System.out.println(odt.getDayOfYear());
		System.out.println(odt.getDayOfWeek());
		System.out.println(odt.toLocalDate());
		OffsetDateTime value1=odt.minusDays(240);//subtracting 240 days
		System.out.println(value1);
		OffsetDateTime value2=odt.plusDays(240);//adding 240 days
		System.out.println(value2);
	}

}
