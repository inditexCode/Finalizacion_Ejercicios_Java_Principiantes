package modulo_3;

import java.util.Scanner;

public class M3_Ejercicio_1 {

    public static void main(String[] args) {

        /* Días de la Semana

        Descripción: Este programa en Java pide al usuario que ingrese un número
        del 1 al 7, y usando switch, muestra el nombre del día de la semana correspondiente.
        Si el número no está en el rango del 1 al 7, el programa muestra un mensaje de error.
        */

        System.out.println("===> Día de la semana <===");

        // Creamos un objeto Scanner para capturar la entrada del usuario desde el teclado
        Scanner teclado = new Scanner(System.in);

        // Pedimos al usuario que ingrese un número del 1 al 7
        System.out.println("Ingrese un número para devolverte el día de la semana");
        int diaSemana = teclado.nextInt();  // Capturamos el número ingresado por el usuario

        // Usamos una estructura switch para determinar el día de la semana según el número
        switch (diaSemana) {
            case 1:
                // Si el número ingresado es 1, imprimimos "Lunes"
                System.out.println("Lunes");
                break;  // Usamos break para terminar el caso y salir del switch
            
            case 2:
                // Si el número ingresado es 2, imprimimos "Martes"
                System.out.println("Martes");
                break;

            case 3:
                // Si el número ingresado es 3, imprimimos "Miércoles"
                System.out.println("Miércoles");
                break;

            case 4:
                // Si el número ingresado es 4, imprimimos "Jueves"
                System.out.println("Jueves");
                break;

            case 5:
                // Si el número ingresado es 5, imprimimos "Viernes"
                System.out.println("Viernes");
                break;

            case 6:
                // Si el número ingresado es 6, imprimimos "Sábado"
                System.out.println("Sábado");
                break;

            case 7:
                // Si el número ingresado es 7, imprimimos "Domingo"
                System.out.println("Domingo");
                break;

            default:
                // Si el número no está entre 1 y 7, imprimimos un mensaje de error
                System.out.println("Número ingresado incorrecto, el número debe ser entre 1 y 7");
                break;  // Break para finalizar el bloque default
        }

        
        teclado.close();// Cerramos el objeto Scanner 
    }
}
