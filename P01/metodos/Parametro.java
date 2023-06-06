package metodos;

public class Parametro {

	public static void cambia(int a) {
		a = 0;
	}
	
	public static void main(String[] args) {
		int a = 999;
		cambia(a);
		System.out.println(a);
	}
}
