package tests;

import java.io.IOException;

import agenda.modelo.Contacto;
import agenda.negocio.Agenda;
import agenda.negocio.AgendaImpl;
import agenda.persistencia.ContactoDaoSerial;

public class TestCSV {
	public static void main(String[] args) throws IOException {
		Agenda neg = new AgendaImpl(new ContactoDaoSerial());
		
		for (Contacto contacto : neg.buscarTodos()) {
			System.out.println(contacto);
		}
		
		System.out.println(neg.importarCSV("contactos.csv"));
		
		for (Contacto contacto : neg.buscarTodos()) {
			System.out.println(contacto);
		}
		
	}
}
