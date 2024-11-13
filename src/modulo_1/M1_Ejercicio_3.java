package modulo_1;

import java.util.Scanner;

public class M1_Ejercicio_3 {

    public static void main(String[] args) {
        /* Enunciado: Crea un programa que convierta una temperatura de grados Celsius a Fahrenheit.
           El programa debe pedir al usuario que ingrese la temperatura en grados Celsius luego
           mostrar la conversión a Fahrenheit usando la fórmula Fahrenheit = (Celsius * 9/5) + 32. */
        
        System.out.println("===> Convertimos grados Celsius a Fahrenheit <===");
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese los grados Celsius: ");
        double celsius = teclado.nextDouble();
        
        // Usamos 9.0 / 5.0 para asegurar que la división sea en punto flotante
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;
        
        System.out.println("Los grados Celsius " + celsius + " equivalen a -> " + fahrenheit + " Fahrenheit");
       
        teclado.close();
    }
}
