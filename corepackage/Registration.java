package corepackage;

public class Registration {

	String name;
	String address;
	String contactnumber;
	String email;
	String prooftype;
	String proofid;
	int room[]=new int[25];
	Registration(String name,String address,String contactnumber,String email,String prooftype,String proofid)
	{
		this.name=name;
		this.address=address;
		this.contactnumber=contactnumber;
		this.email=email;
		this.prooftype=prooftype;
		this.proofid=proofid;
	}
	void reg()
	{
		System.out.println("REGISTRATION");
		System.out.println("==============");
		System.out.println("Name:\t"+this.name);
		System.out.println("Address:\t"+this.address);
		System.out.println("Contact number:\t"+this.contactnumber);
		System.out.println("Proof Type:\t"+this.prooftype);
		System.out.println("ID number:\t"+this.proofid);
		System.out.println("Thank You for registering.Your id is "+ ++Mainreg.id);
		
	}

}
