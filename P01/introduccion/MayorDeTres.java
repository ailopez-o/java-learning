package introduccion;

import java.util.Scanner;

public class MayorDeTres {
	public static void main(String[] args) {
		
		Scanner tec = new Scanner(System.in);
		
		int num1, num2, num3, mayor;
		
		System.out.print("num1: ");
		num1 = tec.nextInt();

		System.out.print("num2: ");
		num2 = tec.nextInt();
		
		System.out.print("num3: ");
		num3 = tec.nextInt();
		
		if(num1 >= num2 && num1 >= num3) {
			mayor = num1;
		} else {
			if(num2 >= num1 && num2 >= num3) {
				mayor = num2;
			} else {
				mayor = num3;
			}
		}
		
		if(num1 >= num2 && num1 >= num3) {
			mayor = num1;
		} else if(num2 >= num1 && num2 >= num3) {
			mayor = num2;
		} else
			mayor = num3;
		
		
		System.out.println("El mayor es " + mayor);
	}
}
