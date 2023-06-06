package bucles;

import java.util.Scanner;

//Solicitar al usuario el tamaño del lado de un cuadrado
//Mostrar en consola el perimetro de un cuadrado de asteriscos de lado = tamaño
// ej: ingresa 4
//			****
//			*  *
//			*  *
//			****

public class CuadradoMarco2 {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);

		System.out.print("Ingresa lado del cuadrado: ");
		int lado = tec.nextInt();

		for (int i = 1; i <= lado; i++) {
			for (int j = 1; j <= lado; j++) {
				if (i == lado || i == 1 || j == lado || j == 1)
					System.out.print("*");
				else
					System.out.print(" ");

			}
			System.out.println();
		}
	}
}
