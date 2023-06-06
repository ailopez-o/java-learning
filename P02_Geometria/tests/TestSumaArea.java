package tests;

import modelo.Figura;
import modelo.Rectangulo;
import otromodelo.Circulo;

public class TestSumaArea {
	
	public static double sumaArea(Figura[] figs) {
		double area = 0;
		for (int i = 0; i < figs.length; i++) {
			area += figs[i].area();
		}
		return area;
	}
	
	public static void main(String[] args) {
		Figura[] figuras = new Figura[4];
		figuras[0] = new Rectangulo(1,2,4,5);
		figuras[1] = new Circulo(0, 3.6, 1);
		figuras[2] = new Circulo(1, 2.5, 2.6);
		figuras[3] = new Rectangulo(2,0,8,9);
		
		System.out.println(sumaArea(figuras));
		
	}
}
