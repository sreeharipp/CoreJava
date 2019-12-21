package stringmethods;

public class ConcatExampleMain3
{
	public static void main(String[] args)
	{
	String str1="hello";
	String str2="FACE@2.0";
	String str3="REader";
	String str4=str1.concat(" ").concat(str2).concat(" ").concat(str3);//concatenating spaces
	System.out.println(str4);
	String str5=str1.concat("!!!");//concatenating special characters
	System.out.println(str5);
	String str6=str1.concat("@").concat(str2);//concatenating special characters
    System.out.println(str6);
	}
}
