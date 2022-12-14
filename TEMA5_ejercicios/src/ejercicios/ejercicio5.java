package ejercicios;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		
		int numeros[]= new int [10];
		
		int numero;
		
		int maximo = numeros[0];
		int minimo = numeros[0];
		 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor introduzca 10 números reales");
		
		for(int i=0;i<numeros.length;i++) {
			numero = sc.nextInt();
		
		}
		for(int valor : numeros) {
			if (valor>maximo) {
				maximo=valor;
			} 
			if (valor<minimo) {
				minimo=valor;
			}
		}
		System.out.println(minimo);
		System.out.println(maximo);
		
		sc.close();
	}

}
