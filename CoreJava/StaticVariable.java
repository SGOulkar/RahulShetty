package CoreJava;

public class StaticVariable {
	String name;
	String address;
	String city="Chandgad";
	
	public StaticVariable(String name,String address) 
	{
		this.name=name;
		this.address=address;
	}
	
	public void getAddress() {
		System.out.println(address+" "+ city);
	}
	
	public static void main(String[] args) {
		StaticVariable o =new StaticVariable("Shubham","Kolhapur");
		StaticVariable o2 =new StaticVariable("Shiva","beed");
		o.getAddress();
		o2.getAddress();

	}

}
