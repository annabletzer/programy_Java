
public class Loops {

	public static void main(String[] args) {
		int[] array = new int[50];
		
		//licznik p�tli
		int i = 0;
		 
		// wype�nianie tablicy
		while (i < array.length) {
			array[i] = i + 1;
			i = i + 1;
		}
		//zerujemy licznik
		i=0;
		
		//wy�wietlamy warto�ci
		do{
			System.out.print(array[i] + "; ");
			i = i + 1;
		} while (i < array.length);

	}

}
