package bucles;

import java.util.Scanner;

//Solicitar al usuario el tamaño del lado de un cuadrado
//Mostrar en consola el perimetro de un cuadrado de asteriscos de lado = tamaño
// ej: ingresa 4
//			****
//			*  *
//			*  *
//			****

public class CuadradoMarco {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Ingresa lado del cuadrado: ");
		int lado = tec.nextInt();
		
		//primera linea
		for (int j = 1; j <= lado ; j++) {
			System.out.print("*");
		}
		System.out.println();
		
		for (int i = 1; i <= lado-2; i++) {
			System.out.print("*");
			for (int j = 1; j <= lado -2; j++) {
				System.out.print(" ");
			}
			System.out.println("*");
		}

		//ultima linea
		for (int j = 1; j <= lado ; j++) {
			System.out.print("*");
		}
		System.out.println();

	}
}
