package modulo_5_array2;

public class M5_Ejercicio_3 {

	public static void main(String[] args) {
		
/*  Clasificar Números en Pares e Impares
	Objetivo: Crear un array de números enteros con 8 elementos. 
	Recorrer el array y, usando condicionales, clasificar cada número en pares e impares.
	Guardar los números pares en un array y los impares en otro array, 
	y luego imprimir cada array por separado.*/
		
		System.out.println("===> Clasificar números pares e impares <===");

		int[]numeros = {24,4,8,6,1,3,9,10};
		
		int[]pares = new int[numeros.length];
		int[]impares = new int[numeros.length];

		int contadoPares=0;
		int contadorImpares=0;
		
		for (int i = 0; i < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				pares[contadoPares] = numeros[i];
				contadoPares++;
			}else {
				impares[contadorImpares] = numeros[i];
				contadorImpares++;
			}
			
		}
		System.out.println("Imprimir pares");
		for (int i = 0; i < contadoPares; i++) {
			System.out.println("Cant: Pares -> " + pares[i]);
		}
		System.out.println("Imprimir impares");
		for (int i = 0; i < contadorImpares; i++) {
			System.out.println("Cant: Impares -> " + impares[i]);
			
		}
		
	}

}
