
public class Zad1 {

	public static void main(String[] args) {
	int n = 8;
	char [][] array = new char [n][n];

	//wype�nianie tablicy
	for(int i = 0; i < n; i++) {
		for (int j = 0; j < n; j++) {
			
	//wype�nienie X na kraw�dziach tablicy
			if(i == 0 || j == 0 || i ==n - 1 || j== n - 1) {
			array[i][j] ='X';
			
	// wype�nienie X na przek�tnych
			} else if (i ==j || i == n - j - 1){
			array[i][j] = 'X';
			
	//wype�nienie 0 w pozosta�ych miejscach
			} else {
				array[i][j] = '0';
				
				
			}
		}
	}
	 // licznik p�tli
	int i = 0, j = 0;
	
	//wy�wietlanie tablicy
	while (i <n) {
		while (j < n ) {
			System.out.print(array[i][j] + " ");
			j++;
		}
		j = 0;
		System.out.println(); //nowa linia na ko�cu wiersza
		i++;
	}
	
	}

}
