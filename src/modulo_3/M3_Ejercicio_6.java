package modulo_3;

import java.util.Scanner;

public class M3_Ejercicio_6 {

	public static void main(String[] args) {
	/*
	 * Tarifas de Suscripción de Gimnasio
     * Descripción: Crea un programa en Java que calcule el costo de una suscripción 
     * de gimnasio en función del tipo de acceso y la duración seleccionada.
     * El usuario debe ingresar la duración de la suscripción en meses (1, 3, 6 o 12) 
     * y seleccionar una de las tres opciones de acceso: Básico, Premium o VIP.
     *
     * Las tarifas para cada tipo de acceso según duración:
     * Acceso Básico:    Acceso Premium:   Acceso VIP: 
     * 1 mes: $20        1 mes: $30        1 mes: $50
     * 3 meses: $50      3 meses: $80      3 meses: $130
     * 6 meses: $90      6 meses: $150     6 meses: $240
     * 12 meses: $160    12 meses: $280    12 meses: $450
     *
     * Si el usuario selecciona una duración o tipo de acceso no válido, 
     * el programa debe mostrar un mensaje de error.
	 */
		System.out.println("===> Bienvenido a la suscripción del gym 🏋️‍♀️ <===");
		
		// Crear un objeto Scanner para capturar la entrada del usuario
		Scanner teclado = new Scanner(System.in);
	
		// Solicitar la duración de la suscripción al usuario
		System.out.println("Ingrese la duración en meses (1 - 3 - 6 - 12):");
		int duracion = teclado.nextInt();
		
		// Solicitar el tipo de suscripción al usuario
		System.out.println("Seleccione el tipo de acceso:");
		System.out.println("1 - Básico");
		System.out.println("2 - Premium");
		System.out.println("3 - VIP");
		int suscripcion = teclado.nextInt();

		// Variable para almacenar la tarifa calculada
		double tarifa = 0;
		
		// Switch para determinar el costo según el tipo de acceso seleccionado
		switch(suscripcion) {
		case 1: // Caso para acceso Básico
			if(duracion == 1) {
				tarifa = 20;
			} else if(duracion == 3) {
				tarifa = 50;
			} else if(duracion == 6) {
				tarifa = 90;
			} else if(duracion == 12) {
				tarifa = 160;  
			} else {
				System.out.println("Error: Duración no válida para acceso Básico.");
			}
			System.out.println("Tarifa para acceso Básico: $" + tarifa);
			break;
			
		case 2: // Caso para acceso Premium
			if(duracion == 1) {
				tarifa = 30;
			} else if(duracion == 3) {
				tarifa = 80;
			} else if(duracion == 6) {
				tarifa = 150;
			} else if(duracion == 12) {
				tarifa = 280;
			} else {
				System.out.println("Error: Duración no válida para acceso Premium.");
			}
			System.out.println("Tarifa para acceso Premium: $" + tarifa);
			break;
			
		case 3:  // Caso para acceso VIP
			if(duracion == 1) {
				tarifa = 50;
			} else if(duracion == 3) {
				tarifa = 130;
			} else if(duracion == 6) {
				tarifa = 240;
			} else if(duracion == 12) {
				tarifa = 450;
			} else {
				System.out.println("Error: Duración no válida para acceso VIP.");
			}
			System.out.println("Tarifa para acceso VIP: $" + tarifa);
			break;
			
			default:
				// Si el tipo de acceso no coincide con 1, 2 o 3, se muestra un mensaje de error.
				System.out.println("Error: Tipo de acceso no válido. Intente de nuevo.");
		   break;
		}
		
		// Cerrar el objeto Scanner para liberar recursos
		teclado.close();
	}

}
