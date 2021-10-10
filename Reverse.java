import java.util.*;
class Reverse
{
	public static void main(String ar[])
	{
      int n,m,rev=0,temp;
      System.out.print("Enter any Number: ");
	  Scanner sc = new Scanner(System.in);
	  n = sc.nextInt();
	  temp = n;
	  while(n!=0)
	  {
         m = n%10;
         n = n/10;
         rev = rev*10+m;
	  }
	 System.out.println("Reverse of"+temp+" is "+rev); 
	}
}