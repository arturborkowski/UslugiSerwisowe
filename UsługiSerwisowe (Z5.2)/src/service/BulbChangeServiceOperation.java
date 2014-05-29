package service;

public class BulbChangeServiceOperation implements ServiceOperationI {

	public BulbChangeServiceOperation() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canDoService(Car c) {
		if(c.getIsBulbChangeNeeded() == true) {
			return true;
		}
			return false;
	}

	@Override
	public void doService(Car c) {
		System.out.println("Wymieniam ¿arówkê");
		 c.setBulbNeeded(false);	
	}

}
