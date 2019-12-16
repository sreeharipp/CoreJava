package corepackage;

import java.util.Scanner;

public class Encapsulation {

	public static void main(String args[])
	{
	setandget1 obj=new setandget1();
	String c;
	Scanner s=new Scanner(System.in);
	do
	{
	System.out.println("Enter your name");
	obj.setname(s.nextLine());
	System.out.println("Enter your Address");	
	obj.setaddress(s.nextLine());
	System.out.println("Enter your contact number");
	obj.setcontactnumber(s.nextLine());
	System.out.println("Enter your email iD");
	obj.email=s.nextLine();
	System.out.println("Enter your proof type");
	obj.setprooftype(s.nextLine());
	System.out.println("Enter your proof Id");
	obj.setproofid(s.nextLine());
	System.out.println("REGISTRATION");
	System.out.println("==============");
	System.out.println("Name:\t"+obj.getname());
	System.out.println("Address:\t"+obj.getaddress());
	System.out.println("Contact number:\t"+obj.getcontactnumber());
	System.out.println("Proof Type:\t"+obj.getprooftype());
	System.out.println("ID number:\t"+obj.getproofid());
	System.out.println("Thank You for registering.Your id is "+ ++setandget.id);
	System.out.println("DO you want to continue registration(yes/no)");
	c=s.next();
	}while(c=="yes");

}
}
 class setandget1 {
	String name;
	String address;
	String contactnumber;
	String email;
	String prooftype;
	String proofid;
	int room[]=new int[25];
	static int id=0;
	void setname(String name)
	{
		this.name=name;
	}
	void setaddress(String address)
	{
		this.address=address;
	}
	void setcontactnumber(String contactnumber)
	{
		this.contactnumber=contactnumber;
	}
	void setemail(String email)
	{
		this.email=email;
	}
	void setprooftype(String prooftype)
	{
		this.prooftype=prooftype;
	}
	void setproofid(String proofid)
	{
		this.proofid=proofid;
	}
	String getname()
	{
		return name;
	}
	String getaddress()
	{
		return address;
	}
	String getcontactnumber()
	{
		return contactnumber;
	}
	String getemail()
	{
		return email;
	}
	String getprooftype()
	{
		return prooftype;
	}
	String getproofid()
	{
		return proofid;
	}
 }


