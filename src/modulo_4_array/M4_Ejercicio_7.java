package modulo_4_array;

import java.util.Scanner;

public class M4_Ejercicio_7 {

	public static void main(String[] args) {
 
	/* Encontrar el Número Mayor y el Menor
       Objetivo: Solicitar al usuario que ingrese 5 números enteros.
       Guardar cada número en un array.
       Determinar cuál es el número mayor y cuál es el número menor.
       Imprimir cada número ingresado, el mayor y el menor.*/

		
		System.out.println("===> Encontremos el nùmero mayor y menor de los ingresados <===");
		
		int[] numeros = new int[10];
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Ingrese Nùmero -> " +  (i + 1) + ":");
			numeros[i] = teclado.nextInt();
		}
		
		// inicializamos el mayor y menor
		int mayor = numeros[0];
		int menor = numeros[0];
		
        // Bucle para encontrar el número mayor y el número menor

		 for (int num : numeros) {
			if(num > mayor) {
				mayor = num;
			}if(num < menor) {
				menor = num;
			}
		}
		 // Imprimir los números ingresados
	        System.out.println("Números ingresados:");
		 for (int num : numeros) {
			System.out.println("-> " + num);
		}
		 System.out.println("El nùmero mayor es: " + mayor);
		 System.out.println("El nùmero mayor es: " + menor);

         teclado.close();
		
	}

}
