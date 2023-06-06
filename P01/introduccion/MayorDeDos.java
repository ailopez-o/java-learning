package introduccion;

import java.util.Scanner;

public class MayorDeDos {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int num1, num2, mayor;
		
		System.out.print("num1: ");
		num1 = tec.nextInt();

		System.out.print("num2: ");
		num2 = tec.nextInt();
		
		if(num1 >= num2) {
			mayor = num1;
		} else {
			mayor = num2;
		}
		
//		mayor = num1 >= num2 ? num1 : num2;
		
		System.out.println("El mayor es " + mayor);
	}
}
