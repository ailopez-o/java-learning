package tests;

import java.util.Iterator;

import genericos.Lista;
import genericos.ListaArray;
import genericos.ListaEnlazada;

public class Test02Genericos {
	public static void main(String[] args) {
		
		Lista<Integer> miLista = new ListaArray<>();
		miLista.agregar(25);
		miLista.agregar(250);
		miLista.agregar(44);
		miLista.agregar(37);
		
		System.out.println(miLista.buscar(3));
		
		Integer resu = miLista.buscar(2);
		int otro = miLista.buscar(3);

		System.out.println(resu);
		System.out.println(otro);
		
		Lista<String> miListaDeCadenas = new ListaEnlazada<>();
		miListaDeCadenas.agregar("uno");
		miListaDeCadenas.agregar("dos");
		miListaDeCadenas.agregar("tres");
		
		for (String string : miListaDeCadenas) {
			System.out.println(string);
		}
		
		
		System.out.println();
		for(Integer num : miLista) {
			System.out.println(num);
		}
		
		Iterator<Integer> it = miLista.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
