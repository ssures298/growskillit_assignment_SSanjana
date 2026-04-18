package weeklyassign;
class Vehicle //QES1
{
	String brand;
	int speed;
	static String company="AutoWorldLTD"; //QES3
	final String engineType="Standard Engine"; //QES4
	 Vehicle(String brand, int speed) //Parent Constructor
	 {
		 this.brand=brand;
		 this.speed=speed;
	 }
	 void display() //QUES1
	 {
		 System.out.println("Brand:"+brand+"\n"+"Speed:"+speed);
	 }
	 void run() //QUES2
	 {
		 System.out.println("Vehicle  is running");
	 }
	 static void displayCompany() //QES3
	 {
		 System.out.println("CompanyName:"+company);
	 }
	 final void engineType() //QUES4
	 {
		 System.out.println("EngineType:"+engineType);
	 }
}
class car extends Vehicle//QES1
{
	String fuelType;
	car(String brand, int speed, String fuelType)//Child constructor
	{
		super(brand,speed);
		this.fuelType=fuelType;
				
	}
	void display()
	{
		super.display();
		System.out.println("FuelType:"+fuelType);
		}
	void run() //QUES2 Overriding
	{
		super.run();
		System.out.println("Car is running smoothly");
	}
	void engineType() //QES4: Error: Cannot override the final method from Vehicle
	{
		System.out.println("EngineType:"+engineType);
	}
}

public class week7_vehicleclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		car obj=new car("Hyundai",120,"Petrol"); //QES1
		obj.display();
		//QES2
		obj.run();
		//QES3
		Vehicle obj1= new Vehicle("Hyundai",120);
		obj1.displayCompany();

		//QUES5
		String stringbrand=obj.brand;
		//reverse brand name
		String reversed = "";
        for (int i = stringbrand.length() - 1; i >= 0; i--) {
            reversed = reversed + stringbrand.charAt(i);
        }
        System.out.println("Reversed: " + reversed);
        // Replace characters (replace vowels with *)
        String replaced = stringbrand.replaceAll("[aeiouAEIOU]", "*");
        System.out.println("Replaced: " + replaced);
        //Check equality
        boolean isEqual = stringbrand.equals("Hyundai");
        System.out.println("Equals Hyundai: " + isEqual);
	}

}
