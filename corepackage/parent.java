package corepackage;
import java.util.*;
public class parent {
	int a,b;
	Scanner s=new Scanner(System.in);
	void add()
	{
		System.out.println("Enter the numbers");
		this.a=s.nextInt();
		this.b=s.nextInt();
		System.out.print(a+b);
	}

}
