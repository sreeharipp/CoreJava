package collectionssh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class CopyInsatnceExample 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		LinkedList<String>list=new LinkedList<String>();
		for(int i=0;i<n;i++)
		{
			list.add(s.next());
		}
		int n1=s.nextInt();
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=0;i<n1;i++)
		{
			arr.add(s.next());
		}
		System.out.println("Actual LinkedList: "+list);
		list.addAll(arr);
		System.out.println("After copy: "+list);
		
		
	}

}
