package weeklyassign;
//E-commerce Payment System using an abstract class.
abstract class Payment
{
	int amount;
	Payment(int amount)
	{
		this.amount =amount;
	}
	abstract void makePayment();
	
	void paymentdetails()
	{
		System.out.println("Payment Amount: " +amount);
	}
	
}

 class	CreditCardPayment extends Payment
{

	String cardNum;
	CreditCardPayment(int amount,String cardNum) {
		super(amount);
		this.cardNum=cardNum;
	}
	void makePayment()
	{
		String lastfour=cardNum.substring(cardNum.length()-4);
		System.out.println("Paid "+amount+" Using Credit card ending with"+" "+ lastfour);
	}
}
	
	 class	UPIPayment extends Payment
	{
		String UPIid;

		UPIPayment(int amount,String UPIid) {
			super(amount);
			this.UPIid=UPIid;
		}
		void makePayment()
		{
			System.out.println("Paid "+amount+ " Using UPIId: "+UPIid);
		}
	
	}

public class Week8_Assign2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Payment obj= new CreditCardPayment(5000 , "1234567812341234");	
	obj.paymentdetails();
	obj.makePayment();
	
	Payment obj1 =new UPIPayment(1500 , "user@upi");
		obj1.makePayment();
	}

}
