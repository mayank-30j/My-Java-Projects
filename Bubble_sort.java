import java.util.*;
class Bubble_sort
{
   Bubble_sort(int ar[])
   {
      for(int i=1; i<ar.length; i++)
        {
           for(int j=0; j<(ar.length)-i; j++)
            {
               if(ar[j]>ar[j+1])
               {
                
                 int temp = ar[j];
                 ar[j] = ar[j+1];
                 ar[j+1] = temp;

               }
            } 
        }      
   
   System.out.print("Your sorted Array is: ");

    for(int i =0; i<ar.length; i++)
      {
           System.out.print(ar[i]+"  ");
      }
   }
}

class Array
{
	public static void main(String arr[])
	{
      int ar[],size;
      System.out.print("Enter the size of Array: ");
      Scanner sc= new Scanner(System.in);
      size = sc.nextInt();
      ar = new int[size];
      for(int i=0;i<size;i++)
      {
          ar[i] = sc.nextInt();
      }
      Bubble_sort ob = new Bubble_sort(ar);
	}
}