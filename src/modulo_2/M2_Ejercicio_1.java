package modulo_2;

import java.util.Scanner; // Importamos la clase Scanner para leer la entrada del usuario

public class M2_Ejercicio_1 {

    public static void main(String[] args) {
        
        /* Descripción: Este programa en Java solicita al usuario su edad y 
         * determina en qué categoría de edad se encuentra.
         * Las categorías son:
         * - Menor de edad (0 - 17 años)
         * - Adulto joven (18 - 35 años)
         * - Adulto (36 - 55 años)
         * - Persona mayor (56 años en adelante)
         */
        
        System.out.println("===> Programa para ingresar la edad <===");

        // Creamos un objeto Scanner llamado "teclado" para leer la entrada del usuario desde el teclado
        Scanner teclado = new Scanner(System.in);

        // Solicitamos al usuario que ingrese su edad
        System.out.println("Ingrese la edad:");
        
        // Declaramos una variable de tipo int llamada "edad" para almacenar la edad ingresada
        int edad = teclado.nextInt();

        // Estructura condicional para verificar y clasificar la edad
        if (edad < 0) { 
            // Primer condicional: verifica si la edad es menor que 0, lo cual es un valor inválido
            System.out.println("Error: tu edad no puede ser menor a 0");
        } else if (edad > 0 && edad <= 17) { 
            // Segundo condicional: verifica si la edad está entre 0 y 17, lo que corresponde a "Menor de edad"
            System.out.println("Menor de edad");
        } else if (edad > 17 && edad <= 35) { 
            // Tercer condicional: verifica si la edad está entre 18 y 35, lo que corresponde a "Adulto Joven"
            System.out.println("Adulto Joven");
        } else if (edad > 35 && edad <= 55) { 
            // Cuarto condicional: verifica si la edad está entre 36 y 55, lo que corresponde a "Adulto"
            System.out.println("Adulto");
        } else if (edad > 55) { 
            // Quinto condicional: verifica si la edad es mayor a 55, lo que corresponde a "Persona Mayor"
            System.out.println("Persona Mayor");
        } else { 
            // muestra un mensaje indicando que la entrada no es válida
            System.out.println("Ingrese una edad válida...");
        }
        
        teclado.close();// Cerramos el objeto Scanner para liberar el recurso
    }
}
