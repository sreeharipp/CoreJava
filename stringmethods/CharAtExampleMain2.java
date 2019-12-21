package stringmethods;

public class CharAtExampleMain2 
{
    public static void main(String[] args)
    {
	String name="FACE@2.0";
	char ch=name.charAt(10);//returns the char value at the 10th index.
	System.out.println(ch);//gives exception indexoutofBounds
    }
}
