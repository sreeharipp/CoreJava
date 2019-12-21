package stringmethods;

public class COncatExampleMain2
{
	public static void main(String[] args)
	{
		String s1="hello";
		String s2="FACE@2.0";
		String s3="Reader";
		String str4=s1.concat(s2);
		System.out.println(str4);
		String str5=s1.concat(s2).concat(s3);//concatenating multiple strings 
		System.out.println(str5);
	}

}
