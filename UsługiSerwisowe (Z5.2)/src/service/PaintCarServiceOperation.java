package service;

public class PaintCarServiceOperation implements ServiceOperationI {

	@Override
	public boolean canDoService(Car c) {
		if(c.getIsPaintNeeded() == true) {
			return true;
		}
			return false;
	}
		
	

	@Override
	public void doService(Car c) {
		System.out.println("Nak³adam nowy lakier");
		 c.setPaintNeeded(false);		
	}

}
