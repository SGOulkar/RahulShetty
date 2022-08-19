package CoreJava;

import DemoInterface.CentralTraficc;
import DemoInterface.ContinentalTraffic;

public class IndianTrafic implements CentralTraficc,ContinentalTraffic {
	public static void main(String[] args) {
		CentralTraficc obj =new IndianTrafic();
		obj.GreenGo() ;
		obj.RedStop();
		obj. FlashingYellow();
		ContinentalTraffic ob =new IndianTrafic();
		ob.TrainSymbol();
		IndianTrafic o =new IndianTrafic();
		o.PlaneSymbol();
	}

	@Override
	public void GreenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green Go implemetation");
	}

	@Override
	public void RedStop() {
		// TODO Auto-generated method stub
		System.out.println("Red Stop implementation");
	}

	@Override
	public void FlashingYellow() {
		// TODO Auto-generated method stub
		System.out.println("Flashing Yellow implementation");
	}

	@Override
	public void TrainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train Symbol implementation");
	}
	
	public void PlaneSymbol() {
		System.out.println("Plane symbol implementation");	
	}
}
