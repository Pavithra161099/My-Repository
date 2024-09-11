package com.corejavapractise;

public class PlaneApp {

	public static void main(String[] args) {

//		Plane ref;
//		
//		CargoPlane cp = new CargoPlane();
//		ref=cp;
//		ref.fly();
//		((CargoPlane)ref).cargoPlane();
//		ref.land();
//
//		PassengerPlane pp = new PassengerPlane();
//		ref=pp;
//		ref.land();
//		ref.fly();
//		((PassengerPlane)ref).passengerPlane();
//
//		FighterPlane fp = new FighterPlane();
//		ref=fp;
//		((FighterPlane)ref).fighterPlane();
//		ref.land();
//		ref.fly();
		
		//below codes are using for code flexibility and compactness
		
		Airport.accept(new CargoPlane());
		Airport.accept(new PassengerPlane());
		Airport.accept(new FighterPlane());
		

	}

}
