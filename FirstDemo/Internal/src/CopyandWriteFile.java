import java.io.*;
import java.util.Scanner;

public class CopyandWriteFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//FileInputStream reader = new FileInputStream("/Users/maddipati/Documents/Programming/Java/FirstDemo/Internal/src/hi.txt");
		FileOutputStream writer = new FileOutputStream("/Users/maddipati/Documents/Programming/Java/FirstDemo/Internal/src/hi.txt");
		System.out.print("Enter text");
		Scanner s = new Scanner(System.in);
		String text = s.next();
		for(int i=0;i<text.length();i++)
		{
			writer.write((int)text.charAt(i));
		}
		writer.write(2);
		writer.close();
	}

}
