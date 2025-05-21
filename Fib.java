import java.util.*;

public class Fib
{
 public static void main(String []args)
 {
  Scanner input = new Scanner(System.in);
  System.out.println("Enter number of fibonacci series numbers to be printed");
  int n = input.nextInt();
  int a =0;
  int b = 1;
  int c = a+b;
  System.out.println("The fibonacci series is");
  System.out.print(a);
  System.out.print(b);
  System.out.print(c);
  for(int i=3;i<=n;i++)
  {
   a = b;
   b = c;
   c = a+b;
   System.out.print(c);
  }
 }
}