package Abstract;
interface abc
{
	void add();
}

public class Anonymous {
	public static void main(String[] args)
	{
		Anonymous obj=new Anonymous();
		abc x=new abc()
				{
			       public void add()
			       {
			    	   System.out.print("This is an Anonymous class");
			       }
				};
		x.add();
		
	}

}
