import java.lang.*;
import java.util.*;


 class Main
{
  static int num;
  
  void input()
  {
     Scanner sc = new Scanner(System.in);
  	 num = sc.nextInt();
  }

   void print()
  {
  	System.out.println(num+10);
  }

   public static void main(String arg[])
   {
  	 Main m1 = new Main(); 
     m1.input();
     m1.print();
   }

 }

 

