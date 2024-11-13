package modulo_5_array2;


public class M5_Ejercicio_1 {

	public static void main(String[] args) {
		
   /*  Invertir los Elementos de un Array
       Objetivo: Crear un array de números enteros con 5 elementos.
       Luego, usar un bucle para invertir el orden de los elementos 
       y mostrar el array invertido.
       Ejemplo:
       Array original: 1, 2, 3, 4, 5
       Array invertido: 5, 4, 3, 2, 1 */
		
		System.out.println("===> ARRAY INVERTIDOS <===");
		
		int[] numeros = {1,2,3,4,5};
		
		for (int num : numeros) {
			System.out.print( num + " " );
		}
		
		int[] invertido = new int [numeros.length];

		for (int i = 0; i < invertido.length; i++) {
			 invertido[i] = numeros[numeros.length - 1 - i];
		}
		System.out.println();
		 //imprimir array invertido
		for (int num : invertido) {
			System.out.print( num + " ");
		}
	}

}
