package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int[] temperatura= new int [12];
		
		Scanner sc = new Scanner(System.in);

            for(int i=0;i<temperatura.length;i++) {
			
			System.out.println("Por favor introduzca la temperatura media de los 12 meses de este año ");
			temperatura[i]=sc.nextInt();
		
		}
            for (int i=0 ;i<temperatura.length;i++) {
            	System.out.println("*");
            }
		 
	}

}
