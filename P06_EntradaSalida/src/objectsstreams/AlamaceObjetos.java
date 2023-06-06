package objectsstreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import modelo.Contacto;

public class AlamaceObjetos {

	public static void main(String[] args) {
		
		String fichero = "contactos.dat";
		Map<Integer, Contacto> mapa;
		
		try {
			mapa = lee(fichero);
			System.out.println("Contactos leidos");
			for(Contacto c : mapa.values()) {
				System.out.println(c);
			}
			
		} catch(RuntimeException e) {
			System.out.println("No hay contactos almacenados");
			mapa = new HashMap<>();
			rellena(mapa);
			guarda(mapa, fichero);
			System.out.println("Contactos almacendos");
		}
		
	}
	
	
	
	public static void rellena(Map<Integer, Contacto> mapa) {
		mapa.put(1, new Contacto(1, "Pedro", "Ramirez"));
		mapa.put(7, new Contacto(7, "Juan", "Perez"));
		mapa.put(2, new Contacto(2, "Maria", "Arnau"));
		mapa.put(95, new Contacto(95, "Ángel", "Bustamante"));
		mapa.put(45, new Contacto(45, "ana", "Bustamante"));
		mapa.put(28, new Contacto(28, "José", "Bustamante"));
		mapa.put(55, new Contacto(55, "Josefina ", "Perez"));
	}
	
	public static void guarda(Map<Integer, Contacto> mapa, String fichero) {
		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fichero))){
			oos.writeObject(mapa);
		} catch(IOException e) {
			throw new RuntimeException("Error al grabar " + fichero);
		}
	}
	
	public static Map<Integer, Contacto> lee(String fichero){
		Map<Integer, Contacto> mapa;
		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fichero))){
			
			mapa = (Map<Integer, Contacto>)ois.readObject();
		
		} catch(IOException e) {
			throw new RuntimeException("Error al leer " + fichero);
		} catch(ClassNotFoundException e) {
			throw new RuntimeException("No esta definida la clase");
		}
		return mapa;
	}
}
