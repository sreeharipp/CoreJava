package Strings;

public class Stringclass 
{
      public static void main(String[] args)
      {
    	  String s1,s2;
    	  s1=new String("shreyas");
    	  s2=new String("shreyas");
    	  System.out.println(s1);
    	  System.out.println(s2); 
    	  System.out.println(s1==s2);
    	  System.out.println(s1.hashCode());
    	  System.out.println(s1.hashCode());
    	  s2=s1+s2;
    	  System.out.println(s1.equals(s2));
    	  System.out.println(s1);
    	  System.out.println(s2);
    	  System.out.println(s1.hashCode());
    	  System.out.println(s2.hashCode());
      }
}
