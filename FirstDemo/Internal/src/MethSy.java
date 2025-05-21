class Print
{
	public synchronized void print()
	{
		for(int i=1;i<=10;i++)
			System.out.print(i+" ");
		try {
			Thread.sleep(100);
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
}
public class MethSy {
	public static void main(String args[])
	{
		
		final Print c  = new Print();
		Thread t1 = new Thread() {
			public void run() {
				c.print();
			}
		};
		Thread t2 = new Thread()
		{
			public void run()
			{
				c.print();
			}
		};
	//	
		t1.start();
		t2.start();
	}
}
