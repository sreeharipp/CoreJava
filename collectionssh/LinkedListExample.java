package collectionssh;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample 
{
	public static void main(String[] args)
	{
		LinkedList<String> list=new LinkedList<String>();
		list.add("Competition");
		list.add("Be positive");
		list.add("Happy day");
		Iterator<String> i=list.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
	
	
	


