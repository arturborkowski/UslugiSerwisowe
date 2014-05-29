package service;

import java.util.List;
import java.util.ArrayList;

public class Garage {

	List<ServiceOperationI> service = new ArrayList<ServiceOperationI>();
	Car car;
	
	
	//********** konstruktory klasy garage *************//
	Garage() {
		
	}
	
	Garage(Car c) {
		this.car = c;
	}
	
	
	
	//******************  METODY ****************//
	
	
	private void checkState(Car c) {		
		// metoda sprawdzaj�ca stan pojazdu, tzn. jakie elementy wymagaja naprawy
		// i je�li istniej� takie, to dodaje ona odpowiednia us�ug� do listy napraw
		
		System.out.println("Sprawdzam stan...");
		
		if(c.getIsPaintNeeded() == true) {
			System.out.println("Wymagana jest wymiana lakieru");
			service.add(new PaintCarServiceOperation());
		}
		else System.out.println("Nowy lakier nie jest wymagany.");
		
		
		
		if(c.getIsTiresChangeNeeded() == true) {
			System.out.println("Wymagana jest wymiana opon");
			service.add(new ChangeTiresServiceOperation());
		}
		else System.out.println("Wymiana opon nie jest wymagana");
		
		
		
		if(c.getIsOilChangeNeeded() == true) {
			System.out.println("Wymagana jest wymiana oleju");
			service.add(new OilChangeServiceOperation());
		}
		else System.out.println("Wymiana oleju nie jest wymagana");
		
		
		
		if(c.getIsBulbChangeNeeded() == true) {
			System.out.println("Wymagana jest wymiana �ar�wki");
			service.add(new BulbChangeServiceOperation());
		}
		else System.out.println("Wymiana �ar�wki nie jest wymagana");
		
		
	}
	
	
	public void fullService(Car c) {
		//metoda wykonujaca napraw� na podstawie listy napraw
		
		this.car = c;
			checkState(c);
			for(ServiceOperationI x: service) {
				if(x.canDoService(c)) x.doService(c);
			}		
	}
	
	
	
	
}
