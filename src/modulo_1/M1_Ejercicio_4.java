package modulo_1;

import java.util.Scanner;

public class M1_Ejercicio_4 {

	public static void main(String[] args) {
/*Enunciado: Crea un programa que pida al usuario dos números enteros y realice 
las siguientes operaciones matemáticas básicas: suma, resta
El programa debe mostrar los resultados de todas estas operaciones.*/

 System.out.println("===> Operaciones Matemáticas: <===");
 System.out.println("Ingrese 2 números enteros para las siguientes operaciones: + - ");
		
//Crear un objeto Scanner para obtener la entrada del usuario
 Scanner teclado = new Scanner(System.in);
 
 // Solicitar al usuario que ingrese dos números enteros
 System.out.println("Ingrese el primer número entero: ");
 int num1 = teclado.nextInt();
 
 System.out.println("Ingrese el segundo número entero: ");
 int num2 = teclado.nextInt();
 
 int suma = num1 + num2;
 int resta = num1 - num2;
 
 System.out.println("La suma de " + num1 + " + " + num2 + " = " + suma);
 System.out.println("La resta de " + num1 + " - " + num2 + " = " + resta);

 
 
 // Cerrar el Scanner
 teclado.close();
}
}