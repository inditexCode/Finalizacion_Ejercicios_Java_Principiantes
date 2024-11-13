package modulo_3;

import java.util.Scanner;

public class M3_Ejercicio_2 {

	public static void main(String[] args) {
		
		/* Descripción: Programa en Java que pide al usuario un número del 1 al 12,
        y usando switch muestra el nombre del mes correspondiente.
        Si el número no está entre 1 y 12, se muestra un mensaje de error.
     */

     // Mensaje introductorio
     System.out.println("===> Programa para mostrar el mes del año <===");

     // Crear objeto Scanner para capturar la entrada del usuario
     Scanner teclado = new Scanner(System.in);

     // Pedir al usuario que ingrese un número del 1 al 12
     System.out.println("Ingrese un número del 1 al 12 para ver el mes correspondiente:");
     int mes = teclado.nextInt();

     // Usar switch para determinar el mes correspondiente
     switch (mes) {
         case 1:
             System.out.println("Enero");
             break;
         case 2:
             System.out.println("Febrero");
             break;
         case 3:
             System.out.println("Marzo");
             break;
         case 4:
             System.out.println("Abril");
             break;
         case 5:
             System.out.println("Mayo");
             break;
         case 6:
             System.out.println("Junio");
             break;
         case 7:
             System.out.println("Julio");
             break;
         case 8:
             System.out.println("Agosto");
             break;
         case 9:
             System.out.println("Septiembre");
             break;
         case 10:
             System.out.println("Octubre");
             break;
         case 11:
             System.out.println("Noviembre");
             break;
         case 12:
             System.out.println("Diciembre");
             break;
         default:
             // Si el número no está entre 1 y 12, mostramos un mensaje de error
             System.out.println("Error: Número inválido. Por favor ingrese un número entre 1 y 12.");
             break;
     }
     teclado.close(); // Cerrar el objeto Scanner

	}

}
