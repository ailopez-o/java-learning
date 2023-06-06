package streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerFicheroAutoCloseable {
	public static void main(String[] args) {

		String fichero = "/datos/productos.xml";
		
		try(BufferedReader br = new BufferedReader(new FileReader(fichero))){
			String linea;
			while((linea = br.readLine()) != null) {
				System.out.println(linea);
			}
		}catch(IOException e) {
			System.out.println("esto no rula!!!");
		}
	}
}
