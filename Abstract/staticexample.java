package Abstract;

public class staticexample {
      static int count=0;
      staticexample()
      {
    	  count++;
    	  System.out.println(count);
      }
      public static void main(String[] args)
      {
    	  staticexample c1=new staticexample();
    	  staticexample c2=new staticexample();
    	  staticexample c3=new staticexample();
    	  
      }
}
