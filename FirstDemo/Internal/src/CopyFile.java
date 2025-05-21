import java.io.*;

public class CopyFile {
	
	public static void main(String args[])
	{
		
		FileReader in = null;
		FileWriter out = null;
		try
		{
			in = new FileReader("/Users/maddipati/Documents/Programming/Java/FirstDemo/Internal/src/hi.txt");
			out = new FileWriter("/Users/maddipati/Documents/Programming/Java/FirstDemo/Internal/src/hi.txt");
			int c;
			while((c=in.read())!=-1) {
				System.out.println((char)c);
			}
			out.write("This is the modifed statements");
		}
		catch(IOException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
