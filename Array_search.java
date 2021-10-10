import java.util.*;
class Linear_search
{
   Linear_search(int[] ar,int r)
   { 
     int i,flag=0; 	 
   	 for(i=0; i<ar.length; i++) // 0 1 2 3 4    5 
   	 {
         if(ar[i]==r)
         {
            System.out.print("Index of elemenet "+r+" is "+i);
            flag = 1;
            break;
         }    
   	 }
        if(flag==0) 
           System.out.print("The Elemnet you entered is not present in this Array. ");
        
        System.out.println(); 
   }   
}


class Array
{
	public static void main(String[] a)
	{
		int arr[],num,element;
		System.out.print("Enter size of Array: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
        arr = new int[num];
        for(int i = 0;i<num;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.print("Enter the element you want to serach for in Array: ");
        element = sc.nextInt();
        Linear_search ob = new Linear_search(arr,element);  
	}
}