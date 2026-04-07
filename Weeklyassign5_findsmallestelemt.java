package weeklyassign;

public class Weeklyassign5_findsmallestelemt {
	 public static void main(String[] args) {
	int[] arr = {4, 2, 7, 2, 9, 1}; // array of size 6

    int smallest = arr[0]; //arr[0] =4
    {

    // Step 1: Find smallest element
    for (int a = 1; a < arr.length; a++) {
        if (arr[a] < smallest) { //arr[1]=2 ; 2<4
            smallest = arr[a]; //4=2
        }
    }

    int secondSmallest = Integer.MAX_VALUE; 
    boolean found = false;
 // Find second smallest element
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > smallest && arr[i] < secondSmallest) {
            secondSmallest = arr[i];
            found = true;
        }
    }

       if (found) {
        System.out.println("smallest element: " + secondSmallest);
    } else {
        System.out.println("invalid");
}
}
}
}
