package arrays;

public class MuestraMatriz {
	
	public static void muestraMatriz(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int traza(int[][] m) {
		int suma = 0;
		int min = Math.min(m.length, m[0].length);
		for (int i = 0; i < min; i++) {
			suma += m[i][i];
		}
		return suma;
	}
	
	public static void main(String[] args) {
		int[][] m1 = {{1,2,3,9,7}, {4,5}, {7,8,9}};
		
		int[][] m2 = { {1,2,3} ,{5,6,7} ,{9,8,7}};
		int[][] m3 = { {1,2,3,4} ,{5,6,7,8} ,{9,8,7,0}};
		int[][] m4 = { {1,2} ,{5,6} ,{9,8}};
		
		
		muestraMatriz(m2);
		System.out.println("Traza: " + traza(m2));
		System.out.println();
		
		muestraMatriz(m3);
		System.out.println("Traza: " + traza(m3));
		System.out.println();

		muestraMatriz(m4);
		System.out.println("Traza: " + traza(m4));
		System.out.println();
	}
}
