class Customer
{
	int amount = 10000;
	synchronized void withdraw(int amount)
	{
		System.out.println("Going to withdraw");
		if(this.amount<amount) {
			System.out.println("Insufficient Money, Waiting for deposit");
			try {
				wait();
			}
			catch(Exception e) { }
			this.amount -= amount;
			System.out.println("Withdraw Completed");
		}
	}
	
	synchronized void deposit(int amount)
	{
		System.out.println("Depositing money");
		this.amount+=amount;
		System.out.println("Money deposited");
		notify();
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final Customer c = new Customer();
		new Thread() {
			public void run(){c.withdraw(15000);}
		}.start();
		new Thread() {
			public void run(){c.deposit(10000);}
		}.start();
	}

}
