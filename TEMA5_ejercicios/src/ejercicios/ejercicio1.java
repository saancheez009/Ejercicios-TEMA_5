package ejercicios;

public class ejercicio1 {

	public static void main(String[] args) {
		
		int numAleatorios[]=new int [10];
		
		for(int i=0; i<numAleatorios.length; i++) {
			numAleatorios[i]=(int) (Math.random ()*100+1);
			System.out.println(numAleatorios[i]);
		}

	}

}
