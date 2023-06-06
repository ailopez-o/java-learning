package poo;

public class TestTriangulo {
	public static void main(String[] args) {
		TrianguloRectangulo tr = new TrianguloRectangulo();
		tr.asignarValores(3, 4);
		
		System.out.println("cateto1: " + tr.c1);
		System.out.println("cateto2: " + tr.c2);
		System.out.println("hipotenusa: " + tr.hipotenusa());
	}
}
