package modelo;

import java.io.Serializable;
import java.text.Collator;
import java.util.Comparator;
import java.util.Locale;

public class Contacto implements Comparable<Contacto>, Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int idContacto;
	private transient String nombre;
	private String apellidos;
	private String apodo;
	
	public Contacto(int idContacto, String nombre, String apellidos) {
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
