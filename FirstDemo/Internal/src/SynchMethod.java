class Counter1{
	int count;
	public void increment() {
		count++;
	}
}

public class SynchMethod {
	public static void main(String args[])
	{
		final Counter1 c = new Counter1();
		new Thread() {
			public void run()
			{
				for(int i=1;i<=1000;i++)
					c.increment();
			}
		}.start();
		new Thread() {
			public void run()
			{
				for(int i=1;i<=1000;i++)
					c.increment();
			}
		}.start();
		
		System.out.println(c.count);
	}
}
