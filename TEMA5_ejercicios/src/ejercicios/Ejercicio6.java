package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {


		int resto;
		int numeros[] = new int[8];
		
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<numeros.length;i++) {
	System.out.println("Por favor introduzca 8 números");
	numeros[i]=sc.nextInt();
		}
		
		for (int valor: numeros){
			resto=valor%2;
			if(resto==0) {
				System.out.println("El número es par");
			} else {
				System.out.println("El número es impar");
			}
		}
	}
}

