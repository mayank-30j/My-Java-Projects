import java.util.*;
class Prime
{
	public static void main(String ar[])
	{
          int n,i;
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a number: ");
          n = sc.nextInt();      
          System.out.println();   
          for(i=2;i<=n/2;i++)
          {
              if(n%i==0)
              {
                System.out.println("Not a prime number ");
                break;
              }
          }

         if(i>n/2)
          {
            System.out.print("Prime number ");
          }
	}
}