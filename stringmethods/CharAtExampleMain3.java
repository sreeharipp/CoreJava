package stringmethods;

public class CharAtExampleMain3 
{
	public static void main(String[] args)
	{
		String str="Welcome to FACE portal";
		int strlength=str.length();
		System.out.println("Character at first Index is:"+str.charAt(1));//prints e
		System.out.println("Character at last index is:"+str.charAt(strlength-1));//prints l
	}

}
