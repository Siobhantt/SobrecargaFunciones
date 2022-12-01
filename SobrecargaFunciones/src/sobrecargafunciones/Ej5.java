package sobrecargafunciones;

import java.util.Scanner;

public class Ej5 {
	
	public static void numerosAleatorios(int n) {
		
		int numeroX=0;
		
		for (int i = 1; i<=n; i++) {
			
			numeroX =(int) (Math.random()*(100-1)+1);
			System.out.println(numeroX); 
		}
	
	}
	
	public static void numerosAleatorios(int n1, int n2) {
		
		int numeroX =0;
		for(int i = 1; i <= n1; i++ ) {
			
			numeroX = (int)( Math.random()*(n2-1)+1);
			
			System.out.println(numeroX);
		}
		
	}
	
	public static void numerosAleatorios(int n1, int n2, int n3) {
		
		int numeroX=0;
		
		for(int i=1; i<=n1; i++) {
			
			numeroX = (int)(Math.random()*(n3-n2)+n2);
			
			System.out.println(numeroX);
		}
		
	}
	
	public static void main(String[] args) {
		
		
		int cantidad;
		int valorMax;
		int valorMinimo;
		
		//Iniciamos el Scanner
		Scanner lee = new Scanner(System.in);
	
		//Primero leemos un parametro para evaluar la primera funcion
		System.out.println("Introduzca la cantidad de numeros aleatorios que necesita: ");
		cantidad = lee.nextInt();
		
		numerosAleatorios(cantidad);
		
		//Segundo leemos la cantidad de numeros aleatorios y el valor mximo para probar la segunda funcion
		System.out.println("Por favor introduzca la cantidad de numero aleatorios a crear: ");
		
		cantidad = lee.nextInt();
		
		System.out.println("Introduzca el valor maximo del numero random: ");
		
		valorMax = lee.nextInt();
		
		numerosAleatorios(cantidad, valorMax);
		
		//Tercero leemos la cantidad el valor minimo y el valor maximo para probar la tercera funcion
		
		System.out.println("Introduzca la cantidad de numeros aleatorios que necesita: ");
		
		cantidad = lee.nextInt();
		
		System.out.println("Introduzca el valor minimo del numero random: ");
		
		valorMinimo = lee.nextInt();
		
		System.out.println("Introduzca el valor maximo del numero random: ");
		
		valorMax = lee.nextInt();
		
		numerosAleatorios(cantidad, valorMinimo, valorMax);
		
		//cerramos Scanner
		lee.close();
		
	}

}
