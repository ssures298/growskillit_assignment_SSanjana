package weeklyassign;

class employee //class
{
	int iD;
	String name;
	double basicSalary;
	double totalSalary;
	employee(int iD, String name, double basicSalary)//constructor initialization
	{
	this.iD=iD;
	this.name=name;
	this.basicSalary=basicSalary;
	}
	void calculateSalary() //method to calculate the salary
	{
	double hra=0.2* this.basicSalary;
	double bonus=0.1* this.basicSalary;
	this.totalSalary = this.basicSalary +hra +bonus;
	}
	void display() //method to display the salary
	{
		System.out.println("ID:"+ this.iD+" "+"NAME:"+ this.name+" "+"BASICSALARY:"+this.basicSalary+" "+"TOTALSALARY:"+ this.totalSalary);
	}
}
public class week7_salarycalcusingkeywords {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee emp=new employee(101,"Sanjana",32000);
		emp.calculateSalary();
		emp.display();

	}

}
