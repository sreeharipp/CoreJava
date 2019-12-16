package stringbuilder;

public class StringBuilderExample {
	public static void main(String[] args)
	{
		StringBuilder s1=new StringBuilder("Hello");
		StringBuilder s2=new StringBuilder("world");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.append(s2));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}

}
