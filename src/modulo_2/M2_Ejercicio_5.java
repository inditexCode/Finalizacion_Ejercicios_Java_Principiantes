package modulo_2;

import java.util.Scanner;

public class M2_Ejercicio_5 {

    public static void main(String[] args) {

        /* 
        Clasificación del IMC (Índice de Masa Corporal)
        Descripción: Este programa calcula el Índice de Masa Corporal (IMC) de una persona
        y determina su clasificación según el valor del IMC.
        
        Fórmula del IMC:
        IMC = peso (kg) / (altura (m) * altura (m))
        
        Clasificación del IMC:
        - Bajo peso: IMC menor a 18.5
        - Normal: IMC entre 18.5 y 24.9
        - Sobrepeso: IMC entre 25 y 29.9
        - Obesidad: IMC de 30 o más
        */

        System.out.println("===> Clasificación del IMC (Índice de Masa Corporal) <===");

        // Creación de un objeto Scanner para obtener la entrada del usuario
        Scanner teclado = new Scanner(System.in);

        // Solicita al usuario su peso en kilogramos y lo almacena en una variable de tipo double
        System.out.println("Ingrese su peso:");
        double peso = teclado.nextDouble();

        // Solicita al usuario su altura en metros y lo almacena en otra variable de tipo double
        System.out.println("Ingrese su altura:");
        double altura = teclado.nextDouble();

        // Calcula el IMC usando la fórmula indicada y lo almacena en la variable 'IMC'
        double IMC = peso / (altura * altura);

        // Estructura condicional para clasificar el IMC según el valor calculado
        if (IMC < 18.5) {
            System.out.println("Tu IMC es: " + IMC + " - Clasificación: BAJO PESO");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
        	System.out.println("Tu IMC es: " + IMC + " - Clasificación: NORMAL");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Tu IMC es: " + IMC + " - Clasificación: SOBREPESO");
        } else if (IMC >= 30) {
            System.out.println("Tu IMC es: " + IMC + " - Clasificación: OBESIDAD");
        } else {
            // Si se ingresa un valor que no cumple con las condiciones esperadas, muestra un error
            System.out.println("Error - Ingrese un valor válido...");
        }

        
        teclado.close();  // Cierre del objeto Scanner
    }
}
