package genericos;

import java.util.Iterator;

public class ListaEnlazada<T> implements Lista<T> {

	private Nodo primero;
	private Nodo ultimo;
	private int cant;

	public ListaEnlazada() {
		primero = null;
		ultimo = null;
		cant = 0;
	}
	
	@Override
	public void agregar(T dato) {
		Nodo nuevo = new Nodo(dato);
		if(primero == null) {
			primero = nuevo;
		} else {
			ultimo.siguiente = nuevo;
		}
		ultimo = nuevo;
		cant++;
	}

	@Override
	public T eliminar(int pos) {
		Nodo anterior = buscarNodo(pos-1);
		Nodo eliminado = anterior.siguiente;
		anterior.siguiente = eliminado.siguiente;
		return eliminado.dato;
	}

	@Override
	public T buscar(int pos) {
		return buscarNodo(pos).dato;
	}
	
	private Nodo buscarNodo(int pos) {
		Nodo aux = primero;
		for (int i = 0; i < pos; i++) {
			aux = aux.siguiente;
		}
		return aux;
	}
	

	@Override
	public int tamanyo() {
		return cant;
	}

	@Override
	public boolean estaVacia() {
		return cant == 0;
//		primero == null;
	}

	@Override
	public Iterator<T> iterator() {
		return new IterLista();
	}
	
	private class IterLista implements Iterator<T>{

		private Nodo proximo = primero;
		
		@Override
		public boolean hasNext() {
			return proximo != null;
		}

		@Override
		public T next() {
			T dato = proximo.dato;
			proximo = proximo.siguiente;
			return dato;
		}
	}

	private class Nodo{
		T dato;
		Nodo siguiente;
		
		Nodo(T dato){
			this.dato = dato;
		}
	}

}
