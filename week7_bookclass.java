package weeklyassign;

class Book
{
	String author;
	String title;
	static String libraryName="City Library"; //QA3: Static Keyword
	final int ISNB=12345; //QA4: Final Keyword.
	Book(String author,String title) //Parent Constructor
	{
		this.author=author;
		this.title=title;
	}
		void display() //Ques1
		{
			System.out.println("Title:"+title+"\n"+"Author:"+author);
			System.out.println("ISNB: "+ISNB);
			ISNB = 6789; //Ques4: Expected error: The final field Book.ISNB cannot be assigned
		}
		
		void getDescription() //Ques2
		{
			System.out.println("This is Physics Book");
		}
		static void showLibrary()
		{
			System.out.println(libraryName);
		}
		
		
	}

class EBook extends Book
{
	int fileSize;
	EBook(String author, String title, int fileSize) //Child Constructor
	{
		super(author, title);
		this.fileSize=fileSize;
		
	}
	void display() //Ques1
	{
		super.display();
		System.out.println("File Size:"+fileSize+"MB");
	}
	
	void getDescription() //Ques2
	{
		super.getDescription();
		System.out.println("This is electronic book");
	}
}


public class week7_bookclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EBook obj=new EBook("James Clear", "Atomic Habits Java Programming", 5);
		obj.display(); //Ques1
		obj.getDescription(); //Ques2
		//Ques3
		Book book=new Book("James Clear", "Atomic Habits");
		Book.showLibrary();//static method called.
		//QUES5: since we have taken boom title, i have renamed the title for the expected results to come		
		String stringtitle=obj.title; //Ques5
	    //uppercase
	    System.out.println(stringtitle.toUpperCase()); 
	    //Find the length
	    System.out.println(stringtitle.length());
	    //find if java is there
	    System.out.println(stringtitle.contains("Java"));
		
		
		
		
		

	}

}
