import java.util.*;
import java.lang.*;

class parent  // parent class 
{
	int i,j,a=10;   //  instance Variable
    
	parent()     // Constructor 
	{	
      i = 32;
      j = 43;
      System.out.println("BYE");
	}

	void xyz()      // Instance method 
 	{
      System.out.println("welcome ");
	}
}



class child extends parent           // Child class 
{
	int a,b;   // Instance variable 
	
	child()       // Constructor
	{
       
	}

	child(int i,int j)  // parametarised constructor
	{
      a = i;
      b = j;
	}

   void xyz()    // instance method
	{
	System.out.println("Hello");	
	}

}


class demo 
{
	public static void main(String ar[])
	{
		parent pr;
		pr = new child();
		pr.xyz();
		System.out.print(pr.a);
	}
}