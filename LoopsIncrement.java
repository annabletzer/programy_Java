
public class LoopsIncrement {

	public static void main(String[] args) {
		int[] array = new int[50];
		
		//licznik p�tli
		int i = 0;
		 
		// wype�nianie tablicy
		while (i < array.length) {
			array[i] = i + 1;
			i++;
		}
		//przypisujemy do licznika ostatni indeks tablicy
		i=array.length-1;
		
		//wy�wietlamy warto�ci
		do{
			System.out.print(array[i] + "; ");
		} while (i-- > 0);

	}

}