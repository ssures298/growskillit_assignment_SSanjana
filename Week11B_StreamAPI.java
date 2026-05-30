package weeklyassign;
import java.util.*;
public class Week11B_StreamAPI {

	public static void main(String[] args) {
		//QUES1:Question  – Filter Names Ending with A	
		List<String> ListNames = Arrays.asList("Aman", "Riya", "Ankit", "Tushar");
        System.out.println("Names ending with A:");
        ListNames.stream()
             .filter(name -> name.toLowerCase().endsWith("a"))
             .forEach(System.out::println);
       
    System.out.println(); 
    
    
        //QUES2:Question  – Filter Strings with Length Greater Than 5
        List<String> StringList = Arrays.asList("Java", "Automation", "API", "Playwright");
        System.out.println("Strings with length greater than 5:");
        StringList.stream()
            .filter(str -> str.length() > 5)
            .forEach(System.out::println);

	}

}
