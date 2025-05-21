class Print1
{
	public void print() {
		synchronized(this) {
			for(int i=1;i<=10;i++)
			{
				System.out.print(i+" ");
				try{
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					
				}		
			}
		}
	}
}
public class StaticBloc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Print1 c  = new Print1();
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
