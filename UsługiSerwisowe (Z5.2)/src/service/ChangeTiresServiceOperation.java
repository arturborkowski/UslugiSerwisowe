package service;

public class ChangeTiresServiceOperation implements ServiceOperationI {

	@Override
	public boolean canDoService(Car c) {
		if(c.getIsTiresChangeNeeded() == true) {
			return true;
		}
		else return false;
	}

	@Override
	public void doService(Car c) {
		System.out.println("wymieniam opony");
		 c.setTiresChangeNeeded(false);
	}

}
