
class A extends Thread
{
	Counter c;
	A(Counter c)
	{
		this.c = c;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			c.increment();
		}
	}
}

class B extends Thread
{
	Counter c;
	B(Counter c){
		this.c = c;
	}
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			c.increment();
		}
	}
}

class Counter{
	int count;
	public void increment()
	{
		count++;
	}
}
public class SynchMeth {
	public static void main(String args[])
	{
		Counter c = new Counter();
		A t1 = new A(c);
		B t2 = new B(c);
		t1.start();
		t2.start();
		
		System.out.print(c.count);
	}
}
