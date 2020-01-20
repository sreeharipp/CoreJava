package javadatetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeExample3 
{
	public static void main(String[] args)
	{
		//ISO Date
		LocalDate localdate=LocalDate.now();
		DateTimeFormatter dtf=DateTimeFormatter.ISO_LOCAL_DATE;
		System.out.println(localdate.format(dtf));
		
		//YYYY/MM//DD pattern
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("yyyy/MM/dd");
		System.out.println(localdate.format(dtf1));
		
		//MM,DD,YYYY pattern
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MM,dd,yyyy");
		System.out.println(localdate.format(dtf2));
		
		//DD-MM-YYYY pattern
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("MM-dd-yyyy");
		System.out.println(localdate.format(dtf3));
		
		//DD-LL-YYYY pattern
		DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("DD-LL-YYYY");
		System.out.println(localdate.format(dtf4));
		
	}

}
