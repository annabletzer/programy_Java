package pl.cardiagnoser.app;
import pl.cardiagnoser.data.Car2;

public class CarDiagnostic2 {

	public static void main(String[] args) {
	
// tworzenie obiekt�w
		Car2 audiA4 = new Car2 ("Audi", "A4", 2008, 170);
		Car2 vwGolf = new Car2 ("Volkswagen", "Golf", 2010, 130);
		Car2 opelCorsa = new Car2 ("Opel", "Corsa");
// zwi�kszenie mocy
		audiA4.upgreade(30);
		vwGolf.upgreade(20);
		
// wy�wietlanie informacji
	
	System.out.println("Samoch�d nr 1: ");
	System.out.println(audiA4.getInfo());
	
	System.out.println(" ");
	
	System.out.println("Samoch�d nr 2: ");
	System.out.println(vwGolf.getInfo());
	
	System.out.println(" ");
	
	System.out.println("Samoch�d nr 3: ");
	System.out.println(opelCorsa.getInfo());
	}

}