package weeklyassign;
import java.util.*;
class MyBook implements Comparable<MyBook>
{
	int bookid;
	String bookname;
	int price;
	int targetId =101;
	int newprice = 550;
	public MyBook(int bookid, String bookname, int price) 
	{
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.price = price;
	}
	
	public int compareTo(MyBook b)
	{
		return this.price-b.price;
		
	}
int getbookID()
{
		return this.bookid;
}

String getbookname()
{
	return this.bookname;
}

int getprice()
{
	return this.price;
}
public void setprice(int price) {
    this.price = price;
}

}

public class Week9_Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<MyBook>list=new ArrayList <MyBook>();
		MyBook b1=new MyBook(101,"Java",499);
		MyBook b2=new MyBook(102,"Python ",399);
		MyBook b3=new MyBook(103,"SQL",299);
		MyBook b4=new MyBook(104,"c++",599);

		list.add(b1);
		list.add(b2);
		list.add(b3);
		list.add(b4);
		
		//Collections.sort(list,new Comparator());

		System.out.println("size: "+list.size()); 
		  
		///list.add(b1);list.add(b2);list.add(b3);
		System.out.println(list);
		
		System.out.println("Original List");
		for(MyBook b:list)
		{
			System.out.println(b.getbookID()+" " +b.getbookname()+" "+ b.getprice());
		}
		System.out.println("All books");
		
		for ( MyBook b : list) {
		    System.out.println(b.getbookname());
		}
		System.out.println("After Sorting by Price:");
		list.sort(Comparator.comparingDouble(MyBook::getprice));
		for(MyBook b:list)
		{
			System.out.println(b.getbookID()+" " +b.getbookname()+" "+ b.getprice());
		}
		list.removeIf(b -> b.getbookID() == 102);		//System.out.println("After Removing Book ID 102:" +b.getbookID()+" " +b.getbookname()+" "+ b.getprice());
		System.out.println("After Removing Book ID 102:" );

		for(MyBook b:list)
		{
			System.out.println(b.getbookID()+" " +b.getbookname()+" "+ b.getprice());
		}
		System.out.println("After Updating Price");

		for(MyBook b:list)
		{
			int targetId = 101;
			int newprice=550;
  			if(b.getbookID()==targetId) {
				b.setprice(newprice);
			}
  			
			System.out.println(b.getbookID()+" " +b.getbookname()+" "+ b.getprice());

		}
	String searchname = "Java";
	boolean found =false;
	
	for(MyBook b :list)
	{
		if(b.getbookname().equalsIgnoreCase(searchname))
		{
			System.out.println("Book Found : "+b.getbookname());
			found =true;
			break;
		}
	}
	if(!found)	
	{
		System.out.println("Book not found");
	}
		System.out.println("Final List");
	for(MyBook b:list)
	{
		System.out.println(b.getbookID()+" " +b.getbookname()+" "+ b.getprice());
	}

	}
}