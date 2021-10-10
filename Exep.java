import java.io.IOException;
class Example
{
   int a;
   String s;
   public void getValue() throws IOException
   {
   	  System.out.println("  a = "+a);
   	  System.out.println("  s = "+s);
   	  throw new IOException();
   }
}

class Ex extends Example
{
	int x;
	String st;
	public void getValue()
	{
         System.out.println(" x = "+x);
         System.out.println(" st = "+st);
	}

	public static void main(String arg[]) 
	{
       Ex ex = new Ex();

       try{

       ex.getValue();

          }
          catch(ArithmeticException e)
          {
          	System.out.println(" this is an Exception ");
          }

         

         try 
         {

         ex.getValue(); 

         }
         catch(IOException e) 
         {
         	System.out.println(e);
         }

        System.out.println("  Program continue");  
	}
}