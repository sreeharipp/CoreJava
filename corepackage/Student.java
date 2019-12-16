package corepackage;

interface Family
{
	String name="sreehari";
	int n=7;
	public void  details();
}
interface College
{
	int rno=40;
	String dept="Mechanical Engineering";
	String cname="GEC THRISSUR";
	public void professional();
}
 class Mn implements Family,College
 {
	public void details()
	{
		System.out.println("My name:\t"+name);
		System.out.println("My Rollnumber:\t"+rno);
		
	}
	public void professional()
	{
		System.out.println("My department:\t"+dept);
		System.out.println("My college:\t"+cname);
		System.out.println("Number of members in my family:\t"+n);
	}
 }
 class Student
 {		public static void main(String[] args)
		{
			Mn obj=new Mn();
			obj.details();
			obj.professional();
		}
}