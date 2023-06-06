package cadenas;

public class Palindromo {

	public static boolean esPalindromo(String cadena) {
		cadena = preparaCadena(cadena);
		boolean iguales = true;
		int i = 0;
		int d = cadena.length() - 1;
		while (i < d && iguales) {
			if (cadena.charAt(i) == cadena.charAt(d)) {
				i++;
				d--;
			} else
				iguales = false;
		}
		return iguales;
	}

	public static boolean esPalindromo2(String cadena) {
		cadena = preparaCadena(cadena);
		boolean iguales = true;
		for (int i = 0, d = cadena.length() - 1; i < d && iguales; i++, d--) {
			if (cadena.charAt(i) != cadena.charAt(d))
				iguales = false;
		}
		return iguales;
	}

	public static String preparaCadena(String cadena) {
		return cadena.toLowerCase().replace(" ", "");
	}

	public static void main(String[] args) {
		System.out.println(esPalindromo("asdf"));
		System.out.println(esPalindromo("w"));
		System.out.println(esPalindromo("wew"));
		System.out.println(esPalindromo("dabalearrozalazorraelabad"));
		System.out.println(esPalindromo("Dabale arroz a la zorra el Abad"));

		System.out.println(esPalindromo2("asdf"));
		System.out.println(esPalindromo2("w"));
		System.out.println(esPalindromo2("wew"));
		System.out.println(esPalindromo2("dabalearrozalazorraelabad"));
		System.out.println(esPalindromo2("Dabale arroz a la zorra el Abad"));
		
	}
}
