package ejercicios;

public class ejercicio2 {

	public static void main(String[] args) {
		
		int sumaTotal=0;
        int numAleatorios[]=new int [10];
		
		for(int i=0; i<numAleatorios.length; i++) {
			numAleatorios[i]=(int) (Math.random ()*100+1);
			System.out.println(numAleatorios[i]);
		
	}
		
		for(int valor: numAleatorios) {
			sumaTotal+=valor;
		}
		System.out.println("Suma total: "+sumaTotal);
	}
}
