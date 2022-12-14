package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		
		int numeros[]= new int [10];
		int numero;

		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<numeros.length;i++) {
			
			System.out.println("Por favor introduzca 10  números: ");
			numero = sc.nextInt();
		
		}

		for(int valor : numeros) {
			
			for(int i=10;i>numeros.length;i++) {
				valor=numeros[i];
			}
			System.out.println(valor);
		}
		
	}
}
