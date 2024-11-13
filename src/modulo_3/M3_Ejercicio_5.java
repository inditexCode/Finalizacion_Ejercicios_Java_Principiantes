package modulo_3;

import java.util.Scanner;

public class M3_Ejercicio_5 {

    public static void main(String[] args) {

        /* Descripción: Programa en Java que calcula el costo de envío de un paquete 
         * en función de su peso y el destino. El usuario selecciona uno de tres destinos:
         * (1) Nacional, (2) Internacional cercano, o (3) Internacional lejano.
         * Según el peso y destino, el programa calcula el precio del envío.
         */

        System.out.println("===> Calculadora de Tarifas de Envío 📦 <===");

        // Crear un objeto Scanner para capturar la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Solicitar al usuario el peso del paquete en kilogramos
        System.out.println("Ingrese el peso del paquete en kilogramos:");
        double kilo = teclado.nextDouble();

        // Verificar si el peso es válido (no puede ser negativo)
        if (kilo < 0) {
            System.out.println("Error: El peso no puede ser negativo.");
        } else {
            // Si el peso es válido, solicitar al usuario que seleccione el destino de envío
            System.out.println("Seleccione el destino de envío:");
            System.out.println("1. Nacional");
            System.out.println("2. Internacional cercano");
            System.out.println("3. Internacional lejano");

            int destino = teclado.nextInt(); // Captura de la opción de destino
            double precio = 0; // Variable para almacenar el precio calculado del envío

            // Uso del switch para determinar el precio según el destino seleccionado
            switch (destino) {
                case 1: // Envío Nacional
                    if (kilo <= 2) {
                        precio = 5;
                    } else if (kilo <= 5) {
                        precio = 10;
                    } else {
                        precio = 15;
                    }
                    System.out.println("Precio del envío: $" + precio);
                    break;

                case 2: // Envío Internacional cercano
                    if (kilo <= 2) {
                        precio = 15;
                    } else if (kilo <= 5) {
                        precio = 25;
                    } else {
                        precio = 40;
                    }
                    System.out.println("Precio del envío: $" + precio);
                    break;

                case 3: // Envío Internacional lejano
                    if (kilo <= 2) {
                        precio = 30;
                    } else if (kilo <= 5) {
                        precio = 50;
                    } else {
                        precio = 75;
                    }
                    System.out.println("Precio del envío: $" + precio);
                    break;

                default:
                    // Caso de error en el que el usuario selecciona un destino no válido
                    System.out.println("Error: Destino no válido. Por favor, seleccione 1, 2 o 3.");
                    break;
            }
        }

        // Cerrar el Scanner para liberar los recursos
        teclado.close();
    }
}
