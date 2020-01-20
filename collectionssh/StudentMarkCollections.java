package collectionssh;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMarkCollections 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		ArrayList<Integer> mark=new ArrayList<Integer>();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			mark.add(s.nextInt());
		}
		System.out.println(mark);
		ArrayList<Integer> copy=new ArrayList<Integer>();
		copy=(ArrayList)mark.clone();
		System.out.println("After sorting");
		Collections.sort(copy);
		System.out.println(copy);
	}

}
