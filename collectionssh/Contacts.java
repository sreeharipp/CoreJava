package collectionssh;

import java.util.ArrayList;
import java.util.Scanner;

 class Contact
{
	private String name;
	private String phoneNumber;
	Scanner s=new Scanner(System.in);
	
	public void setName()
	{
		this.name=s.next();
	}
	public void setphoneNumber()
	{
		this.phoneNumber=s.next();
	}
	public String getName()
	{
		return name;
	}
	public String getphoneNumber()
	{
		return phoneNumber;
	}
}
public class Contacts
{
	public static void main(String[] args)
	{
		ArrayList<Contact> contact=new ArrayList<Contact>();
		Contact ob1=new Contact();
		ob1.setName();ob1.setphoneNumber();
		contact.add(ob1);
		Contact ob2=new Contact();
		ob2.setName();ob2.setphoneNumber();
		contact.add(ob2);
		for(Contact l:contact)
		{
			System.out.printf(l.getName());
			System.out.println();
		}
		int a[]=new int[] {2,2,2,2,2};
		
		}
		
		
	}
	
