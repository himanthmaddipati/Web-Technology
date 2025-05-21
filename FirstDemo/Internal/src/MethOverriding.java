class Hello
{
	public void hey()
	{
		System.out.println("Hey from Hello class");
	}
}
class Hi extends Hello
{
	public void hey()
	{
		System.out.println("Hi from Hi class ");
	}
}
public class MethOverriding {

	public static void main(String[] args) {
		Hi boy = new Hi();
		Hello girl = new Hello();
		boy.hey();
		girl.hey();
		
	}

}
