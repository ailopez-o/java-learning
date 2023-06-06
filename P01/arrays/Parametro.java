package arrays;

public class Parametro {
	public static void cambia(int a) {
		a = 0;
	}
	
	public static void cambia(int[] nums) {
		nums = new int[3];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 0;
		}
	}
	
	public static void main(String[] args) {
		int a = 999;
		cambia(a);
		System.out.println(a);
		
		int[] valores = {999,998, 997};
		cambia(valores);
		SumaArray.muestraArray(valores);
	}

}
