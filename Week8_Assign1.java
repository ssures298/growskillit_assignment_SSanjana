package weeklyassign;

public class Week8_Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1= {"flower", "flow", "flight"};
		System.out.println("Word1 : "+Prefix(arr1));
		
		String[] arr2= {"dog", "racecar", "car"};
		System.out.println("Word2 : "+Prefix(arr2));
		
		String[] arr3= {"interview", "internet", "internal", "interval"};
		System.out.println("Word3 : "+Prefix(arr3));	

	}
	
	public static String Prefix (String[] strs)
	{
		
if (strs == null || strs.length == 0) return "";
        String prefix = strs[0];// Initialize prefix      
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                  if (prefix.isEmpty()) 
                	return "";
            }
        }
        
        return prefix;
	}

}
