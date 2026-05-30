package weeklyassign;
interface ReverseString
{
	 String reverse(String str);
}
public class Week11_F1_ReverseusingLamba {

	public static void main(String[] args) {
		 ReverseString rs = (str) -> {
	     String rev = "";
	     for (int i = str.length() - 1; i >= 0; i--) {
	      rev = rev + str.charAt(i);
	      }
	      return rev;
	     };

String input = "engineer";

String output = rs.reverse(input);

System.out.println("Input: " + input);
System.out.println("Output: " + output);

	}

}
