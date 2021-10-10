
import java.util.*;
class example 
{
  int data; // instance variables

  static int d=10; // Static variable 

  void A() // instance method 
  {
  	int a=data; // a is a local variable
    System.out.println(data);
    System.out.println(a);
  }

  example()
  {
  	
  }

  example(int a,float b) // Constructor of class example
  {
  	System.out.println("Constructor of parent class");
  }

 static void B() // Static method 
 {
 	 int a=d;  // a is a local variable
     System.out.println(d);
     System.out.println(a);
 }

}


class sample extends example
{
    static final int BUS = 3;
	public static void main(String ar[])
	{  
		float b=10f;
		//example ex = new example();
		sample ob = new sample(BUS,b);
       sample.B();
	}

	sample()
	{

	}

	sample(int a,float b)
	 {
       System.out.println("Constructor of child class");
	 }

}

/*
 int size;
	   Scanner sc = new Scanner(System.in);
	   System.out.print("How many elements will you enter: ");
	   size = sc.nextInt();
	   int ar[] = new int[size];
	   for(int i=0;i<size;i++)
	   {
        ar[i] = sc.nextInt();
	   }
	   int last = ar.length-1;
       System.out.print("Your last element is: ");
       System.out.print(ar[last]);
*/


/*
  example ex = new example();
	ex.A();
	ex.B();
	example.d=1;
	ex.data=2;
	example.B();
*/

/*
    int	n = ar.length;
	int a[];
   	a = new int[n];
   	for(int i = 0; i<n;i++)
   	{
     a[i] = Integer.parseInt(ar[i])+10;
  	} 
  	for(int i=0; i<n; i++)
	{
	   System.out.print(a[i]+" ");
	}
*/	
