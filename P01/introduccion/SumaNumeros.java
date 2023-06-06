package introduccion;

import java.util.Scanner;

public class SumaNumeros {
	
	public static void main(String[] arg) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.println("Suma dos numeros enteros");
		
		System.out.print("Num 1: ");
		int n1 = tec.nextInt();
		
		System.out.print("Num 2: ");
		int n2 = tec.nextInt();
		
		
		int resu = n1 + n2;
		
		System.out.println(n1 + " + " + n2 + " = " + resu);
	}
}
