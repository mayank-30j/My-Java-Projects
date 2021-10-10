class A
{
	enum NUM
	   {
	     ONE,TWO,THREE,FOUR,FIVE;
	   }

	public static void main(String arg[])
	{
	   NUM num = NUM.ONE;
	   
	   switch(num)
	   {
           case ONE:
           System.out.println("One");
           break;
           case TWO:
           System.out.println("Two");
           break;
           case THREE:
           System.out.println("THREE");
           break;
           case FOUR:
           System.out.println("FOUR");
           break; 
           default:
           System.out.print("This number is grater then 4 ");
 	   }
	}
}