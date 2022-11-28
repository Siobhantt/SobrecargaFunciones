package sobrecargafunciones;

import java.util.Scanner;

public class Ej3 {
/*Diseña dos funciones de nombre sumaEnteros que hagan lo siguiente:
La primera de las funciones recibirá un argumento (numero) de tipo entero 
y devolverá la suma de todos los números desde 1 hasta numero. El valor a devolver debe ser entero.*/

	static int sumaEnteros (int num) {
		int suma=0;
		for (int i = 1; i <= num; i++) {
			suma+=i;
		}
	
		return suma;
	}
/*
La segunda de las funciones recibirá dos argumentos (num1 y num2) de tipo entero 
y devolverá la suma de todos los números comprendidos entre los dos números (num1 y num2). El tipo a devolver debe ser entero.
*/
static int sumaEnteros (int n1, int n2) {
	int suma=0;
	
	if (n1 < n2) {
		
		for(int i=n1; i<= n2; i++) {
			suma+= i;
		}
			
		}
	else {
		for(int i=n2; i<= n1; i++) {
			
			suma+= i;
	}
		
	}
	
	return suma;
}
	public static void main(String[] args) {
		
		int n1, n2;
		
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Introduce numeros: ");
		n1 = lee.nextInt();
		
		n2 = lee.nextInt();
		
		System.out.println("La suma de todos los numeros desde el 1 hasta " + n1 + " es " + sumaEnteros(n1));
		
		System.out.println("La suma de todos los numeros desde el numero mas bajo al mas alto es " + sumaEnteros(n1, n2));
		
		//cerramos Scanner
		lee.close();

	}

}
