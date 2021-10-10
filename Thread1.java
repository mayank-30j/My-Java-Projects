class Ex implements Runnable
{
   public void run()
   {

   	for(int i =1;i<=10;i++)
   	{
   		System.out.println("i = "+i+" Class Ex ");
   		if(i==3 || i==4 || i==6)
   		{ 
   			try{
           Thread.sleep(2000);
       }catch(InterruptedException e)
         {
            System.out.println(e);
         }
   		}
   	}

   }

}
class St implements Runnable
  {
     public void run() 
     {
     	for(int i =1;i<=10;i++)
     	{
              System.out.println("i = "+i+"Class st");
              try{
              Thread.sleep(3000);
          }catch(InterruptedException e)
          {
          	System.out.println(e);
          }
     	}
     }
  }     

class result
{
	public static void main(String arg[]) throws InterruptedException
	{

      Thread th1 = new Thread(new Ex());
      Thread th2 = new Thread(new St());

      th1.start();
      th2.start();
      
	}
}
