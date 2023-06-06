package modelo;

public class Rectangulo extends Figura {

	public double lado1;
	public double lado2;
	
//	public void asignarValores(double x, double y, double lado1, double lado2) {
//		super.asignarValores(x, y);
//		this.lado1 = lado1;
//		this.lado2 = lado2;
//	}

	public Rectangulo() {

	}
	
	public Rectangulo(double x, double y, double lado1, double lado2) {
		super(x, y);
		this.lado2 = lado2;
		this.lado1 = lado1;
	}
	
	public double area() {
		return lado1 * lado2;
	}
	
}
