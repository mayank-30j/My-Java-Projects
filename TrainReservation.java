public class TrainReservation 
{
	//Data members
	long ticket_no;
	private String name;
	private long mobile_no;
    private int fare;
   
    //Constructor
	public TrainReservation()
	{
	  Scanner sc = new Scanner(System.in);
      System.out.println("Enter your name: ");
      name = sc.nextLine();
      System.out.println("Enter your mobile number"); 
	}
}