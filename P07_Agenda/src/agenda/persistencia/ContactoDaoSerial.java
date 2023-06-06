package agenda.persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import agenda.modelo.Contacto;

public class ContactoDaoSerial implements ContactoDao, Serializable {

	private Almacen almacen;
	private final String FICHERO = "agenda.dat";

	public ContactoDaoSerial() {
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICHERO))) {
			almacen = (Almacen) ois.readObject();
		} catch (FileNotFoundException e) {
			almacen = new Almacen();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	private void grabarAlmacen() {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICHERO))) {
			oos.writeObject(almacen);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException();
		}
	}

	@Override
	public void insertar(Contacto c) {
		c.setIdContacto(++almacen.ultimoId);
		almacen.mapa.put(c.getIdContacto(), c);
		grabarAlmacen();
	}

	@Override
	public void actualizar(Contacto c) {
		almacen.mapa.put(c.getIdContacto(), c);
		grabarAlmacen();
	}

	@Override
	public Contacto eliminar(int idContacto) {
		Contacto eli = almacen.mapa.remove(idContacto);
		grabarAlmacen();
		return eli;
	}

	@Override
	public Contacto buscar(int idContacto) {
		return almacen.mapa.get(idContacto);
	}

	@Override
	public Set<Contacto> buscar() {
		return new TreeSet<>(almacen.mapa.values());
	}

	@Override
	public Set<Contacto> buscar(String nom) {
		Set<Contacto> resu = new TreeSet<>();
		nom = nom.toLowerCase();
		for (Contacto c : almacen.mapa.values()) {
			if (c.getNombre().toLowerCase().contains(nom) || c.getApellidos().toLowerCase().contains(nom)
					|| c.getApodo().toLowerCase().contains(nom)) {
				resu.add(c);
			}
		}
		return resu;
	}
	
	private class Almacen implements Serializable {
		private static final long serialVersionUID = 1L;

		Map<Integer, Contacto> mapa;
		int ultimoId;

		Almacen() {
			mapa = new HashMap<>();
		}
	}
}
