package weeklyassign;

import java.util.*;
class Mobile
{
	String Brand;
	String Model;
	int price;
	public Mobile(String brand, String model, int price) {
		super();
		this.Brand = brand;
		this.Model = model;
		this.price = price;
	}
	
	String getBrand()
	{
		return this.Brand;
	}
	
	String getModel()
	{
		return this.Model;
	
	}
	
	int getprice()
	{
		return this.price;
	}
	public void setprice(int price) 
	{ 
		this.price = price; 
	}
	
}
public class Week9_Assign2 {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

		ArrayList<Mobile>arrayList=new ArrayList<Mobile>();
		
		Mobile m1=new Mobile("Samsung ","S23 ",70000);
		Mobile m2=new Mobile("Apple ","iphone15 ",80000);
		Mobile m3=new Mobile("Oneplus ","12 ",60000);
		Mobile m4=new Mobile("Vivo ","V30 ",35000);
		Mobile m5=new Mobile("Realme ","GT ",30000);

		arrayList.add(m1);
		arrayList.add(m2);
		arrayList.add(m3);
		arrayList.add(m4);
		arrayList.add(m5);
		
		System.out.println("Original Mobiles :");
		for(Mobile m:arrayList)
		{
			System.out.println(m.getBrand()+m.getModel()+m.getprice());
		}
		arrayList.sort(Comparator.comparingDouble(Mobile::getprice).reversed());
		System.out.println("After Sorting Descending:");

		for(Mobile m:arrayList)
		{
			System.out.println(m.getBrand()+m.getModel()+m.getprice());
		}
		
		if(!arrayList.isEmpty())
		{
			Mobile expensive = Collections.max(arrayList,Comparator.comparingDouble(Mobile::getprice));
			arrayList.remove(expensive);
		}
		
		System.out.println("After Removing Most Expensive Mobile:");
		for(Mobile m:arrayList)
		{
			System.out.println(m.getBrand()+m.getModel()+m.getprice());
		}
		
		String searchname="Vivo";
		boolean found=false;
		
		for(Mobile m :arrayList)
		{
			if(m.getBrand().trim().equalsIgnoreCase(searchname))
			{
				System.out.println("Brand Found : "+m.getBrand());
				found =true;
				break;
			}
		}
		if(!found)	
		{
			System.out.println("Brand not found");
		}
		
		String targetname = "Vivo ";
		int newprice=45000;
		
		for(Mobile m:arrayList)
		{
			if(m.getBrand().equalsIgnoreCase(targetname))
			{
				m.setprice(newprice);
			}
		}
		
	
	System.out.println("After Price Update:");
	
	for(Mobile m:arrayList)
	{
		System.out.println(m.getBrand()+m.getModel()+m.getprice());
	}
		
		
		
		
	}

}