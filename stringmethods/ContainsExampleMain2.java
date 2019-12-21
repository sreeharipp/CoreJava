package stringmethods;

public class ContainsExampleMain2 
{
	public static void main(String[] args)
	{
		String str="Hello F#A#C#E@2.0 readers";
		boolean isContains=str.contains("F#A#C#E");//creating a boolean variable to store the return value of contains
		System.out.println(isContains);
		System.out.println(str.contains("FACe"));//case sensitive
	}

}
