class MyOwnException extends ArithmeticException
{
	String s;
	MyOwnException(String s)
	{
		super(s);
       System.out.println("This is my own Exception ");
	}

}

class E
{
	public static void main(String arg[])
	{
		MyOwnException m = new MyOwnException("This is my own Exception class ");
        try
        {

		throw m;

	    } 
	    catch(MyOwnException e) {
          System.out.println(e);  
	    }

	}
}
