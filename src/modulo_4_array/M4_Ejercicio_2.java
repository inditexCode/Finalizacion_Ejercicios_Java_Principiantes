package modulo_4_array;

import java.util.Scanner;

public class M4_Ejercicio_2 {

	public static void main(String[] args) {

/* Almacenar y Mostrar Colores Favoritos
Descripción: Crea un programa en Java que permita al usuario 
ingresar sus tres colores favoritos y luego los muestre en pantalla.

Instrucciones:

Declara un array de tipo String con tamaño 3 para almacenar los colores favoritos.
Usa un ciclo for para llenar el array con los colores ingresados por el usuario.
Muestra cada color almacenado en el array.*/

		
		String[] colores = new String[3];
		
		System.out.println("Ingrese 3 colores favoritos");
		
		Scanner teclado = new Scanner(System.in);
		
		for (int i = 0; i < colores.length; i++) {
			System.out.println("Color -> " + (i + 1) + ":");
			 colores[i] = teclado.nextLine(); 	
		}
		System.out.println("Colores favoritos: ");
		for (int i = 0; i < colores.length; i++) {
			System.out.println(" - " + colores[i]);			
		}
		teclado.close();
	}

}
