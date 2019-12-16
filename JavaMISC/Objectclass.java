package JavaMISC;

public class Objectclass {
	static int last_roll=100;
	int rollno;
	//constructor
		Objectclass()
		{
		rollno=last_roll;
		last_roll++;
		
		}
			public int hashCode()
			{
				return rollno;
			}
	public static void main(String[] args)
	{
		Objectclass s=new Objectclass();
		System.out.println(s);
		System.out.println(s.toString());
		Object obj=new String("FACE");
		Class c=obj.getClass();
		System.out.println("Class of object is:"+ c.getName());
		s=null;
		System.gc();
	}
	protected void finalize()
	{
		System.out.println("Finalized method called");
	}

}
