package modulo_5_array2;

import java.util.Random;
import java.util.Scanner;

public class M5_Ejercicio_9 {
    /*
    El Juego de la Memoria
    Instrucciones: El juego muestra 5 cartas, cada una con un número aleatorio 
    entre 1 y 10. El jugador debe intentar recordar la posición de las cartas y adivinar 
    cuál carta tiene el número que se le pide. Si lo adivina, gana. Si no, pierde.
    */

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        // Crear un array de 5 cartas con números aleatorios entre 1 y 10
        int[] cartas = new int[5]; // Array de enteros de tamaño 5
        Random aleatorio = new Random(); // Objeto Random para generar números aleatorios
        
        // Llenamos el array 'cartas' con números aleatorios entre 1 y 10
        for (int i = 0; i < cartas.length; i++) {
            cartas[i] = aleatorio.nextInt(10) + 1; // Asignar un número aleatorio entre 1 y 10
        }

        // Mostrar el mensaje de bienvenida y las cartas ocultas (simuladas con "X")
        System.out.println("¡Bienvenido al Juego de la Memoria!");
        System.out.println("Aquí están tus cartas (los números están ocultos):");
        
        // Mostrar las cartas como "X" para que el jugador no vea los números
        for (int i = 0; i < cartas.length; i++) {
            System.out.print(" X "); // Mostramos "X" para ocultar las cartas
        }
        System.out.println(); // Salto de línea

        // Pedir al jugador que ingrese el número que busca entre 1 y 10
        System.out.print("¿Cuál es el número que buscas en las cartas? del 1 - 10: ");
        int numeroBuscado = teclado.nextInt(); // Leer el número que el jugador busca
        
        // Pedir al jugador que adivine en qué posición (del 1 al 5) se encuentra el número
        System.out.print("¿En qué posición (1-5) crees que está el número? ");
        int adivinarPosicion = teclado.nextInt(); // Leer la posición en la que el jugador cree que está el número

        // Verificar si la respuesta es correcta comparando el número ingresado con el número en la posición indicada
        if (cartas[adivinarPosicion - 1] == numeroBuscado) {
            // Si el número en la posición es el mismo que el que el jugador busca
            System.out.println("¡Correcto! Has adivinado el número en la posición " + adivinarPosicion + ". 🥳🥳🥳");
        } else {
            // Si el número en la posición no es el correcto
            System.out.println("Lo siento, el número en la posición " + adivinarPosicion + " es " + cartas[adivinarPosicion - 1] + ". 😫😫😫");
        }
        
        // Mostrar todas las cartas al final del juego
        System.out.println("Las cartas eran:");
        for (int i = 0; i < cartas.length; i++) {
            System.out.print("[ " + cartas[i] + " ] "); // Mostrar el contenido de cada carta en el array
        }
        System.out.println(); // Salto de línea
        
        teclado.close();// Cerrar el scanner para liberar recursos
    }
}
