
public class Zad1 {

	public static void main(String[] args) {
	int n = 8;
	char [][] array = new char [n][n];

	//wype³nianie tablicy
	for(int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			
	//wype³nienie X na krawêdziach tablicy
			if(i == 0 || j == 0 || i ==n - 1 || j== n - 1) {
			array[i][j] ='X';
			
	// wype³nienie X na przek¹tnych
			} else if (i ==j || i == n - j - 1){
			array[i][j] = 'X';
			
	//wype³nienie 0 w pozosta³ych miejscach
			} else {
				array[i][j] = '0';
				
				
			}
		}
	}
	 // licznik pêtli
	int i = 0, j = 0;
	
	//wyœwietlanie tablicy
	while (i <n) {
		while (j < n ) {
			System.out.print(array[i][j] + " ");
			j++;
		}
		j = 0;
		System.out.println(); //nowa linia na koñcu wiersza
		i++;
	}
	
	}

}
