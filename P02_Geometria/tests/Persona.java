package tests;

import java.util.Objects;

public class Persona extends Ente {

	int idPersona;
	String nombre;
	String apellido1;
	String apellido2;
	int edad;
	double saldo;
	
	public Persona(String nombre, String apellido1) {
		System.out.println("constructor de Persona con 2 parametros");
		this.nombre = nombre;
		this.apellido1 = apellido1;
	}
	
	public Persona(String nombre, String apellido1, String apellido2) {
		this(nombre, apellido1);
		System.out.println("constructor de Persona con 3 parametros");
		this.apellido2 = apellido2;
	}
	
	public Persona(String nombre, String apellido1, String apellido2, int edad) {
		this(nombre, apellido1, apellido2);
		System.out.println("constructor de Persona con 4 parametros");
		this.edad = edad;
	}
	
	public Persona(String nombre, int edad, double saldo) {
		this.nombre = nombre;
		this.edad = edad;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idPersona);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return idPersona == other.idPersona;
	}
	
	
	
	
}
