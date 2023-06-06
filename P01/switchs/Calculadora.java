package switchs;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] arg) {
		Scanner tec = new Scanner(System.in);
		
		double n1, n2, resultado;
		String operador;
		boolean error = false;
		
		System.out.print("Ingrese operador (+, -, *, /): ");
		operador = tec.nextLine();
		
		System.out.print("Primer operando: ");
		n1 = tec.nextDouble();
		
		System.out.print("Segundo operando: ");
		n2 = tec.nextDouble();
		
		switch(operador) {
		case "+":
			resultado = n1 + n2;
			break;
		case "-":
			resultado = n1 - n2;
			break;
		case "*":
		case "x":
			resultado = n1 * n2;
			break;
		case "/":
			if(n2 != 0)
				resultado = n1 / n2;
			else {
				System.out.println("No se puede divir po 0");
				error = true;
				resultado = 0;
			}
			break;
		default:
			System.out.println("El operador es incorrecto");
			error = true;
			resultado = 0;
		}
		
		if(!error) {
			System.out.println(n1 + operador + n2 + " = " + resultado);
		}
	
	}
}
