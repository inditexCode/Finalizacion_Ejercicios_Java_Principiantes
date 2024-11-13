package modulo_5_array2;

import java.util.Scanner;

public class M5_Ejercicio_10 {
    /*
    Juego: Adivina el Número
    Instrucciones: El juego tiene un array con 5 números predefinidos.
    El jugador debe adivinar en qué posición del array se encuentra un número.
    El jugador tiene 3 intentos para adivinar.
    Si lo adivina, gana. Si no, pierde.
    */

    public static void main(String[] args) {
        
        // Crear un array con 5 números predeterminados
        int[] numerosSecretos = {3, 7, 1, 9, 5}; // Array con números secretos
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("¡Bienvenido al juego 'Adivina el Número'!");
        System.out.println("Tienes 3 intentos para adivinar el número secreto en la posición correcta.");
        System.out.println("El array tiene 5 posiciones. Elige un número del 1 al 5.");

        int intentos = 3; // Número de intentos que el jugador tiene

        // Bucle para que el jugador tenga 3 intentos
        for (int i = 0; i < intentos; i++) {
            // Pedir al jugador que ingrese una posición (1-5)
            System.out.print("Intento " + (i + 1) + " de " + intentos + ". ¿En qué posición (1-5) crees que está el número secreto? ");
            int posicion = teclado.nextInt(); // Leer la posición ingresada por el jugador

            // Verificar si la posición ingresada es correcta
            if (posicion >= 1 && posicion <= 5) { // Verificar que la posición sea válida (1 a 5)
                // Verificar si el número en la posición adivinada es el correcto
                if (numerosSecretos[posicion - 1] == 7) {
                    System.out.println("¡Felicidades! Has adivinado el número secreto en la posición " + posicion + " 🥳");
                    break; // Si el jugador adivina correctamente, salir del bucle
                } else {
                    System.out.println("Lo siento, el número en la posición " + posicion + " no es el correcto.");
                }
            } else {
                System.out.println("Posición inválida. Elige un número entre 1 y 5.");
            }
        }

        // Si el jugador no ha adivinado en 3 intentos, mostrar el mensaje de pérdida
        System.out.println("¡Fin del juego! El número secreto era: 7");
        
        teclado.close();
    }
}
