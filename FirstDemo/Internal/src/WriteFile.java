import java.io.*;
public class WriteFile {
	public static void main(String args[])  {
		
	
	try {
		BufferedWriter writer = new BufferedWriter(new FileWriter("hello.txt"));
		writer.write("Hello I am printing from Eclipse");
		writer.write("\nThis is the second line");
		writer.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		BufferedReader reader = new BufferedReader(new FileReader("hello.txt"));
		String line;
		try {
			while((line=reader.readLine())!=null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
}
