package weeklyassign;
class person1
{


	int age;
	String name;

person1(int age,String name) //parent constructor
{
	this.name=name;
	this.age=age;
}
}

class student1 extends person1
{
	int mark;

	
student1(int age, String name, int mark) //child constructor
	{
	super(age, name);	
	this.mark=mark;		
		
	}
void display()
{
	System.out.print(name+":"+mark+":"+age);
}

}
public class week6_this_inherit_constructor {

	public static void main(String[] args) {
		
		student1 s1=new student1(25,"Sanjana",101);
		s1.display();
		
	}

}
