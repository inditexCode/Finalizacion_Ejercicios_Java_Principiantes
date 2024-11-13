package modulo_1;

// Importamos la clase Scanner para poder leer la entrada del usuario desde el teclado
import java.util.Scanner;

public class M1_Ejercicio_6 {

    public static void main(String[] args) {
        
        /* Descripción: Este programa en Java pide al usuario tres calificaciones
         * de tipo decimal (por ejemplo, entre 0 y 10) y calcula el promedio.
         */
        
        System.out.println("===> Programa para calcular promedios con números decimales <===");
        
// Creamos un objeto Scanner llamado "teclado" que usaremos para leer la entrada del usuario
        Scanner teclado = new Scanner(System.in);
        
// Solicitamos al usuario que ingrese el primer número
        System.out.println("Ingrese el primer número...");
// Declaramos una variable de tipo double llamada "num1" para almacenar la primera calificación
        double num1 = teclado.nextDouble();
         // Solicitamos al usuario que ingrese el segundo número
        System.out.println("Ingrese el segundo número..."); // Declaramos una variable de tipo double llamada "num2" para almacenar la segunda calificación
        double num2 = teclado.nextDouble();
        
// Solicitamos al usuario que ingrese el tercer número
        System.out.println("Ingrese el tercer número...");
// Declaramos una variable de tipo double llamada "num3" para almacenar la tercera calificación
        double num3 = teclado.nextDouble();
        
// CALCULAMOS EL PROMEDIO -------------------
// Declaramos una variable de tipo double llamada "promedio" y calculamos el promedio
// Usamos el operador de suma (+) para sumar las tres calificaciones y luego dividimos el total por 3
        double promedio = (num1 + num2 + num3) / 3;
        
        // Mostramos el resultado en la consola
        System.out.println("El promedio de las calificaciones es -> " + promedio);
        
        // Cerramos el objeto Scanner para liberar el recurso
        teclado.close();
    }
}
