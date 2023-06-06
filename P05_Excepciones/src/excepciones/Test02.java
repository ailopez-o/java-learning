package excepciones;

public class Test02 {
	public static void main(String[] args) {
		procesaRecurso();
	}
	
	public static void procesaRecurso() {
		String s = null;
		String fichero = null;
		try {
			fichero = "abro el fichero";
			System.out.println("leo el fichero");
//			s.toLowerCase();
//			try {
//				System.out.println("no deberia ejecutarse");
//			}finally {
//				System.out.println("xxxxx");
//			}
//			return;
		}finally {
			System.out.println("esto se ejecuta siempre!!");
			if(fichero != null)
				System.out.println();
		}
//		System.out.println("no deberia ejecutarse");
	}
}
