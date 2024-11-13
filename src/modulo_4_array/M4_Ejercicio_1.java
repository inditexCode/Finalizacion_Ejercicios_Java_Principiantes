package modulo_4_array;

import java.util.Scanner;

public class M4_Ejercicio_1 {

    public static void main(String[] args) {

        /* 1 - Calcular Promedio de Notas
         
        Descripción: Crea un programa que permita al usuario ingresar 5 calificaciones 
        (números decimales) en un array, y luego calcule y muestre el promedio 
        de esas calificaciones.
        
        Instrucciones:
        
        Declara un array de tamaño 5 para almacenar las calificaciones.
        Usa un ciclo for para llenar el array con las calificaciones ingresadas por el usuario.
        Suma todas las calificaciones y calcula el promedio.
        Muestra el promedio en pantalla.*/

        // Mensaje inicial
        System.out.println("===> Arrays <===");
        
        // Declaración de un array de tipo double con tamaño 5 para almacenar las calificaciones
        double[] calificacion = new double[5];
        
        // Objeto Scanner para recibir entrada de datos del usuario
        Scanner teclado = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese 5 calificaciones
        System.out.println("Ingrese 5 calificaciones");
        
        // Ciclo para almacenar las calificaciones en el array
        for (int i = 0; i < calificacion.length; i++) {
            System.out.println("Ingrese nota " + (i + 1) + ":"); // Solicita cada calificación
            calificacion[i] = teclado.nextDouble(); // Asigna la entrada del usuario a la posición correspondiente en el array
        }
        
        // Variable para almacenar la suma de las calificaciones
        double suma = 0;
        
        // Ciclo para sumar todas las calificaciones del array
        for (int i = 0; i < calificacion.length; i++) {
            suma += calificacion[i]; // Acumula cada valor del array en la variable suma
        }
        
        // Calcular el promedio dividiendo la suma entre el número de calificaciones (tamaño del array)
        double promedio = suma / calificacion.length;
        
        // Condicional para verificar si el promedio es válido y dar un mensaje correspondiente
        if (promedio < 0 || promedio > 10) { 
            // Si el promedio es menor que 0 o mayor que 10, hay un error en los datos ingresados
            System.out.println("Error al ingresar valores incorrectos...");
        } else if (promedio < 6) { 
            // Si el promedio es menor a 6, indica un bajo desempeño
            System.out.println("El promedio de calificaciones es: " + promedio + " 😫");
        } else { 
            // Si el promedio es 6 o superior, indica un desempeño satisfactorio
            System.out.println("El promedio de calificaciones es: " + promedio + " 🥳");
        }

        // Cerrar el objeto Scanner
        teclado.close();
    }
}
