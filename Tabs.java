
public class Tabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] numery = new int[5];
String[] napisy = new String[10];

//tablice posiadają indeksy numerowane od 0
numery[0] = 1;
numery[1] = 2;

//elementów nie musimy uzupełniać w określonym porządku
napisy[0] = "Ala";
napisy[3] = "Kot";

// wyświetlenie pierwszego elementu tablicy tab
System.out.println("Pierwszy element tablicy numery: " + numery[0]);

//wyświetlenie czwartego elementu tablicy napisy
System.out.println("Czwarty element tablicy napisy: " + napisy[3]);
	}

}
