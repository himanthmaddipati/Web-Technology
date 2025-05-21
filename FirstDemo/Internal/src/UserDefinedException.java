class HimanthException extends Exception
{
	HimanthException(String string)
	{
		super(string);
	}
}
public class UserDefinedException {
	public static void main(String args[])
	{
		int a=0;
		int b = 10;
		try
		{
			int ans = a/b;
			if(ans==0)
				throw new HimanthException("Dont give me 0 as answer");
		}
		catch(HimanthException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong"+e);
		}
	}
}
