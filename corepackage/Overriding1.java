package corepackage;

import java.util.Scanner;
class Override {
	int add(int a,int b)
	{
		return a+b;
	}

}
class Overriding1 extends Override {
	int add(int a,int b)
	{
		int d=super.add(a,b);
		return a+b+10;
		
	}
	public static void main(String[] args)
	{

		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		Overriding1 obj=new Overriding1();
		Override o=new Override();
		int c=obj.add(a, b);
		int d=o.add(a, b);
		System.out.print(d+c);
		s.close();

}
}
