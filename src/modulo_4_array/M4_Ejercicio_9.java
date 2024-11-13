package modulo_4_array;

import java.util.Scanner;

public class M4_Ejercicio_9 {

	public static void main(String[] args) {
		
/*  Objetivo: Crear un array de números enteros con 5 elementos. 
 * Luego, usar un bucle para imprimir cada número en una nueva línea.
 */
		
		System.out.println("===> Imprimir números de un array <===");
		
		int[] numeros = new int[6];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese el número: " + (i + 1) + ":");
			 numeros[i] = teclado.nextInt();
		}
	     
		// imprimimos 
		for (int num : numeros) {
			System.out.println("-> " + num);
		}
       teclado.close();
	}

}
