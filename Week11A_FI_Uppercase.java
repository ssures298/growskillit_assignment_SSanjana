package weeklyassign;
interface Assign 
{
 String convert(String str);
}
public class Week11A_FI_Uppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //QUESTION1:– Convert String to Uppercase
		Assign txt = (str) -> str.toUpperCase();

        String input = "hello java";
        String output = txt.convert(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
        
      	}

}
