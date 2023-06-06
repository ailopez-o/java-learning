package modelo;

import java.util.Comparator;

public class ContactoNombreComparator implements Comparator<Contacto> {

	@Override
	public int compare(Contacto c1, Contacto c2) {
		String primero = c1.getNombre() + c1.hashCode();
		String segundo = c2.getNombre() + c2.hashCode();
		return primero.compareToIgnoreCase(segundo);
	}

//	public static Comparator<Contacto> getInstance(){
//		return new ContactoNombreComparator();
//	}
//	
//	private ContactoNombreComparator() {}
}
