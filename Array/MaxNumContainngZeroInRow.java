package Array;

public class MaxNumContainngZeroInRow {
	public static void main(String[] args) {
		int k=0;
		int[][] arr = { { 1, 2, -3, 7 }, { 4, 5, 6, 8 }, { 3, 7, 2, 7 } };
	
		int min = arr[0][0];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (arr[i][j] < min) {
					min = arr[i][j];
					 k = i;
				}
			}
		}
		int l = 0;
		int max = arr[k][l];
		while (l < 4) {
			if (max < arr[k][l]) {
				max = arr[k][l];	
			}
			l++;
		}
		System.out.println("Minimum value of array: " + min);
		System.out.println("Maximum value of array: " + max);

	}

}
