class Thread2 extends Thread
{

  public void run()
  {
     for(int i=0;i<=5;i++)
     {
      System.out.println("Thread 2 class");
     }
  }
}

class Thread3 extends Thread
{
	public void run()
	{
		for(int i =1;i<=5;i++)
			{
			  System.out.println("Thread3 class");
			}
	}
}


class result
{
	public static void main(String arg[])
	{
		Thread2 th2 = new Thread2();
		Thread3 th3 = new Thread3();

		th2.start();
		th3.start();
	}
}