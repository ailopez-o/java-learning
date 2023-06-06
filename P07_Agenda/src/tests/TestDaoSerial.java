package tests;

import agenda.modelo.Contacto;
import agenda.persistencia.ContactoDao;
import agenda.persistencia.ContactoDaoSerial;

public class TestDaoSerial {

	public static void main(String[] args) {
		
		ContactoDao cDao = new ContactoDaoSerial();
		System.out.println("Todos los contactos");
		for(Contacto c : cDao.buscar()) {
			System.out.println(c);
		}
		
		cDao.insertar(new Contacto(0, "Pedro", "Ramirez"));
		cDao.insertar(new Contacto(0, "Juan", "Perez"));
		cDao.insertar(new Contacto(0, "Maria", "Arnau"));
		cDao.insertar(new Contacto(0, "Ángel", "Bustamante"));
		cDao.insertar(new Contacto(0, "ana", "Bustamante"));
		cDao.insertar(new Contacto(0, "José", "Bustamante"));
		cDao.insertar(new Contacto(0, "Josefina ", "Perez"));
		
		System.out.println("despues de insertar");
		for(Contacto c : cDao.buscar()) {
			System.out.println(c);
		}
		
 }
}
