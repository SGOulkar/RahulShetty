package CoreJava;

public class ChildAmirates extends ParentAircraft {
	public static void main(String[] args) {
		ChildAmirates o = new ChildAmirates();
		o.engine();
		o.color();
		o.saftyGuidelines();
	}

	@Override
	public void color() {
		// TODO Auto-generated method stub
		System.out.println("Color is Red");
	}
}
