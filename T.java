/** This class has 2 public method and 2 final variable*/
public class t
{
  final static int x; // Final static variable
  final int y; //Final instance variable
  
  public t()
  {
  	this(10);
  	y = 10;
  }

  public t(int a)
  {
  	
  }

  static {x =10;}

  void m1()
  {
    System.out.println("m1 with no argument");
  }

   void print(t ob)
	{
       System.out.println("DDDD");
	}

}

class B extends t
{
	void print(t ob)
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