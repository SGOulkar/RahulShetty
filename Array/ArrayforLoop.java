package Array;

public class ArrayforLoop {
	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 7;
		arr[1] = 6;
		arr[2] = 9;
		arr[3] = 0;
		arr[4] = 1;
		System.out.println(arr);

		for (int i = 0; i < arr.length; i++) {
			// System.out.print(arr+" ");
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int[] arr2 = { 3, 5, 6, 7, 9 };
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		System.out.println();

		String[] arr3 = { " Shubham", " Ganpati", " Oulkar" };
		for (int i = 0; i < arr3.length; i++) {
			System.out.print(arr3[i]);
		}
		System.out.println();
		
		for (int i = arr3.length-1; i>=0; i--) {
			System.out.print(arr3[i]);
		}
	}
}
