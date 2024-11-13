package modulo_3;

import java.util.Scanner;

public class M3_Ejercicio_3 {

	public static void main(String[] args) {
	
/* Descripción: Programa en Java que pide al usuario una letra de calificación 
 *      (A, B, C, D, F)
   y usando switch muestra el significado de la calificación.
   Si la letra no es válida, muestra un mensaje de error.
*/

     // Mensaje introductorio
     System.out.println("===> Conversor de Calificaciones <===");

     // Crear objeto Scanner para capturar la entrada del usuario
     Scanner teclado = new Scanner(System.in);

     // Pedir al usuario que ingrese una letra de calificación
     System.out.println("Ingrese una calificación (A, B, C, D, F):");
     char calificacion = teclado.next().toUpperCase().charAt(0);  // Convertimos la letra a mayúscula para simplificar el switch

     // Usar switch para determinar el significado de la calificación
     switch (calificacion) {
         case 'A':
             System.out.println("Excelente");
             break;
         case 'B':
             System.out.println("Bueno");
             break;
         case 'C':
             System.out.println("Aceptable");
             break;
         case 'D':
             System.out.println("Deficiente");
             break;
         case 'F':
             System.out.println("Reprobado");
             break;
         default:
             // Si la letra ingresada no es A, B, C, D o F, mostramos un mensaje de error
             System.out.println("Error: Calificación ingresada no válida. Use A, B, C, D, o F.");
             break;
     }

     // Cerrar el objeto Scanner
     teclado.close();

	}

}
