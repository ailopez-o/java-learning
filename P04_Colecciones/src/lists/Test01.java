package lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test01 {
	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		
		lista.add("primero");
		lista.add("segundo");
		lista.add("tercero");
		lista.add("cuarto");
		lista.add("quinto");
		
		System.out.println(lista.get(4));
		
		List<String> otraLista = new LinkedList<>(lista);
		System.out.println(otraLista.get(4));
		
		System.out.println();
		recorre(lista);
		System.out.println();
		recorre(otraLista);

		System.out.println();
		recorreIterator(lista);
		System.out.println();
		recorreIterator(otraLista);
		
		System.out.println();
		recorreForEach(lista);
		System.out.println();
		recorreForEach(otraLista);
	}
	
	public static void recorre(List<String> l) {
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
		}
	}
	
	public static void recorreIterator(List<String> l) {
		Iterator<String> it = l.iterator();
		while (it.hasNext()) {
			String cadena = it.next();
			//trabajamos con cadena
			System.out.println(cadena);
		}
	}
	
	public static void recorreForEach(List<String> l) {
		for (String cadena : l) {
			System.out.println(cadena);
		}
	}
}
