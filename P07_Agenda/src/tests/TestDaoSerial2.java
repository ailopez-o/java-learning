package tests;

import agenda.modelo.Contacto;
import agenda.persistencia.ContactoDao;
import agenda.persistencia.ContactoDaoSerial;

public class TestDaoSerial2 {

	public static void main(String[] args) {
		
		ContactoDao cDao = new ContactoDaoSerial();
		
		System.out.println(cDao.buscar(5));
		
		for (Contacto c : cDao.buscar("pe")) {
			System.out.println(c);
		}
		
		cDao.eliminar(2);
		
		for (Contacto c : cDao.buscar("pe")) {
			System.out.println(c);
		}
		
	}
}
