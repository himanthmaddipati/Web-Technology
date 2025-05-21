class info extends Thread
{
  String tname;
  info(String tn)
  {
    super(tn);
    System.out.println("child created");
    tname=tn;
    start();
  }
public void run()
{
  try
  {
    for(int i=101;i<=110;i++)
    {
      System.out.println(tname+" "+i);
      sleep(500);
    }
  }
  catch(Exception e)
  {
    System.out.println("interupted");
  }
 }
}
class threadex2
{
  public static void main(String[]args)
  {
    System.out.println("main thread created");
    info ob=new info("child");
    try
    {
      for(int n=501;n<=510;n++)
      {
        System.out.println("main"+n);
        Thread.sleep(1000);
      }
    }
    catch(Exception e)
    {
      System.out.println("exception");
    }  
  }
}