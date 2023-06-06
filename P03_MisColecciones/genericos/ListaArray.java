package genericos;

import java.util.Iterator;

public class ListaArray<T> implements Lista<T> {

	private Object[] almacen;
	private int cantidad;
	
	public ListaArray() {
		this(10);
	}
	
	public ListaArray(int cant) {
		almacen = new Object[cant];
	}
	
	@Override
	public void agregar(T dato) {
		if(almacen.length == cantidad) {
			redimensionar();
		}
		almacen[cantidad] = dato;
		cantidad ++;
	}

	@Override
	public T eliminar(int pos) {
		T eliminado = buscar(pos);
		for (int i = pos + 1; i < cantidad; i++) {
			almacen[i-1] = almacen[i]; 
		}
		cantidad--;
		return eliminado;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T buscar(int pos) {
		return (T)almacen[pos];
	}

	@Override
	public int tamanyo() {
		return cantidad;
	}

	@Override
	public boolean estaVacia() {
		return cantidad == 0;
	}

	private void redimensionar() {
		Object[] nuevo = new Object[almacen.length * 2];
		for (int i = 0; i < almacen.length; i++) {
			nuevo[i] = almacen[i];
		}
		almacen = nuevo;
	}
	
	@Override
	public String toString() {
		StringBuilder salida = new StringBuilder(cantidad);
		for (int i = 0; i < cantidad; i++) {
			salida.append(almacen[i] + " ");
		}
		return salida.toString();
		
	}

	@Override
	public Iterator<T> iterator() {
		return new IterLista();
	}
	
	private class IterLista implements Iterator<T>{

		private int proximo = 0;
		
		@Override
		public boolean hasNext() {
			return proximo < cantidad;
		}

		@Override
		public T next() {
			return (T)almacen[proximo++];
		}
		
	}
}
