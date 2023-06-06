package introduccion;

public class AmbitoVariables {
	public static void main(String[] args) {
		int varMain = 5;
		int otra = 0;
		
		
		if(otra == 0) {
			System.out.println(varMain);
			int varIf = 56;
		}
		
//		System.out.println(varIf);
		
		{
			int varLocal = 9;
		}
		
//		System.out.println(varLocal);
		
		int i;
		for (i=1; i<=8 && varMain != 5; i++) {
			System.out.println(i);
		}
		
		System.out.println(i);
		
	}
}
