
public class Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		boolean[][] matrix = new boolean[n][n];

		//przek¹tna
		matrix[0][0] = true;
		matrix[1][1] = true;
		matrix[2][2] = true;
		matrix[3][3] = true;
		
		// element w prawym dolnym rogu
		System.out.println("Prawy dolny emlement:" + matrix[matrix.length-1][matrix[matrix.length-1].length-1]);
	}

}
