package excepciones;

import java.io.IOException;
import java.sql.SQLException;

public class Test01 {

	public static void main(String[] args) {
		System.out.println("comienza");
		try {
			metodoB();
		} catch(SQLException e) {
			System.out.println("arreglado!!!");
		} catch(IOException e) {
			
		} catch(Exception e) {
			
		}
		System.out.println("finaliza main ok");
	}
	
	public static void metodoB() throws Exception {
		System.out.println("linea1 de B");
		try {
			metodoC(5);
			System.out.println("se ejecuta si metodoC no falla");
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		} catch(SQLException e) {
			throw new RuntimeException(e.getMessage());
		}
		System.out.println("linea2 de B");
	}
	
	
	public static void metodoC(int num) throws SQLException, IOException {
		String algo = null;
		if(num < 0)
			System.out.println(algo.toUpperCase());
		else if(num > 4) {
			// supongo que accedo a la bbdd
			throw new SQLException("la sintaxis de la consulta es incorrecta");
		}
		int[] nums = {1,2,3};
		System.out.println(nums[num]);
	}
}
