/** This class has 2 public method and 2 final variable*/
class A
{
  final static int x; // Final static variable
  final int y; //Final instance variable
  
  public A()
  {
  	this(10);
  	y = 10;
  }

  public A(int a)
  {
  	
  }

  static {x =10;}

  void m1()
  {
    System.out.println("m1 with no argument");
  }

   void print(A ob)
	{
       System.out.println("DDDD");
	}

}

class B extends A
{
	void print(A ob)
	{
       System.out.println("Whyyyyy");
	}
  
}

class c 
{
	public static void main(String ar[])
	{
		//A ob = new B();
		//c ob1 = new c();
      
	}

}