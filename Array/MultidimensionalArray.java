package Array;

public class MultidimensionalArray {
	public static void main(String[] args) {
		int[][] a = new int[3][3];
		a[0][0] = 8;
		a[0][1] = 1;
		a[0][2] = 13;
		a[1][0] = 6;
		a[1][1] = 10;
		a[1][2] = 1;
		a[2][0] = 5;
		a[2][1] = 9;
		a[2][2] = 2;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(a[i][j] + "   ");
			}
			System.out.println();
		}
		System.out.println();

		int[][] b = { { 1, 2, -3, 7 }, { 4, 5, 6, 8 }, { 3, 7, 2, 7 } };

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(b[i][j] + "   ");
			}
			System.out.println();
		}
	}
}
