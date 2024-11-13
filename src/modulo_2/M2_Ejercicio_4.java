package modulo_2;

import java.util.Scanner;

public class M2_Ejercicio_4 {

	public static void main(String[] args) {
/*  Descripción: Escribe un programa que calcule la calificación final de un estudiante 
 *  en función de sus calificaciones parciales y determine la clasificación
 *  de su rendimiento académico según el siguiente criterio:

Si la calificación final es mayor o igual a 90: "Sobresaliente"
Si la calificación final es mayor o igual a 75 y menor a 90: "Notable"
Si la calificación final es mayor o igual a 60 y menor a 75: "Aprobado"
Si la calificación final es menor a 60: "Reprobado"
	*/

		
		System.out.println("===> calificación <===");
		
		Scanner ingreseCalificacion = new Scanner(System.in);
		
		System.out.println("Ingresa la nota:");
		int nota = ingreseCalificacion.nextInt();
		
		if(nota < 60) {
			System.out.println("REPROBADO");
		}else if(nota >= 60 && nota < 75) {
			System.out.println("APROBADO");
		}else if(nota >= 75 && nota < 90 ) {
			System.out.println("NOTABLE");
		}else if(nota >= 90) {
			System.out.println("SOBRESALIENTE");
		}else {
			System.out.println("Erros: Ingrese una nota válida");
		}
		ingreseCalificacion.close();
	}

}
