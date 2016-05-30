
public class LoopsIncrement {

	public static void main(String[] args) {
		int[] array = new int[50];
		
		//licznik pêtli
		int i = 0;
		 
		// wype³nianie tablicy
		while (i < array.length) {
			array[i] = i + 1;
			i++;
		}
		//przypisujemy do licznika ostatni indeks tablicy
		i=array.length-1;
		
		//wyœwietlamy wartoœci
		do{
			System.out.print(array[i] + "; ");
		} while (i-- > 0);

	}

}