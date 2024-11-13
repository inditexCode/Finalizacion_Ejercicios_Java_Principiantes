package modulo_4_array;

import java.util.Scanner;

public class M4_Ejercicio_4 {

    public static void main(String[] args) {
    	
    	/* creamos un programa donde el usuario deba ingresar 5 palabras y se guarden en 
    	 * un array, luego creamos un buble for para recorrerlo, y que se vayan ingresando
    	 * las palabras y por ultimo creamos un bucle for each para imprimir todas
    	 * las palabras ingresadas
    	 * */
        // Crear un array de String con espacio para 5 palabras
        String[] palabras = new String[5];
        
        // Crear un objeto Scanner para leer la entrada del usuario desde la consola
        Scanner teclado = new Scanner(System.in);
        
        // Bucle para solicitar al usuario que ingrese 5 palabras
        for (int i = 0; i < palabras.length; i++) {
            // Pedimos al usuario que ingrese una palabra y mostramos el número de palabra
            System.out.println("Ingrese la palabra " + (i + 1) + ":"); 
            palabras[i] = teclado.nextLine();// Guardamos la palabra ingresada por el usuario en el array
        }

        // Bucle para imprimir cada palabra ingresada por el usuario
        for (String palabra : palabras) {
            // Mostramos cada palabra en una línea con un mensaje descriptivo
            System.out.println("Palabra ingresada -> " + palabra);
        }
        teclado.close();// Cerrar el objeto Scanner para liberar recursos
    }
}
