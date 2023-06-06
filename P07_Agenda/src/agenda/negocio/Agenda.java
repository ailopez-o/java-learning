package agenda.negocio;

import java.io.IOException;
import java.util.Set;

import agenda.excepciones.ContactoIncorrectoException;
import agenda.modelo.Contacto;

public interface Agenda {

	void insertarContacto(Contacto c) throws ContactoIncorrectoException ;
	
	boolean eliminar(Contacto c) throws ContactoIncorrectoException ;
	
	void modificar(Contacto c) throws ContactoIncorrectoException ;
	
	/** retornar los contactos ordenados por apellidos y nombre
	 * 
	 * @return
	 */
	Set<Contacto> buscarTodos();
	
	Set<Contacto> buscarContactoPorNombre(String nom);
	
	Contacto buscar(int idContacto);
	
	int importarCSV(String fichero) throws IOException;
}
