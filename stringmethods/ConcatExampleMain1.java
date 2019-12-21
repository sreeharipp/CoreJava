package stringmethods;

public class ConcatExampleMain1 
{
	public static void main(String[] args)
	{
		String s1="java string";
		s1.concat("is immutable");//string is immutable
		System.out.println(s1);
		s1=s1.concat(" is immutable so assign is explicitly");
		System.out.println(s1);
	}

}
