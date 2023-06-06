package colecciones;

public class ListaArray implements Lista {

	private String[] almacen;
	private int cantidad;
	
	public ListaArray() {
		this(10);
	}
	
	public ListaArray(int cant) {
		almacen = new String[cant];
	}
	
	@Override
	public void agregar(String dato) {
		if(almacen.length == cantidad) {
			redimensionar();
		}
		almacen[cantidad] = dato;
		cantidad ++;
	}

	@Override
	public String eliminar(int pos) {
		String eliminado = buscar(pos);
		for (int i = pos + 1; i < cantidad; i++) {
			almacen[i-1] = almacen[i]; 
		}
		cantidad--;
		return eliminado;
	}

	@Override
	public String buscar(int pos) {
		return almacen[pos];
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
		String[] nuevo = new String[almacen.length * 2];
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
}
