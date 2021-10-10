import java.util.*;
class Reverse_name
{
	public static void main(String ar[])
	{
       String name;
       char temp[],a[];
       System.out.print("Enter any name: ");
       Scanner sc = new Scanner(System.in);
       name = sc.next();
       temp = new char[name.length()];
       a = new char[name.length()];
       
       for(int i = 0;i< name.length();i++) // 0 1 2 3 4 
       {
         a[i] = name.charAt(i);
       }

       for(int i=(a.length-1), j=0; i>=0 && j<a.length; i--,j++) // 0 1 2 3 4 
       {
          temp[j] = a[i];
       }
       System.out.print("Reverse of "+name+" is ");

       for(int i =0;i<temp.length;i++)
       {
       	System.out.print(temp[i]);
       }
	}
}