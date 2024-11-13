package modulo_4_array;

import java.util.Scanner;

public class M4_Ejercicio_8 {

	public static void main(String[] args) {

/*    Contar Números Pares e Impares
      Objetivo: Pedir al usuario que ingrese 8 números enteros.
      Guardar cada número en un array.
      Contar cuántos de los números ingresados son pares y cuántos son impares.
      Imprimir cada número, la cantidad de números pares y la cantidad de números impares.*/

	System.out.println("===> Números PARES e IMPARES <===");
	
	int[]numeros = new int[8];
		
	Scanner teclado = new Scanner(System.in);
		
	int numImpar = 0;
	int numPar = 0;
	
	for (int i = 0; i < numeros.length; i++) {
		System.out.println("Ingrese número " + (i + 1) + ":");
		numeros[i] = teclado.nextInt();
		 if(numeros[i] % 2 ==0) {// Verificar si el número es par o impar
	        numPar++;	   
	       }else {
	    	   numImpar++;
	       }
	}
   
	 //imprimir los numeros ingresados
    for (int num : numeros) {
		System.out.println("-> " + num);
	}
    System.out.println("Cantidad Números par: " + numPar);
    System.out.println("Cantidad Números impar: " + numImpar);
		
	
	teclado.close();
	}

}
