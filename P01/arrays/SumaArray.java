package arrays;

public class SumaArray {

	public static void main(String[] args) {
		int[] nums = {4,6,4,778,3};
		int[] nums1 = {1,2,3,4,8};
		
		int[] resultado = sumaArrayIguales(nums, nums1);

		muestraArray(nums);
		muestraArray(nums1);
		muestraArray(resultado);
	}
	
	public static void muestraArray(int[] valores) {
		for(int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		System.out.println();
	}
	
	public static int[] sumaArrayIguales(int[] a1, int[] a2) {
		for(int i=0; i < a1.length; i++) {
			a2[i] += a1[i];
		}
		return a2;
	}
	
	public static int[] suma(int[] a1, int[] a2) {
		int[] resu = new int[Math.max(a1.length, a2.length)];
		for(int i = 0; i < resu.length; i++) {
			resu[i] = (i < a1.length ? a1[i] : 0) + (i < a2.length ? a2[i] : 0); 
		}
		return resu;
	}
}
