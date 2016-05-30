
public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// deklaracja i inicjalizacjia
		double a = 23.5;
		double b = 4.8;

		//operacje arytmetyczne
		double dodawanie = a + b;
		double odejmowanie = a - b;
		double mnozenie = a * b;
		double dzielenie = a/b;
		
		System.out.println("a + b = " + dodawanie);
		System.out.println("a - b = " + odejmowanie);
		System.out.println("a * b = " + mnozenie);
		System.out.println("a / b = " + dzielenie);
		
		//operacje logiczne
		boolean sprawdzenie = a > b;
		boolean iloczyn = mnozenie > 100;
		
		System.out.println("Czy a jest wiêksze od b? " + sprawdzenie);
		System.out.println("Czy wynik mno¿enia jest wiêkszy od 100? " + iloczyn);
	}

}
