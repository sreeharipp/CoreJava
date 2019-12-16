package Abstract;
import java.util.Scanner;
public class Boss {
	public static void main(String args[])
	{
	   Scanner s=new Scanner(System.in);
	   int a=s.nextInt();
	   int b=s.nextInt();
	   Abstractclass obj=new Inheritance();
	   obj.add(a,b);
	   obj.subtract(a,b);
	   s.close();
     }
}
