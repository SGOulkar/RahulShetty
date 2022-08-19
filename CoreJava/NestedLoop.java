package CoreJava;

public class NestedLoop {
	public static void main(String[] args) {
		int k = 1;
		for (int i = 0; i <= 5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(k + "\t");
				k++;
			}
			System.out.println();
		}

		System.out.println();
		int l = 10;
		for (int i = 5; i >= 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(l + "\t");
				l--;
			}
			System.out.println();

		}
	}
}
