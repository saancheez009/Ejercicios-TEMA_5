package ejercicios;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		
		int numeros[]= new int [100];
		
		int numero;
		int posicion=-1;
		
		for(int i=0; i<numeros.length; i++) {
			numeros[i]=(int) (1+Math.random ()*10);
			System.out.println(numeros[i]);
			
		}


		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor introduzca un número del 1 al 10");
		numero = sc.nextInt();
		
		
		for (int i=0; i<numeros.length;i++) {
			if(numero==numeros[i]) {
				System.out.println(i);
			}
		}
	}

}
