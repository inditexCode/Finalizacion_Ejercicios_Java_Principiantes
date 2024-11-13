package modulo_4_array;

import java.util.Scanner;

public class M4_Ejercicio_10 {

	public static void main(String[] args) {
		
	/* Objetivo: Crear un array de números enteros con 8 elementos.
       Luego, recorrer el array para contar cuántos de esos números 
       son pares e imprimir el resultado.*/
		
		System.out.println("===> Programa para contar números enteros <===");

		int[]numeros = new int[8];
		Scanner teclado = new Scanner(System.in);
		
		int contador=0;
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese números " + (i + 1 ) + ":");
		    numeros[i] = teclado.nextInt();
			if(numeros[i] % 2 ==0) {
				contador++;
			}
		}
		System.out.println("Cantidad números pares: " + contador);
		teclado.close();
		
	}

}
