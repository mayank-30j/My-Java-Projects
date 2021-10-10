import java.util.*;
import java.lang.*;

class data
{
	static int i=10;         //Static variable
	int j=20;                //instance variables
 

    static void show()      //Static method
  { 
     System.out.println(i);  
  }   
   
  
   void disp()            //instance method
  {
  	  i = 5; 
      System.out.println(j);  
      show();
  }

  /*
  public static void main(String ar[])
  {
        data ob;
        ob = new data();
        data.i=9;
        ob.i=12;
        ob.disp();
        data.show();
  }
  */
}
