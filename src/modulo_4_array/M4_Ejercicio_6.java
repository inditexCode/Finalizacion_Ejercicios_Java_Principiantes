package modulo_4_array;

import java.util.Scanner;

public class M4_Ejercicio_6 {

	public static void main(String[] args) {
		
   /* Objetivo: Pedir al usuario que ingrese 5 números enteros.
      Guardar cada número en un array.
      Calcular el promedio de todos los números ingresados.
      Imprimir cada número y la suma de los mismos, y  al final, el promedio.*/
		
		System.out.println("===> Sistema de promedios con array <===");
		
		double[]numeros = new double[5];

		Scanner teclado = new Scanner(System.in);
		
		double suma= 0;
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese número -> " +  (i + 1) + ":");
			numeros[i] = teclado.nextDouble();
			suma += numeros[i];
		}
		
		System.out.println("Números ingresados:");
		for (double numero : numeros) {
			System.out.println("-> " + numero);
		}
		System.out.println("Total de la suma: " + suma);
		
		// Calcular el promedio
        double promedio = (double) suma / numeros.length;
		System.out.println("Promedio: " + promedio);
		
		teclado.close();
	}

}
