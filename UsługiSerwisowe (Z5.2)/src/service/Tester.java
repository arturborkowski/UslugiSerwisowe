package service;

public class Tester {

	public static void main(String[] args) {
		
		Garage warsztat = new Garage();
		
		
		Car opel = new Car(true, true, true, true);
		warsztat.fullService(opel);
		System.out.println();
		
		
		Car passat = new Car(false, true, false, true);
		warsztat.fullService(passat);
		System.out.println();
		
		
		Car maluch = new Car(false, false, false, false);	
		warsztat.fullService(maluch);
		
		System.out.println("\n");
		System.out.println(opel);
		System.out.println(passat);
		System.out.println(maluch);


	}

}
