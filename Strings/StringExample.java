package Strings;

public class StringExample {
	public static void main(String[] args)
	{
		String str="I,am,going,to,split,this,string,by,space";
		String[] str1=str.split(",");
		for(String a:str1)
			System.out.print(a);
	}

}
