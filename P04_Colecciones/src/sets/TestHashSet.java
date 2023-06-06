package sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import modelo.Contacto;

public class TestHashSet {
	
	public static void main(String[] args) {
		
		Set<Contacto> contactos = new LinkedHashSet<>();
		contactos.add(new Contacto(1, "Pedro", "Ramirez"));
		contactos.add(new Contacto(7, "Juan", "Perez"));
		contactos.add(new Contacto(2, "Maria", "Arnau"));
		contactos.add(new Contacto(95, "Silvia", "Bustamante"));
		
		for (Contacto c: contactos) {
			System.out.println(c);
		}
		
	}
}
