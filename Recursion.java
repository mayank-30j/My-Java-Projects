class Main
{

  static int Print(int n)
  {
  	if(n==0)
  		return 0;
  	else
  		System.out.print(n + " ");
  		return Print(n-1);
  }	
 
 public static void main( String arr[])
 {
    System.out.print(Print(4));
 }

}
