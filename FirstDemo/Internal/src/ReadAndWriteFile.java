import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class ReadAndWriteFile {
	public static void main(String args[]) throws FileNotFoundException
	{
		try
		{
			File f1 = new File("/Users/maddipati/Documents/Programming/Java/FirstDemo/Internal/src/hi.txt");
			Scanner s = new Scanner(f1);
			while( s.hasNextLine())
			{
				String data = s.nextLine();
				System.out.println(data);
			}
			s.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println(e);
		}
	}
}
