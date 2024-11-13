package modulo_2;

import java.util.Scanner; // Importamos la clase Scanner para recibir la entrada del usuario

public class M2_Ejercicio_3 {

    public static void main(String[] args) {
        
        /* Descripción:
         * Este programa en Java calcula el impuesto que debe pagar un usuario en función de su salario anual.
         * El porcentaje de impuesto aplicado depende de los siguientes rangos salariales:
         * 
         * - Más de 80,000: 30% de impuestos
         * - De 50,001 a 80,000: 20% de impuestos
         * - De 30,001 a 50,000: 15% de impuestos
         * - De 15,001 a 30,000: 10% de impuestos
         * - Hasta 15,000: No se aplica impuesto
         */

        System.out.println("===> Sistema para calcular el impuesto <===");

        // Creamos un objeto Scanner llamado "ingreseSalario" para capturar el salario del usuario
        Scanner ingreseSalario = new Scanner(System.in);

        // Pedimos al usuario que ingrese su salario
        System.out.println("INGRESE SU SALARIO PARA CALCULAR EL IMPUESTO A PAGAR");
        // Almacenamos el salario en una variable de tipo double para permitir decimales
        double salario = ingreseSalario.nextDouble();

        // Inicializamos la variable "impuesto" en 0 para almacenar el monto calculado de impuestos
        double impuesto = 0;

        // Condiciones para calcular el porcentaje de impuesto según el salario
        if (salario <= 15000) {
            // Si el salario es menor o igual a 15,000, no se aplica impuesto
            System.out.println("No se aplican impuestos");
        } else if (salario > 15000 && salario <= 30000) {
            // Si el salario está entre 15,001 y 30,000, se aplica un impuesto del 10%
            impuesto = salario * 0.10;
            System.out.println("Pagas 10% de impuestos");
        } else if (salario > 30000 && salario <= 50000) {
            // Si el salario está entre 30,001 y 50,000, se aplica un impuesto del 15%
            impuesto = salario * 0.15;
            System.out.println("Pagas 15% de impuestos");
        } else if (salario > 50000 && salario <= 80000) {
            // Si el salario está entre 50,001 y 80,000, se aplica un impuesto del 20%
            impuesto = salario * 0.20;
            System.out.println("Pagas 20% de impuestos");
        } else if (salario > 80000) {
            // Si el salario es superior a 80,000, se aplica un impuesto del 30%
            impuesto = salario * 0.30;
            System.out.println("Pagas 30% de impuestos");
        } else {
            // Si el valor ingresado no corresponde a un rango lógico, muestra un mensaje de error
            System.out.println("Valor ingresado no válido...");
        }

        // Calculamos el salario total después de aplicar el impuesto
        double total = salario - impuesto;
        // Mostramos el salario final después de impuestos
        System.out.println("Salario después de impuestos: " + total);

        
        ingreseSalario.close();// Cerramos el objeto Scanner 
    }
}
