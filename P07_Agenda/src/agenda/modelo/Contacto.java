package agenda.modelo;

import java.io.Serializable;
import java.text.Collator;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;

public class Contacto implements Comparable<Contacto>, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idContacto;
	private String nombre;
	private String apellidos;
	private String apodo;
	private Set<String> telefonos;
	private Set<String> correos;
	private Domicilio dom;
	
	public Contacto() {
		telefonos = new LinkedHashSet<>();
		correos = new LinkedHashSet<>();
		dom = new Domicilio();
		apodo = "";
	}
	
	public Contacto(int idContacto, String nombre, String apellidos) {
		this();
		this.idContacto = idContacto;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}
	
	public int getIdContacto() {
		return idContacto;
	}
	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getApodo() {
		return apodo;
	}
	public void setApodo(String apodo) {
		this.apodo = apodo;
	}
	
	public Set<String> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(Set<String> telefonos) {
		this.telefonos = telefonos;
	}
	
	public void addTelefonos(String... telefonos) {
		for (int i = 0; i < telefonos.length; i++) {
			this.telefonos.add(telefonos[i]);
		}
	}

	public Set<String> getCorreos() {
		return correos;
	}

	public void setCorreos(Set<String> correos) {
		this.correos = correos;
	}
	
	public void addCorreos(String... correos) {
		for (int i = 0; i < correos.length; i++) {
			this.correos.add(correos[i]);
		}
	}

	public Domicilio getDom() {
		return dom;
	}

	public void setDom(Domicilio dom) {
		this.dom = dom;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) return false;
		if (this == obj) return true;
		if (this.getClass() != obj.getClass()) return false;
		Contacto otro = (Contacto)obj;
		return this.idContacto == otro.idContacto;
	}
	
	@Override
	public int hashCode() {
		return idContacto;
	}

	@Override
	public String toString() {
		return "[" + idContacto + ", " + nombre + ", " + apellidos + ", " + apodo + "]";
	}

	@Override
	public int compareTo(Contacto otro) {
		return this.idContacto - otro.idContacto;
	}

	public static Comparator<Contacto> comparatorNombre(){
		return new Comparator<Contacto>() {
			@Override
			public int compare(Contacto c1, Contacto c2) {
				if(c1.equals(c2)) return 0;
				
				String primero = c1.getNombre() + c1.hashCode();
				String segundo = c2.getNombre() + c2.hashCode();
				Collator col = Collator.getInstance(new Locale("es"));
				return col.compare(primero, segundo);
			}
		};
	}
}
