package weeklyassign;
import java.util.*;
public class Week11C_Method_Based {

	public static void main(String[] args) 
	{
//Question1 – Print List Using Method Reference
List<String> list = Arrays.asList("A", "B", "C");
// Printing using method reference
list.forEach(System.out::println);

System.out.println();

//Question – Sort and Print Using Method Reference
List<Integer> numbers = Arrays.asList(40, 10, 30, 20);
// Sort and print using method reference
numbers.stream()
       .sorted()
       .forEach(System.out::println);
	 
	}

}
