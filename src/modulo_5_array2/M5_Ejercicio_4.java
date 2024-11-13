package modulo_5_array2;

import java.util.Scanner;

public class M5_Ejercicio_4 {

	public static void main(String[] args) {
		
/* Objetivo: Crear un programa que muestre un menú con tres opciones:
       1) Verduras, 2) Frutas, 3) Salir. Dependiendo de la opción seleccionada,
      el programa debe mostrar una lista de frutas o verduras que se almacenan en un array de String.
   Funcionalidad:
   Opción 1: Muestra todas las verduras.
   Opción 2: Muestra todas las frutas.
   Opción 3: Salir del programa.*/
		
		System.out.println("===> Programa para una verduleria <===");
		
		 String[] productos = {"Papas", "Cebollas", "Zanahorias", "Calabaza", "Tomates", "Lechuga",
                 "Manzanas", "Bananas", "Peras", "Frutillas", "Sandía", "Ciruela"};

		 int indice = 6;
		 
		 Scanner teclado = new Scanner(System.in);
		 int opcion;
		 
		 do {
		     // Mostrar menú de opciones
	            System.out.println("\n===> Verdulería 🍎🫛 <===");
	            System.out.println("1 - Ver Verduras");
	            System.out.println("2 - Ver Frutas");
	            System.out.println("3 - Salir");
	            System.out.print("Seleccione una opción: ");
	            opcion = teclado.nextInt();
	            
	            switch(opcion) {
	            case 1:
	            	System.out.println("Verduras disponibles:");
	            	for (int i = 0; i < indice; i++) {
                         System.out.println("- " + productos[i]);
					}
	            	break;
	            case 2:
	            	System.out.println("Frutas disponibles:");
                    for (int i = indice; i < productos.length; i++) {
                        System.out.println("- " + productos[i]);						
					}
                    break;
	            case 3:
	            	System.out.println("Saliendo del programa...");
	            	break;
	            	default:
	            		System.out.println("Opción no válida intente nuevamente");
	            }
			 
		 }while(opcion !=3);
		 teclado.close();
		 

	}

}
