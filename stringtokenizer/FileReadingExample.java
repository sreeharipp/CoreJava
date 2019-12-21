package stringtokenizer;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class FileReadingExample {
	public static void main(String[] args)
	{
		BufferedReader br=null;
		try
		{
			String line;
			br=new BufferedReader(new FileReader("C:\\Users\\user_2\\eclipse-workspace\\Core Java\\src\\stringtokenizer\\Unnamed.txt"));
					while((line=br.readLine())!=null)
					{
						System.out.println(line);
						StringTokenizer stringtokenizer=new StringTokenizer(line,"|");
						while(stringtokenizer.hasMoreElements())
						{
							Integer id=Integer.parseInt(stringtokenizer.nextElement().toString());
							Double price=Double.parseDouble(stringtokenizer.nextElement().toString());
							String username=stringtokenizer.nextElement().toString();
							StringBuilder sb=new StringBuilder();
							sb.append("\nid: "+id);
							sb.append("\nprice: "+price);
							sb.append("\nusername: "+username);
							sb.append("\n*********************\n");
							System.out.print(sb);
						}
					}
					System.out.println("Done");
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(br!=null)
					br.close();
			}
			catch(IOException ex)
			{
				ex.printStackTrace();
			}
		}
	}

}
