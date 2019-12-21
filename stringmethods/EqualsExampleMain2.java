package stringmethods;
import java.util.ArrayList;
public class EqualsExampleMain2 
{
	public static void main(String[] args)
	{
		String str1="FACENXT";
		ArrayList<String> list=new ArrayList<>();//creating array list
		list.add("FACE");//adding elements to list
		list.add("FACEPREP");
		list.add("FACENXT");
		list.add("FACENOW");
		for(String str : list)//foreach array
		{
			if(str.contentEquals(str1))
				System.out.println("FACENXT is present");
		}
	}

}
