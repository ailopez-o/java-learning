package cadenas;

public class StringDinamico {
	
	public static void main(String[] args) {
		String s = new String("");
		StringBuilder sb = new StringBuilder("");
		
		long t0 = System.currentTimeMillis();
		for(int i=1; i<100_000; i++) {
			s += "a";
		}
		long tf = System.currentTimeMillis();
		System.out.println("String: " + (tf-t0) + " ms.");
		
		
		t0 = System.currentTimeMillis();
		for(int i=1; i<100_000; i++) {
			sb.append("a");
		}
		tf = System.currentTimeMillis();
		System.out.println("StringBuilder: " + (tf-t0) + " ms.");
	}
}
