package stringmethods;

public class CompareToExampleMain2
{
	public static void main(String[] args)
	{
		String s1="helllo";
		String s2="";
		String s3="me";
		System.out.println(s1.compareTo(s2));//compares hello and null string.returns length of s1.
		System.out.println(s1.compareTo(s3));//compares hello and me
	}

}
