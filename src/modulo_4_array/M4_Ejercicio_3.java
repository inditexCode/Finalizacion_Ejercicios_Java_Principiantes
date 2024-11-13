package modulo_4_array;

import java.util.Scanner;

public class M4_Ejercicio_3 {

    public static void main(String[] args) {

        /* Almacenar y Mostrar Números Multiplicados por 2
          Descripción: Crea un programa en Java que permita al usuario ingresar 5 números enteros.
          Luego, el programa debe multiplicar cada número por 2 y mostrar el resultado.
        
          Instrucciones:
          - Declara un array de tamaño 5 para almacenar los números.
        */

        System.out.println("===> Ingrese 5 números enteros <===");

        // Declaración del array 'numero' con espacio para almacenar 5 enteros
        int[] numero = new int[5];

        // Creación de un objeto Scanner para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Bucle for para llenar el array con los números ingresados por el usuario y mostrar los resultados
        for (int i = 0; i < numero.length; i++) {

            // Solicita al usuario ingresar el número correspondiente y lo almacena en la posición 'i' del array
            System.out.println("Número " + (i + 1) + ":");
            numero[i] = teclado.nextInt();

            // Multiplica el número ingresado por 2 y almacena el resultado en 'resultado'
            int resultado = numero[i] * 2;

            // Muestra el resultado en pantalla
            System.out.println("El doble de " + numero[i] + " es: " + resultado);
        }

        // Cierra el objeto Scanner para liberar recursos
        teclado.close();
    }
}
