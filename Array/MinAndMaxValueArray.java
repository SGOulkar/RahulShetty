package Array;

public class MinAndMaxValueArray {
	public static void main(String[] args) {

		int[][] arr = { { 1, 2, -3, 7 }, { 4, 5, 6, 8 }, { 3, 7, 2, 7 } };
		int min = arr[0][0];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (min > arr[i][j]) {
					min = arr[i][j];
				}
			}
		}
		System.out.println("Minimum value of array: "+min);
		
		int max = arr[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (max < arr[i][j]) {		
					max = arr[i][j];
				}
			}
		}
		System.out.println("Maximum value of array: "+max);
	}
}
