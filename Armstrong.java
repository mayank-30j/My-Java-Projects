import java.util.*;
class Armstrong
{
	public static void main(String[] arr)
	{
        int n,a,k=0,m,sum=0;
        System.out.print("Enter any Number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = n;
        while(n!=0)
        {
           n = n/10;
           k++;
        }
        n = a;      
        for(int i=1;i<=k;i++)
        {
            m = n%10;
            n = n/10;
            sum = ((int)Math.pow(m,k))+sum;
            System.out.print(sum+"  "); 
        }

        if(sum==a)
        {
        	System.out.println("Armstrong Number ");
        } 
        else
        {
        	System.out.println("Not an Armstrong Number ");
        }
	}
}