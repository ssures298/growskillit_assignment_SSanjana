package weeklyassign;

public class Weeklyassign5_moveallzerostoend {

	public static void main(String[] args) {
		int[] arr = {1, 0, 3, 0, 5};
        moveZeros(arr);
        // Print result
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

	// Method to move zeros to end
    public static void moveZeros(int[] arr) {

        int index = 0; // position to place non-zero elements

        // Move all non-zero elements forward
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        //Fill remaining positions with 0
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
    }
}
