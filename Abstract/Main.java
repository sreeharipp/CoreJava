package Abstract;
import java.util.*;
public class Main
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		Inheritedinterface obj=new Inheritedinterface();
		obj.add(a,b);
		obj.subtract(a,b);
		obj.multiply(a,b);
		obj.division(a,b);
		s.close();
	}
}