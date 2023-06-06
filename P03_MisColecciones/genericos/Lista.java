package genericos;

public interface Lista <T> extends Iterable<T> {

	void agregar(T dato);
	
	T eliminar(int pos);
	
	T buscar(int pos);
	
	int tamanyo();
	
	boolean estaVacia();
	
}
