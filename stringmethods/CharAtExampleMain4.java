package stringmethods;

public class CharAtExampleMain4 
{
	public static void main(String[] args)
	{
		String str="Welcome to FACE portal";
		int count=0;
		for(int i=0;i<str.length();i++)
        {
        	if(str.charAt(i)=='t')
        		count++;
		}
        System.out.println("Frequency of t is:"+count);//prints the frequency of appearance of t
	}

}
