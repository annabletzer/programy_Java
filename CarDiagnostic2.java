package pl.cardiagnoser.app;
import pl.cardiagnoser.data.Car2;

public class CarDiagnostic2 {

	public static void main(String[] args) {
	
// tworzenie obiektów
		Car2 audiA4 = new Car2 ("Audi", "A4", 2008, 170);
		Car2 vwGolf = new Car2 ("Volkswagen", "Golf", 2010, 130);
		Car2 opelCorsa = new Car2 ("Opel", "Corsa");
// zwiêkszenie mocy
		audiA4.upgreade(30);
		vwGolf.upgreade(20);
		
// wyœwietlanie informacji
	
	System.out.println("Samochód nr 1: ");
	System.out.println(audiA4.getInfo());
	
	System.out.println(" ");
	
	System.out.println("Samochód nr 2: ");
	System.out.println(vwGolf.getInfo());
	
	System.out.println(" ");
	
	System.out.println("Samochód nr 3: ");
	System.out.println(opelCorsa.getInfo());
	}

}