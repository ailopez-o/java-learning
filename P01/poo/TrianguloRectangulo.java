package poo;

public class TrianguloRectangulo {
	
	public double c1;
	public double c2;
	
	public void asignarValores(double cateto1, double cateto2) {
		c1 = cateto1;
		c2 = cateto2;
	}
	
	public double hipotenusa() {
		return Math.sqrt(c1*c1 + c2*c2);
	}
}
