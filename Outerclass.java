class Outerclass 
{
   void my_Method()
   {
      final int num = 23;
      class MethodInner_Demo
      {
         public void print() 
         {
            System.out.println("This is method inner class ");	   
         }   
      }
      MethodInner_Demo inner = new MethodInner_Demo();
      inner.print();
   }
   public static void main(String args[]) 
   {
      Outerclass outer = new Outerclass();
 //MethodInner_Demo inner = new MethodInner_Demo();
      outer.my_Method();	   	   
   }
}