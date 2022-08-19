package CoreJava;

public class String1 {
	public static void main(String[] args) {
		String s1 = "Shubham Ganpati Oulkar";
		String[] splittedString = s1.split(" ");

		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[2]);
		System.out.println();

		for (int i = 0; i < splittedString.length; i++) {
			System.out.println(splittedString[i]);
		}
		System.out.println();

		String[] splitt = s1.split("Ganpati");
		System.out.println(splitt[0]);
		System.out.println(splitt[1]);
		System.out.println(splitt[1].trim());
		System.out.println();

		for (int i = 0; i < s1.length(); i++) {
			System.out.println(s1.charAt(i));
		}
		System.out.println();
		
		
		for (int i = s1.length()-1; i >=0; i--) {
			System.out.print(s1.charAt(i));
		}
		System.out.println();
	}
}
