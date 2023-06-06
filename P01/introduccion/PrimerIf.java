package introduccion;

import java.util.Scanner;

public class PrimerIf {
	public static void main(String[] arg) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("a: ");
		int a = tec.nextInt();
		
		if(a >= 0) {
			System.out.println("el numero ingresa es positivo");
			System.out.println("o es 0");
		}
		
		System.out.println("adios");
		
	}
}
