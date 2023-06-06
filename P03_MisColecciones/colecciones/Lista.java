package colecciones;

public interface Lista {

	void agregar(String dato);
	
	String eliminar(int pos);
	
	String buscar(int pos);
	
	int tamanyo();
	
	boolean estaVacia();
	
}
