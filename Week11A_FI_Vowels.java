package weeklyassign;
interface VowelCounter {
    int countVowels(String str);
}
public class Week11A_FI_Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 VowelCounter vc = (str) ->
 {
 int count = 0;
 str = str.toLowerCase();
for (int i = 0; i < str.length(); i++) 
{
 char ch = str.charAt(i);

if (ch == 'a' || ch == 'e' || ch == 'i' ||
ch == 'o' || ch == 'u')
{
 count++;
    }
	  }

return count;
  };
String input = "automation";
int output = vc.countVowels(input);
System.out.println("Input: " + input);
System.out.println("Output: " + output);
	}

}
