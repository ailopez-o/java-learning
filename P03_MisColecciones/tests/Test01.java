package tests;

import colecciones.Lista;
import colecciones.ListaArray;
import colecciones.ListaEnlazada;

public class Test01 {

	public static void main(String[] args) {

		Lista miLista = new ListaArray();
		miLista.agregar("primero");
		miLista.agregar("segundo");
		miLista.agregar("tercero");
		
		System.out.println(miLista);
		
		System.out.println(miLista.eliminar(1));
		System.out.println(miLista);
		
		
		Lista nueva = new ListaEnlazada();
		nueva.agregar("pri");
		nueva.agregar("seg");
		nueva.agregar("ter");
		
		System.out.println(nueva.buscar(1));
	}

}
