package lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class RecorreSecuencial {
	public static void main(String[] args) {
		List<String> al = new ArrayList<>();
		List<String> ll = new LinkedList<>();
		
		final int CANTIDAD = 5_000_000;
		
		cargaLista(al, CANTIDAD);
		cargaLista(ll, CANTIDAD);
		
		long t0 = System.currentTimeMillis();
		recorreIterator(al);
		long tf = System.currentTimeMillis();
		System.out.println("ArrayList: " + (tf-t0));
		
		t0 = System.currentTimeMillis();
		recorreIterator(ll);
		tf = System.currentTimeMillis();
		System.out.println("LinkedList: " + (tf-t0));
		
		
	}
	
	public static void cargaLista(List<String> l, int cant) {
		for (int i = 0; i < cant; i++) {
			l.add("algo");
		}
	}
	
	
	public static void recorre(List<String> l) {
		for (int i = 0; i < l.size(); i++) {
			String cadena = l.get(i);
		}
	}
	
	public static void recorreIterator(List<String> l) {
		Iterator<String> it = l.iterator();
		while (it.hasNext()) {
			String cadena = it.next();
		}
	}
	
	public static void recorreForEach(List<String> l) {
		for (String cadena : l) {

		}
	}
}
