package bucles;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner tec = new Scanner(System.in);
		
		int num, suma = 0, cant;
		double media;
		
		System.out.print("Cantidad de valores a procesar: ");
		cant = tec.nextInt();
		
		for(int i = 1; i <= cant; i++) {
			System.out.print("num: ");
			num = tec.nextInt();
			suma += num;
		}
		
		media = (double) suma / cant;
		
		System.out.println(media);
	}
}
