package modelo;

public abstract class Figura {

	protected double x;
	protected double y;
	
	public Figura(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public Figura() {

	}
	
	public abstract double area();
	
	public static void cuentaFiguras() {
		System.out.println("Esto cuenta figuras");
	}
	
	public boolean equals(Object o) {
		if(o == null) return false;
		if(this == o) return true;
		if(this.getClass() != o.getClass()) return false;
		//aplicamos la regla de negocio
		// o no es null y o es de mi misma clase
		
		System.out.println(this.getClass().getName());
		
		Figura otro = (Figura)o;
		return this.x == otro.x && this.y == otro.y && this.area() == otro.area();

		
		//		return this.x == ((Figura)o).x && this.y == ((Figura)o).y;
	}
	
	public double getX() {
		return x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setX(double x) {
		this.x = x;
	}
	
	public void setY(double y) {
		this.y = y;
	}
}
