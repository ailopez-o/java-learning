package cadenas;

public class Concatena {
	
	public static void main(String[] args) {
		String nombre = "Juan";
		String apellido = "Perez";
		
		String nombreCompleto = nombre + " " + apellido;
		
		System.out.println(nombreCompleto);
		
		
		String algo = "";
		for(int i = 1; i <= 100; i++) {
			algo += "a";
		}
		System.out.println(algo);
	}
}
