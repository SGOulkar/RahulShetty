package CoreJava;

public class ChildCar extends ParentCar {
	String color= "Child color";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildCar o = new ChildCar();
		o.Brakes();
		o. tyres();
		o.color();	
		}
	
	private void color() {
		System.out.println("This is " + super.color);
	}


	public void tyres() {
		super.tyres();
		System.out.println("This is Child Tyre");
	}
}
