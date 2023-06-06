package agenda.persistencia;

import java.util.Set;

import agenda.modelo.Contacto;

public interface ContactoDao {

	void insertar(Contacto c);
	
	void actualizar(Contacto c);
	
	Contacto eliminar(int idContacto);
	
	Contacto buscar(int idContacto);
	
	Set<Contacto> buscar();
	
	Set<Contacto> buscar(String nom);
}
