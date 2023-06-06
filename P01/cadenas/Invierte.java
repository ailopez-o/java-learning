package cadenas;

public class Invierte {

	public static String invierte(String cadena) {
		String inv = "";
		for (int i = cadena.length()-1; i >= 0; i--) {
			inv += cadena.charAt(i);
		}
		return inv;
	}
	
	public static String invierte2(String cadena) {
		String inv = "";
		for (int i = 0; i < cadena.length(); i++) {
			inv = cadena.charAt(i) + inv;
		}
		return inv;
	}
	
	public static boolean esPalindromo(String cadena) {
		return cadena.equals(invierte(cadena));
	}
	
	public static void main(String[] args) {
		System.out.println(invierte("123456"));
		System.out.println(invierte2("123456"));
		
		System.out.println(esPalindromo("hola"));
		System.out.println(esPalindromo("ana"));
	}
}
