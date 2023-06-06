package maps;

import java.util.Map;
import java.util.TreeMap;

import modelo.Contacto;

public class TestMaps {

	public static void main(String[] args) {
		
		Map<Integer, Contacto> mapa = new TreeMap<>();
		
		mapa.put(1, new Contacto(1, "Pedro", "Ramirez"));
		mapa.put(7, new Contacto(7, "Juan", "Perez"));
		mapa.put(2, new Contacto(2, "Maria", "Arnau"));
		mapa.put(95, new Contacto(95, "Ángel", "Bustamante"));
		mapa.put(45, new Contacto(45, "ana", "Bustamante"));
		mapa.put(28, new Contacto(28, "José", "Bustamante"));
		mapa.put(55, new Contacto(55, "Josefina ", "Perez"));
		mapa.put(55, new Contacto(55, "Josefina", "Lopez"));

		Contacto buscado = mapa.get(95);
		
		if(buscado != null)
			System.out.println(buscado.getNombre());
		else
			System.out.println("no existe");
		
		for(Integer clave : mapa.keySet()) {
			System.out.println(clave);
		}
		
		for(Contacto contacto : mapa.values()) {
			System.out.println(contacto);
		}
		
		for(Map.Entry<Integer, Contacto> entry : mapa.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}
