package Array;

public class ArrayIf {
	public static void main(String[] args) {
		int[] arr = { 7, 1, 6, 34, 5, 76, 4, 3 };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
				break;
			}
		}
	}
}
