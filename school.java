import java.util.*;

class Student_info
{
  String name,address,subject;
  char genre;
  int mobile,roll_no;
  
  public Student()
  {
  	Scanner sc = new Scanner(System.in);
  	System.out.print("Enter your Name: ");
  	name = sc.nextLine();
  	System.out.print("Enter your mobile number: ");
  	mobile = sc.nextInt();
  	System.out.print("Enter your address: ");
  	address = sc.nextLine();
  	System.out.print("Enter your gender: ");
  	genre = sc.nextChar();
  	System.out.print("Enter roll_no: ");
  	roll_no = sc.nextInt();
  	System.out.print("Enter your course: ");
    subject = sc.nextLine();
  }


  public show_info()
  {
  	
  }

};

class Main
{
	public static void main(String ar[])
	{

	}
}