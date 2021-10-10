import java.util.*;
import java.lang.*;
class Binary_search
{
	Binary_search(int arr[],int element)
	{
      int s=0,e=arr.length;  

      for(int i=0; i<(arr.length-1); i++)       //Selection Sort
        { 
          for(int j=i+1; j<arr.length; j++)
        	{
               if(a[i]>a[j])
                {        		
        		  int temp = a[i];
        	      a[i] = a[j];
        	      a[j] = temp;
        	    }
        	}
        }
      

      for(int i=0; i<arr.length; i++)          //Printing element
      {
         System.out.print(arr[i]); 
      }
        
      
      for(int mid=(s+e)/2;s<=e;)               //Binary Search
        {
            
            if(arr[mid]==element)
            {
            	System.out.println("Index: "+mid);
            }
            else if(arr[mid]>element)
            {
                 e=mid-1;
            }
            else
            {
                 s = mid+1;
            }         
        }
	if(s>e)
	{
		System.out.print("The Number you are searching is not present in this Array. ");
	}
	}
}

class Array
{
	public static void main(String [] arr)
	{
		int array[],size,element;
		System.out.print("Enter the size of Array you want: ");
		Scanner sc= new Scanner(System.in);
		size = sc.nextInt();
		array = new int[size];
		for(int i=0; i<size; i++)
		{
			array[i] = sc.nextInt();
		}
		System.out.print("Enter the element you want to search: ");
		element = sc.nextInt();
        Binary_search ob = new Binary_search(array,element);
	}
}