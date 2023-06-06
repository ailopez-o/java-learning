package tests;

import modelo.Figura;
import modelo.Rectangulo;
import otromodelo.Circulo;

public class Test01 {
	public static void main(String[] args) {
		Rectangulo otro = new Rectangulo();
		otro.setX(7);
		otro.setY(1.7);
		otro.lado1 = 6;
		otro.lado2 = 7;

		Rectangulo r = new Rectangulo(1.5, 2, 4, 3.6);
//		r.asignarValores(1.5, 2, 4, 3.6);

//		r.x = 1.5;
//		r.y = 2;
//		r.lado1 = 4;
//		r.lado2 = 3.6;

		System.out.println(r.area());

		Circulo c = new Circulo(1.5, 5, 1.9);

		System.out.println(c.area());

		procesaFigura(c);
		
	
	}

	public static void procesaFigura(Figura f) {
		if (f instanceof Circulo) {
			Circulo c = (Circulo) f;
			System.out.println(c.radio);
		} else {
			System.out.println("no es un circulo");
		}
	}

}
