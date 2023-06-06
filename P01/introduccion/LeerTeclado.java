package introduccion;

import java.util.Scanner;

public class LeerTeclado {
	
	public static void main(String[] entrada) {
		
		Scanner tec = new Scanner(System.in);
		
		System.out.print("Ingresa tu nombre: ");
		
		String nombre = tec.nextLine();
		
		System.out.println("Hola " + nombre + ", bienvenido!");
		
	}
}
