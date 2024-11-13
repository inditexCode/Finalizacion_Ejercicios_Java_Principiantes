package modulo_5_array2;

import java.util.Scanner;

public class M5_Ejercicio_2 {

	public static void main(String[] args) {
		
/* Contar Ocurrencias de un Número en un Array
   Objetivo: Crear un array de números enteros con 10 elementos.
    Luego, pedir al usuario que ingrese un número y contar cuántas veces aparece 
    ese número en el array.
   Ejemplo:
   Array: 1, 3, 7, 8, 3, 9, 2, 3, 4, 5
   Si el usuario ingresa 3, la salida debe ser: El número 3 aparece 3 veces en el array.*/

		System.out.println("===> Contar ocurrencias <===");
		
		
		int[]numeros = {1,4,6,8,4,8,9,2,3,10,7,7,10,8,2,4,9,6,6,1,1};
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese un número  y contamos cuantas veces esta");
		int ingreso = teclado.nextInt();
		
		int contador=0;
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] == ingreso) {
				 contador++;
			 }	
		}
		System.out.println("El número -> " + ingreso + " <- aparece " + contador +" veces");
		teclado.close();
	}

}
