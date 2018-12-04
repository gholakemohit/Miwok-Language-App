
class Thread2
{
  public static void main(String []args)
  {
    System.out.println("Main Starts");
    CThread1 a=new CThread1("A",5);
    CThread1 b=new CThread1("B",7);
    CThread1 c=new CThread1("C",9);
  }
}

class CThread1 extends Thread
{
  int cnt;
  String nm;
  CThread1(String tnm,int n)
  {
    super(tnm);
    cnt=n;
    nm=tnm;
    start();
  }
  public void run()
  {
    int i=1;
    while(i<cnt)
    {
      System.out.println(nm+" "+ i);
      try
      {
        Thread.sleep(1000);

      }
      catch(Exception e)
      {

      }
      i++;
    }
  }
}
