package corepackage;
import java.util.*;
public class overloading {
 void area(int a,int b)
	{
		System.out.println("Area of the rectangle\t"+a*b);
	}

void area(int a)
	{
		System.out.println("Area of the Square\t"+a*a);
	}
	void area(float r)
	{
		System.out.println("Area of the rectangle\t"+(3.14*r*r));
	}
	void area(int a,int b,int c)
	{
		float s=(a+b+c)/2;
		System.out.println("Area of the rectangle\t"+Math.sqrt(s*(s-a)*(s-b)*(s-c)));
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int d,a,b,c;
		float r;
		overloading obj=new overloading();
		System.out.println("MENU");
		System.out.println("1.Rectangle");
		System.out.println("2.Square");
		System.out.println("3.Circle");
		System.out.println("4.Triangle");
		d=s.nextInt();
		switch(d)
		{
		case 1:
			System.out.println("Enter the length and breadth of a rectangle");
		    a=s.nextInt();
		     b=s.nextInt();
		     obj.area(a,b);
		     break;
			case 2:
				System.out.println("Enter the side of the square");
			    a=s.nextInt();
			 obj.area(a);
			 break;
			case 3:
				System.out.println("Enter the radius of the Circle");
			    r=s.nextFloat();
			    obj.area(r);
			    break;
			case 4:
				System.out.println("Enter the sides of a triangle");
			    a=s.nextInt();
			     b=s.nextInt();
			     c=s.nextInt();
			     obj.area(a,b,c);
			     break;
				default:
					System.out.println("Invalid input");
				   
		}
		
		
	}
}
