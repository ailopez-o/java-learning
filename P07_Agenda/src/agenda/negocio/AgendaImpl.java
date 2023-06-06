package agenda.negocio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.Collator;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

import agenda.excepciones.ContactoIncorrectoException;
import agenda.modelo.Contacto;
import agenda.persistencia.ContactoDao;
import agenda.persistencia.ContactoDaoSerial;

public class AgendaImpl implements Agenda {

	private ContactoDao cDao;
	
	public AgendaImpl() {
		cDao = new ContactoDaoSerial();
	}
	
	public AgendaImpl(ContactoDao cDao) {
		this.cDao = cDao;
	}
	
	@Override
	public void insertarContacto(Contacto c) throws ContactoIncorrectoException {
		if(esContactoValido(c) && c.getIdContacto() == 0)
			cDao.insertar(c);
		else
			throw new ContactoIncorrectoException();
			
	}

	@Override
	public boolean eliminar(Contacto c) throws ContactoIncorrectoException {
		if(!existeContacto(c)) return false;

		return cDao.eliminar(c.getIdContacto()) != null;
	}

	@Override
	public void modificar(Contacto c) throws ContactoIncorrectoException {
		if(existeContacto(c))
			cDao.actualizar(c);
	}

	@Override
	public Set<Contacto> buscarTodos() {
		Set<Contacto> todos = new TreeSet<>(comparadorApellidosNombre());
		todos.addAll(cDao.buscar());
		return todos;
	}

	@Override
	public Set<Contacto> buscarContactoPorNombre(String nom) {
		return cDao.buscar(nom);
	}

	@Override
	public Contacto buscar(int idContacto) {
		return cDao.buscar(idContacto);
	}

	@Override
	public int importarCSV(String fichero) throws IOException {
		List<String> lineas = leerFicheroCSV(fichero);
		int cant = 0;
		for (String linea : lineas) {
			String[] datos = linea.split(";");
			Contacto c = creaContacto(datos);
			cDao.insertar(c);
			cant++;
		}
		return cant;
	}
	
	//nombre;apellidos;apodo;tipo_via;via;nro;piso,puerta;c_postal;ciudad;provincia;telefonos(/); correos
	
	private List<String> leerFicheroCSV(String fichero) throws IOException{
		List<String> resultado = new LinkedList<>();
		try(BufferedReader br = new BufferedReader(new FileReader(fichero))){
			String linea;
			while((linea = br.readLine()) != null) {
				resultado.add(linea);
			}
		}
		return resultado;
	}
	
	private Contacto creaContacto(String[] campos) {
		Contacto c = new Contacto();
		c.setNombre(campos[0]);
		c.setApellidos(campos[1]);
		c.setApodo(campos[2]);
		c.getDom().setTipoVia(campos[3]);
		c.getDom().setVia(campos[4]);
		try {
			c.getDom().setNumero(Integer.parseInt(campos[5]));
			c.getDom().setPiso(Integer.parseInt(campos[6]));
		}catch(NumberFormatException e) {
			//el numero sera 0
		}
		c.getDom().setPuerta(campos[7]);
		c.getDom().setCodigoPostal(campos[8]);
		c.getDom().setCiudad(campos[9]);
		c.getDom().setProvincia(campos[10]);
		c.addTelefonos(campos[11].split("/"));
		c.addCorreos(campos[12].split("/"));
		return c;
	}
	
	private Comparator<Contacto> comparadorApellidosNombre() {
        return (c1, c2) -> {
            if (c1.equals(c2)) {
                return 0;
            }
            String primero = c1.getApellidos() + c1.getNombre() + c1.hashCode();
            String segundo = c2.getApellidos() + c2.getNombre() + c2.hashCode();
            Collator col = Collator.getInstance(new Locale("es"));
            return col.compare(primero, segundo);
        };
    }

	private boolean existeContacto(Contacto c) throws ContactoIncorrectoException{
		if(!esContactoValido(c) || c.getIdContacto() == 0)
			throw new ContactoIncorrectoException();
		return cDao.buscar(c.getIdContacto()) != null;
	}

	private boolean esContactoValido(Contacto c) {
		if(c == null) return false;
		if(isEmpty(c.getNombre())) return false;
		if(isEmpty(c.getApellidos())) return false;
		if(isEmpty(c.getApodo())) return false;
		return true;
	}
	
	private boolean isEmpty(String s) {
		return s == null || s.trim().length() == 0;
	}


}
