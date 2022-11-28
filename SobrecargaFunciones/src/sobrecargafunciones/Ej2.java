package sobrecargafunciones;

import java.util.Scanner;

public class Ej2 {
/*Diseña dos funciones de nombre media que hagan lo siguiente:
La primera de las funciones recibirá dos argumentos de tipo entero y devolverá la media de ambos. El valor a devolver debe ser double.
La segunda de las funciones recibirá tres argumentos de tipo entero y devolverá la media de los tres. El tipo a devolver debe ser double.
*/
	
	static int media (int a, int b) {
		
		int media = (a+b)/2;
		
		return media;
	}
	
	static double media (int a, int b, int c) {
		
		double media = (a+b+c)/3;
		
		return media;
	}
	public static void main(String[] args) {
		
		int num1, num2;
		double resultM, resultI;
		int n1, n2, n3;
	
		Scanner lee = new Scanner(System.in);
		
		System.out.println("Introduzca 2 numeros separados por enter: ");
		num1 = lee.nextInt();
		num2 = lee.nextInt();
		
		System.out.println("Introduzca 3 numeros separados por enter: ");
		
		n1 = lee.nextInt();
		n2 = lee.nextInt();
		n3 = lee.nextInt();
		
		resultI = media(num1, num2);
		resultM = media(n1, n2, n3);
		
		System.out.println("Media 2 numeros: ");
		
		System.out.println(resultI);
		
		
		System.out.println("Media de 3 numeros: ");
		System.out.println(resultM);
		
	//cerramos Scanneer
		lee.close();
	}

}
