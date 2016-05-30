
public class CarDiagnostic {

	public static void main(String[] args) {
	
// tworzenie obiektów
		
	Car audiA4 = new Car();
	audiA4.CarBrand = "Audi";
	audiA4.model = "A4";
	audiA4.year = 2008;
	audiA4.horsePower = 170;
	
	Car vwGolf = new Car();
	vwGolf.CarBrand = "Volkswagen";
	vwGolf.model = "Golf";
	vwGolf.year = 2010;
	vwGolf.horsePower = 130;
	
// wyœwietlanie informacji
	
	System.out.println("Samochód nr 1: ");
	System.out.println(audiA4.CarBrand + " " + audiA4.model + " , rok produkcji: " + audiA4.year + " ,moc silnika: " + audiA4.horsePower);
	System.out.println(" ");
	System.out.println("Samochód nr 2: ");
	System.out.println(vwGolf.CarBrand + " " + vwGolf.model + " , rok produkcji: " + vwGolf.year + " ,moc silnika: " + vwGolf.horsePower);
	}

}
