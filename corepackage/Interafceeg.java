package corepackage;

interface it1
{
	void method1();
	void method2();
	void method3();
}
	public class Interafceeg implements it1 {
		public void method1()
		{
			System.out.println("Method 1");
		}
		public void method2() {
		System.out.println("Mrthod 2");}
		public void method3()
		{
			System.out.println("method 3");}

		public static void main(String args[])
		{
			it1 t=new Interafceeg();
			t.method1();
			t.method2();
			t.method3();
		}
	}


