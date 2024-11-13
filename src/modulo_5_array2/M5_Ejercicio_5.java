package modulo_5_array2;

import java.util.Scanner;

public class M5_Ejercicio_5 {

	public static void main(String[] args) {

 /*   Objetivo: Crear un programa que simule una tienda de tecnología con tres categorías
  *   de productos: Laptops, Teléfonos, y Tablets. El usuario puede elegir una categoría
  *   para ver los productos disponibles o salir del programa.
Funcionalidad:
Opción 1: Muestra todas las laptops disponibles.
Opción 2: Muestra todos los teléfonos disponibles.
Opción 3: Muestra todas las tablets disponibles.
Opción 4: Sale del programa.*/

		
		 // Array con todos los productos (Laptops, Teléfonos y Tablets)
        String[] productos = {"Dell XPS", "MacBook Pro", "HP Spectre", 
                              "iPhone 14", "Samsung Galaxy S22", "Google Pixel 6", 
                              "iPad Pro", "Samsung Galaxy Tab", "Microsoft Surface"};
        int indiceLaptos = 3;
        int indiceTelefonos = 6;
		
        Scanner teclado = new Scanner(System.in);
        
        int opcion;
        
        do {
        	  // Mostrar menú de opciones
            System.out.println("\n===> Tienda de Tecnología 🖥️📱 <===");
            System.out.println("1 - Ver Laptops");
            System.out.println("2 - Ver Teléfonos");
            System.out.println("3 - Ver Tablets");
            System.out.println("4 - Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion=teclado.nextInt();
            
            switch(opcion) {
            case 1:
				System.out.println("Laptos disponibles:");
            	for (int i = 0; i < indiceLaptos; i++) {
				System.out.println("- " + productos[i]);
            	}
            	break;
            case 2:
            	System.out.println("Teléfonos disponibles:");
            	for (int i = 0; i < indiceTelefonos; i++) {
    				System.out.println("- " + productos[i]);
				}
				break;
            case 3:
            	System.out.println("Tablets disponibles:");
            	for (int i = indiceTelefonos; i  < productos.length; i++) {
    				System.out.println("- " + productos[i]);
				}
				break;
            case 4:
            	System.out.println("Saliendo del programa...");
                break;
                default:
                	System.out.println("Error, datos incorrectos vuelva a elegir");
                	break;
            }
            
        	
        }while(opcion !=4);
		
		
		teclado.close();
	}

}
