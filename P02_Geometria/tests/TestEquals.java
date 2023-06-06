package tests;

import modelo.Rectangulo;
import otromodelo.Circulo;

public class TestEquals {
	public static void main(String[] args) {
		Circulo c1 = new Circulo(1,2,3);
		Circulo c2 = new Circulo(1,2,3);
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		
		Rectangulo r = new Rectangulo(1,2,3,4);
		
		Rectangulo r1 = new Rectangulo(1,2,3,4);
		
		r.equals(new Rectangulo(1,3,2,4));
		
		System.out.println(c1);
		
		String resultado = "resultado: " + r1;
		System.out.println(resultado);
		
	}
}
