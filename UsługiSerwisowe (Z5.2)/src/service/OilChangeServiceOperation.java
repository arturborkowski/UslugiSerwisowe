package service;

public class OilChangeServiceOperation implements ServiceOperationI {

	public OilChangeServiceOperation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canDoService(Car c) {
		if(c.getIsOilChangeNeeded() == true) {
			return true;
		}
			return false;
	}


	@Override
	public void doService(Car c) {
		System.out.println("Wymieniam olej");
		 c.setOilNeeded(false);		
	}

}
