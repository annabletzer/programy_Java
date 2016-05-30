package pl.cardiagnoser.data;

public class Car2 {

	//marka producenta
	public String CarBrand;
	
	//model
	public String model;
	
	//rok produkcji
	public int year;
	
	//moc silnika
	public int horsePower;

	//konstruktor dopisany
	public Car2 (String CarBrand, String model){
	this.CarBrand = CarBrand;
	this.model = model;
	}
	
	//konstruktor
	public Car2 (String CarBrand, String model, int year, int horsePower) {
	this(CarBrand, model);
	this.year = year;
	this.horsePower = horsePower;
	}
	
	// zwracanie opisowej formy samochodu
	public String getInfo(){
	return CarBrand + " " + model + "; " + year + "; " + horsePower + "HP"; 
	}
	
	//zwiêkszenie mocy silnika
	public void upgreade(int hP){
	horsePower = horsePower + hP;
	}
}
