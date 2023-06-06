package streams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class LecturaTeclado {

	public static void main(String[] args) {
		
//		Scanner tec = new Scanner(System.in);
//		
//		String linea = tec.nextLine();
//		
//		System.out.println(linea);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String linea = br.readLine();
			System.out.println(linea);
		} catch (IOException e) {

		}
		
	}
}
