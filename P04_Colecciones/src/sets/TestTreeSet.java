package sets;

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import modelo.Contacto;
import modelo.ContactoNombreComparator;

public class TestTreeSet {
	
	public static void main(String[] args) {
		
		Set<String> palabras = new TreeSet<>();
		palabras.add("uno");
		palabras.add("dos");
		palabras.add("tres");
		palabras.add("cuatro");
		palabras.add("cinco");
		palabras.add("DOS");
		palabras.add("UNO");
		
		for (String palabra : palabras) {
			System.out.println(palabra);
		}
		
		Set<Integer> numsSet = new TreeSet<>();
		numsSet.add(45);
		numsSet.add(450);
		numsSet.add(145);
		numsSet.add(5);
		numsSet.add(9);
		numsSet.add(10);
		
		for (Integer integer : numsSet) {
			System.out.println(integer);
		}
		
		Integer integ = 56;
		System.out.println(integ.compareTo(56));
		
		
//		Set<Contacto> contactos = new TreeSet<>(); // ordenara por orden natural
//		Set<Contacto> contactos = new TreeSet<>(new ContactoNombreComparator());
		Set<Contacto> contactos = new TreeSet<>(Contacto.comparatorNombre());
//		Set<Contacto> contactos = new TreeSet<>(new Comparator<Contacto>() {
//			@Override
//			public int compare(Contacto c1, Contacto c2) {
//				String primero = c1.getApellidos() + c1.hashCode();
//				String segundo = c2.getApellidos() + c2.hashCode();
//				return primero.compareToIgnoreCase(segundo);
//			}
//		});
//		Set<Contacto> contactos = new TreeSet<>((c1,c2)->c1.getIdContacto()-c2.getIdContacto());
		contactos.add(new Contacto(1, "Pedro", "Ramirez"));
		contactos.add(new Contacto(7, "Juan", "Perez"));
		contactos.add(new Contacto(2, "Maria", "Arnau"));
		contactos.add(new Contacto(95, "Ángel", "Bustamante"));
		contactos.add(new Contacto(45, "ana", "Bustamante"));
		contactos.add(new Contacto(28, "José", "Bustamante"));
		contactos.add(new Contacto(55, "Josefina ", "Perez"));
		contactos.add(new Contacto(55, "Josefina", "Lopez"));
		
		for (Contacto c: contactos) {
			System.out.println(c);
		}
		
	}
}
