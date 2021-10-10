import java.util.*;
class Salary_cal
{
   double net_salary,gross_salary,income_tax,ppf,pt;
   Salary_cal()
   {

   	Scanner sc = new Scanner(System.in);
   	System.out.print("Enter your Gross Salary (in Rs.): ");
    gross_salary = sc.nextDouble();
    System.out.print("Enter Income Tax (in %): ");
    income_tax = sc.nextDouble();
    System.out.print("Enter public provident fund deduction (in %): ");
    ppf = sc.nextDouble();
    System.out.print("Enter professional tax (in %): ");
    pt = sc.nextDouble();
    
    income_tax = gross_salary*income_tax/100;
    ppf = gross_salary*ppf/100;
    pt = gross_salary*pt/100;   

    net_salary = gross_salary-income_tax-ppf-pt;

   }

}

class employee extends Salary_cal
{
	String name;
    int exp,age;

	employee()
  {
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your name: ");  
    name = sc.nextLine();
    System.out.print("Enter your Age: ");
    age = sc.nextInt();
    System.out.print("Enter your experience: ");
    exp = sc.nextInt();
  	 
  	System.out.print("Net salary is: "+ net_salary);

  }
}

class emp_data
{
   public static void main(String ar[])
    {
      
      employee ob = new employee(); 

    }

}