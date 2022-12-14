package ejercicios;

import java.util.Scanner;

public class ejercicio3 {

	public static void main(String[] args) {
		
		double numeros[]=new double[5];
		double numero;
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Por favor introduzca 5 números decimales");
		for(int i=0;i<numeros.length;i++) {
			numero = sc.nextDouble();
			numeros[i]=numero;
			
		}
		for(double valor : numeros) {
			System.out.println(valor);
		}
		sc.close();
	}
}
