package otromodelo;

import modelo.Figura;

public class Circulo extends Figura {

	public double radio;
	
	public Circulo(double x, double y, double radio) {
		super(x, y);
		this.radio = radio;
	}
	
	public Circulo() {}
	
	public double area() {
		return Math.PI * radio * radio;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		// tenemos que comparar los radios
		Circulo otro = (Circulo)o;
		return this.radio == otro.radio;
	}
	
	public String toString() {
		return "Circ[" + x + ", " + y + ", " + radio + "]";
	}
}
