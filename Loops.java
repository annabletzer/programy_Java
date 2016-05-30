
public class Loops {

	public static void main(String[] args) {
		int[] array = new int[50];
		
		//licznik pêtli
		int i = 0;
		 
		// wype³nianie tablicy
		while (i < array.length) {
			array[i] = i + 1;
			i = i + 1;
		}
		//zerujemy licznik
		i=0;
		
		//wyœwietlamy wartoœci
		do{
			System.out.print(array[i] + "; ");
			i = i + 1;
		} while (i < array.length);

	}

}
