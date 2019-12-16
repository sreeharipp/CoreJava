package corepackage;
import java.util.*;
public class child extends parent {
	int a,b;

	void add()
	{
		System.out.println("Enter the numbers");
		this.a=s.nextInt();
		this.b=s.nextInt();
		System.out.println(a+b+10);
	}
	public static void main(String[] args)
	{
		parent obj=new child();
		parent ob=new parent();
		obj.add();
		ob.add();
	}
}
