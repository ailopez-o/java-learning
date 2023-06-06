package colecciones;

public class ListaEnlazada implements Lista {

	private Nodo primero;
	private Nodo ultimo;
	private int cant;

	public ListaEnlazada() {
		primero = null;
		ultimo = null;
		cant = 0;
	}
	
	@Override
	public void agregar(String dato) {
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
	public String eliminar(int pos) {
		Nodo anterior = buscarNodo(pos-1);
		Nodo eliminado = anterior.siguiente;
		anterior.siguiente = eliminado.siguiente;
		return eliminado.dato;
	}

	@Override
	public String buscar(int pos) {
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

	private class Nodo{
		String dato;
		Nodo siguiente;
		
		Nodo(String dato){
			this.dato = dato;
		}
	}
}
