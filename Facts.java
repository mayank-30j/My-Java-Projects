import java.util.*;
import java.lang.*;

class fact
{
	int f;
	int factorial(int n)
	{
      if(n>0)
      {
      	f = n*factorial(n-1);      	
      }
      else if(n==0)
      {
      	return  1;
      }
     return f; 
    }   
}


class Main
{
	public static void main(String ar[])
	{
		int a,fa;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		fact obj = new fact();
        fa = obj.factorial(a);
        System.out.println(fa);
	}
}