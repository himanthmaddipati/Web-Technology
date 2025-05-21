package outer;
import inner.*;
public class B {
	
	public int b = 20;
	public static void main(String args[])
	{
		A a = new A();
		System.out.print(a.a);
	}
}

