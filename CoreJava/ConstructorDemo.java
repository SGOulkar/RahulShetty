package CoreJava;

public class ConstructorDemo {
	public ConstructorDemo() {
		System.out.println("This is default constructor");
	}

	public ConstructorDemo(int a) {
		System.out.println("This is default constructor " + a);
	}

	public void getData() {
		System.out.println("This is normal method");
	}

	public static void main(String[] args) {
		ConstructorDemo o = new ConstructorDemo();
		ConstructorDemo ob = new ConstructorDemo(4);
		o.getData();
	}

}
