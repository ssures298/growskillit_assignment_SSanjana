package weeklyassign;

public class Weeklyassign5_sorting {

	public static void main(String[] args) {
		//give the array 
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {1,5,3,0,6};
		System.out.println(isSorted(arr1));
		System.out.println(isSorted(arr2));

	}

	private static boolean isSorted(int[] arr) {
		 for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] > arr[i + 1]) { //arr[0] > arr[0+1]----arr[1]>arr[2]---2>3(false) 
	                return false;
	            }
	        }

	        return true; 
}
}
