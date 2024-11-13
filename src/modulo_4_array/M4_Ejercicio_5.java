package modulo_4_array;

import java.util.Scanner;

public class M4_Ejercicio_5 {

    public static void main(String[] args) {
        
        /* Sumar Números Enteros
           Solicitar al usuario que ingrese 5 números enteros.
           Guardar cada número en un array.
           Calcular la suma de todos los números ingresados.
           Imprimir cada número y, al final, la suma total. */
        
        System.out.println("===> Sumar Números enteros <===");
        
        // Crear un array de enteros con espacio para 5 números
        int[] numeros = new int[5];
        
        // Crear un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner teclado = new Scanner(System.in);
        
        // Variable para almacenar la suma de los números ingresados
        int suma = 0;
        
        // Bucle para solicitar al usuario que ingrese 5 números enteros
        for (int i = 0; i < numeros.length; i++) {
            // Pedimos al usuario que ingrese un número, mostrando el número de entrada
            System.out.println("Ingrese número " + (i + 1) + ":"); 
            numeros[i] = teclado.nextInt();// Guardamos el número ingresado por el usuario en el array
            suma += numeros[i];// Sumamos el número ingresado a la variable de suma
        }
        
        // Bucle para imprimir cada número que ingresó el usuario
        for (int num : numeros) {   
            System.out.println("Número ingresado -> " + num);// Mostramos cada número con un mensaje descriptivo
        }
        
        // Imprimimos la suma total de los números ingresados
        System.out.println("Suma total de los números ingresados: " + suma);
        
        teclado.close();// Cerrar el objeto Scanner para liberar recursos
    }
}
