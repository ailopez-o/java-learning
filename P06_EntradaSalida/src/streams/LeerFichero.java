package streams;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeerFichero {

	public static void main(String[] args) {

		String fichero = "/datos/productos.xml";
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(fichero));
			String linea = br.readLine();
			while (linea != null) {
				System.out.println(linea);
				linea = br.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra el fichero " + fichero);
		} catch (IOException e) {
			System.out.println("No se puede leer el fichero");
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					System.out.println("No se pudo cerrar el fichero");
				}
			}
		}
	}
}
