interface info5
{
	int sum(int x,int y);
}
public class LambdaExp {

	public static void main(String[] args) {
		info5 sum1 = (x,y)-> x+y;
		System.out.print(sum1.sum(10,12));
	}
}
