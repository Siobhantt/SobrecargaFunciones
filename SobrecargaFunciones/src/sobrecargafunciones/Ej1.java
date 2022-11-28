package sobrecargafunciones;

import java.util.Scanner;

public class Ej1 {
/*Diseña dos funciones de nombre suma que hagan lo siguiente:
La primera de las funciones recibirá dos argumentos de tipo entero y devolverá la suma de ambos. El valor a devolver también será entero.
La segunda de las funciones recibirá dos argumentos de tipo double y devolverá la suma de ambos. El tipo a devolver debe ser también double.
*/
	
	static int suma (int a, int b) {
		
		return a+b;
	}
	
	static double suma (double a, double b) {
		
		return a+b;
	}
	
	public static void main(String[] args) {
		//Declaramos la varibales
		
		int num1, num2, restoI;
		double nd1, nd2, restoD;
		
		//Iniciamos el Scanner
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Por favor introduzca los numeros que quiere sumar: ");
		
		num1 = lee.nextInt();
		
		num2 = lee.nextInt();
		
		nd1 = lee.nextDouble();
		
		nd2 = lee.nextDouble();
		
		System.out.println(restoI = suma(num1, num2));
		
		System.out.println(restoD = suma(nd1, nd2));
		
		
		

	}

}
