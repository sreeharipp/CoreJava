package corepackage;
import java.util.Scanner;
public class Mainreg {

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
			Registration ob=new Registration(obj.name,obj.address,obj.contactnumber,obj.email,obj.prooftype,obj.proofid);
			ob.reg();
			System.out.println("DO you want to continue registration(yes/no)");
			c=s.nextLine();
			}while(c.contentEquals("yes"));
			

}
		}

