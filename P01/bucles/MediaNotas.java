package bucles;

import java.util.Scanner;

public class MediaNotas {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		double nota, media, suma = 0, mayor, menor;
		int cont = 0;
		
		do {
			System.out.print("Nota (-1 fin): ");
			nota = tec.nextDouble();
		} while(nota > 10);
		
		mayor = nota;
		menor = nota;
		while(nota >= 0) {
			suma += nota;
			cont++;
			if(nota > mayor)
				mayor = nota;
			if(nota < menor)
				menor = nota;
			
			do {
				System.out.print("Nota (-1 fin): ");
				nota = tec.nextDouble();
			} while(nota > 10);
		}
		
		if(cont > 0) {
			media = suma / cont;
//			System.out.println();
			System.out.println("\nCantidad de Notas: " + cont);
			System.out.println("Nota media: " + media);
			System.out.println("Nota mayor: " + mayor);
			System.out.println("\"Nota menor: " + menor + "\"");
		}
	}
}
