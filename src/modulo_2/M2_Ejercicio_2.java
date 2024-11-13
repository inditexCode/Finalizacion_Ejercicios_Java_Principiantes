package modulo_2;

import java.util.Scanner;

public class M2_Ejercicio_2 {

	public static void main(String[] args) {

/*  Descripción: Escribe un programa en Java que solicite al usuario
 *  una calificación numérica (entre 0 y 100) y determine la clasificación de la nota 
 *  según el siguiente criterio:


    90 - 100: Excelente
    80 - 89: Muy Bueno
    70 - 79: Bueno
    60 - 69: Suficiente
    Menos de 60: Insuficiente
 */
		
		System.out.println("===> Programa calificación numérica <===");
		
		Scanner ingreseNota = new Scanner(System.in);
		
		int nota = ingreseNota.nextInt();
		if(nota < 0 || nota > 100) {
			System.out.println("Error: La nota debe ser de 0 a 100");
		}else if(nota < 60 ) {
			System.out.println("Su nota es: INSUFICIENTE ⛔");
		}else if(nota >= 60 && nota < 70) {
			System.out.println("Su nota es: SUFICIENTE ✅");
		}else if( nota >= 70 && nota < 80) {
			System.out.println("Su nota es: BUENO ✅");
		}else if(nota >= 80 && nota < 90) {
			System.out.println("Su nota es: MUY BUENO ✅");
		}else if(nota >= 90 && nota <=100) {
			System.out.println("Su nota es: EXCELENTE ✅");
		}else {
			System.out.println("Ingrese una nota Válida ⛔");
		}
		ingreseNota.close();
		
		
		
	}

}
