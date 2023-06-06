package metodos;

public class TestMetodo {
	
	public static int mayor(int n1, int n2) { //firma:   mayor(int,int)
		return n1 > n2 ? n1 : n2;
	}
	
//	public static double mayor(int a, int b) { //firma:   mayor(int,int)
//		return 0;
//	}
	
	public static int mayor(int n1, int n2, int n3) {// firma:   mayor(int,int,int)
//		int m = mayor(n1,n2);
//		return mayor(m, n3);
		return mayor(mayor(n1,n2),n3);
	}
	
	public static int pow(int base, int exp) {
		int pot = 1;
		for (int i = 1; i <= exp; i++) {
			pot *= base;
		}
		return pot;
	}
	
	public static void main(String[] args) {
		System.out.println(mayor(15,21));
		System.out.println(mayor(45,21));
		
		System.out.println(pow(5,3));
		
		System.out.println(mayor(4,5,7));
		System.out.println(mayor(14,5,7));
		System.out.println(mayor(4,50,7));
	}
}
