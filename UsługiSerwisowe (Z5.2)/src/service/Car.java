package service;

import javax.print.attribute.standard.MediaSize.ISO;

public class Car {

	private boolean isTiresChangeNeeded;
	private boolean isPaintNeeded;
	private boolean isOilChangeNeeded;
	private boolean isBulbChangeNeeded;
	
	Car() {
		isPaintNeeded = true;
		isTiresChangeNeeded = true;
		isOilChangeNeeded = true;
		isBulbChangeNeeded = true;
	}
	
	Car(boolean paintNeeded, boolean tiresChangeNeeded, boolean oilNeeded, boolean bulbNeeded) {
		isPaintNeeded = paintNeeded;
		isTiresChangeNeeded = tiresChangeNeeded;
		isOilChangeNeeded = oilNeeded;
		isBulbChangeNeeded = bulbNeeded;
	}

	
	
	
	public boolean getIsTiresChangeNeeded() {
		return isTiresChangeNeeded;
	}

	public void setTiresChangeNeeded(boolean isTiresChangeNeeded) {
		this.isTiresChangeNeeded = isTiresChangeNeeded;
	}

	public boolean getIsPaintNeeded() {
		return isPaintNeeded;
	}

	public void setPaintNeeded(boolean isPaintNeeded) {
		this.isPaintNeeded = isPaintNeeded;
	}
	
	public boolean getIsOilChangeNeeded() {
		return isOilChangeNeeded;
	}
	
	public void setOilNeeded(boolean isOilNeeded) {
		this.isOilChangeNeeded = isOilNeeded;
	}
	
	public boolean getIsBulbChangeNeeded() {
		return isBulbChangeNeeded;
	}
	
	public void setBulbNeeded(boolean isBulbNeeded) {
		this.isBulbChangeNeeded = isBulbNeeded;
	}
	
	
	public String toString() {
		return "Car: [Is paint needed? = "+isPaintNeeded+", is oil change needed? = "+isOilChangeNeeded+",\n is tires change needed? = "+isTiresChangeNeeded+
				", is bulb change needed? = "+isBulbChangeNeeded+"]";
	}
	
	
	
}
