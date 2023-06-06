package arrays;

import java.util.Scanner;

public class SumaArrays {
	public static void main(String[] args) {

//		System.out.println(rellenarScanner(null));
		
		int[] a1 = rellenarScanner();
		int[] a2 = rellenarScanner();
		
		int[] suma = sumaArrays(a1, a2);
		
	}

	public static int[] rellenarScanner() {
		Scanner sc = new Scanner(System.in);
		System.out.println("cant datos..");
		int cant = sc.nextInt();
		int[] rellenado = new int[cant];
		for (int i = 0; i < rellenado.length; i++) {
			System.out.print("valor: ");
			rellenado[i] = sc.nextInt();
		}
		return rellenado;
	}

	public static int[] sumaArrays(int[] a, int[] b) {

		int[] resultado = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			resultado[i] = a[i] + b[i];
		}
		return resultado;
	}
}
