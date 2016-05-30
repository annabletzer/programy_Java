
public class TabCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//poczatek
		double[] tablica = new double[]{1.1, 12.2, 13.2, 1.23, 41.1, 15.2, 13.6, 7.8, 6.9, 5.01};
		
		// wyœwietlenie wszystkich wartoœci tablicy
		System.out.println("Wszystkie wartoœci tablicy: ");
		System.out.println(tablica[0] + " " + tablica[1] + " " + tablica[2] + " " + tablica[3] + " " + tablica[4] + " " + tablica[5] + " " + tablica[6] + " " + tablica[7] + " " + tablica[8] + " " + tablica[9]);
		
		//suma wartoœci nieparzystych
		double suma = tablica[0] + tablica[2] + tablica[4] + tablica[6] + tablica[8];
		System.out.println("Suma wartoœci nieparzystych: " + suma);
		
		//ostatni element tablicy
		System.out.println("Ostatni element tablicy: " + tablica[tablica.length-1]);
	}

}
