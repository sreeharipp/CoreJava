package corepackage;
import java.util.*;
public class Main {
	String name;
	String address;
	String contactnumber;
	String email;
	String prooftype;
	String proofid;
	int room[]=new int[25];
	static int id=0;
	public static void main(String[] args)
	{
		Main obj=new Main();
		String c;
		Scanner s=new Scanner(System.in);
		do
		{
		System.out.println("Enter your name");
		obj.name=s.nextLine();
		System.out.println("Enter your Address");
		obj.address=s.nextLine();
		System.out.println("Enter your contact number");
		obj.contactnumber=s.nextLine();
		System.out.println("Enter your email iD");
		obj.email=s.nextLine();
		System.out.println("Enter your proof type");
		obj.prooftype=s.nextLine();
		System.out.println("Enter your proof Id");
		obj.proofid=s.nextLine();
		System.out.println("REGISTRATION");
		System.out.println("==============");
		System.out.println("Name:\t"+obj.name);
		System.out.println("Address:\t"+obj.address);
		System.out.println("Contact number:\t"+obj.contactnumber);
		System.out.println("Proof Type:\t"+obj.prooftype);
		System.out.println("ID number:\t"+obj.proofid);
		System.out.println("Thank You for registering.Your id is"+ ++id);
		System.out.println("DO you want to continue registration(yes/no)");
		c=s.next();
		}while(c=="yes");

			}
	
}
