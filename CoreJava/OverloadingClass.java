package CoreJava;

public class OverloadingClass {
	
	public static void main(String[] args) {
		OverloadingClass o= new OverloadingClass();
		o.GetData(2);
		o.GetData("Hello");
		o.GetData(2,6);
	}

	public void GetData(int a) {
		System.out.println(a);
	}
	
	public void GetData(int a,int b) {
		System.out.println(a+b);
	}
	
	public void GetData(String a) {
		System.out.println(a);
	}

}
