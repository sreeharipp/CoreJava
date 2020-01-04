package regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExample2 
{
	public static void main(String[] args)
	{
		Pattern pattern=Pattern.compile("Fa[a-z]e");//character class
		Matcher m=pattern.matcher("Fake");
		if(m.find())
			System.out.println("true");
		else
			System.out.println("False");
		System.out.println(pattern.matches("Fa[ac]e", "Fabe"));
		System.out.println(pattern.matches("Do\\[", "Do["));//using escape sequences 
		System.out.println(pattern.matches("Do[\\[\\]]", "Do]"));//using escape sequences 
		System.out.println(pattern.matches("Hi\\d", "Hi5"));//using escape sequences 
		System.out.println(pattern.matches("Hi\\D", "Hi5"));//using escape sequences 
		System.out.println(pattern.matches("Hello\\sWorld", "Hello World"));//using escape sequences 
		System.out.println(pattern.matches("Hi\\SWorld", "Hi5World"));//using escape sequences 
		System.out.println(pattern.matches("Hi\\wWorld", "Hi5World"));//using escape sequences 
		System.out.println(pattern.matches("Hi\\WWorld", "Hi5World"));//using escape sequences 
		Pattern p1=Pattern.compile("\\A[a-zA-Z]");//range of characters from a-z and A-Z and boundary matcher
		Matcher m1=p1.matcher("Be Strong");
		while(m1.find())
			System.out.println(m1.group());
	}

}
