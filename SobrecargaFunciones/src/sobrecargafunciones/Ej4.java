package sobrecargafunciones;

import java.util.Scanner;

public class Ej4 {
/*Diseña dos funciones de nombre parseToBoolean que hagan lo siguiente:
La primera de las funciones recibirá un argumento de tipo entero que devuelva false si el argumento es 0 
y true si el argumento es 1.
La segunda de las funciones recibirá un argumento de tipo String
 que devuelva false si la cadena es igual a “false” y true si la cadena es igual a “true”.*/
	
	public static boolean parseToBoolean(int n) {
		
		boolean respuesta;
		
		if (n==0)  {
			respuesta = false;
		}
		
		else {
			respuesta = true;
		}
	return respuesta;
	}
	
	/*La segunda de las funciones recibirá un argumento 
	 * de tipo String que devuelva false si la cadena es igual a “false” y true si la cadena es igual a “true”.
*/
	
	public static boolean parseToBoolean(String cadena) {
		
		boolean respuesta = false;
		
		
		if (cadena.equals("true")) {
			
			respuesta = true;
		}
	return respuesta; 
	}
	
	public static void main(String[] args) {
		
		int numUser;
		String cadenaUser;
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca un numero: ");
		
		numUser = lee.nextInt();
		
		if (numUser ==1 || numUser==0) {
			
			System.out.println(parseToBoolean(numUser));
		
		}
		
		else {
			System.err.println("Error, introduzca 1 o 0.");
		}
		
	System.out.println("Introduzca false o true: ");
	
	cadenaUser = lee.next();
	
	System.out.println(parseToBoolean(cadenaUser));
	
	//cerramos Scanner
	lee.close();
	}

}
