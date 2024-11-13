package modulo_1;

import java.util.Scanner;

public class M1_Ejercicio_5 {

	public static void main(String[] args) {
/* Escribe un programa en Java que calcule la edad de una persona en años, 
 * meses y días a partir de su fecha de nacimiento.
 
Instrucciones:

Declara tres variables int para almacenar el año, el mes y el día de nacimiento.
Declara tres variables adicionales para el año, mes y día actual.
Calcula la diferencia entre la fecha actual y la fecha de nacimiento.
Imprime el resultado en años, meses y días.
*/
		
		System.out.println("===> Calculamos la el año - mes - dia <===");
		
		int anio = 2024;
		int mes = 11;
		int dia = 8;
		
		Scanner teclado = new Scanner(System.in);
		
  // no se usa la Ñ en los lenguajes de programacion se los considera caracteres especiales
		System.out.println("Ingrese el año de nacimiento");
		int anioIngresado = teclado.nextInt();
		
		System.out.println("Ingrese el mes de nacimiento");
		int mesIngresado = teclado.nextInt();
		
		
		System.out.println("Ingrese el dias de nacimiento");
		int diasIngresado = teclado.nextInt();
		
		
		int aniosActual = anio - anioIngresado;
		int mesActual = mes - mesIngresado;
		int diasActual = dia - diasIngresado;
		
		// si te da valores negativos en los dias es porque necesitamos colocar 
		// condicionales, pero lo veremos mas adelante por el momento estos ejercicios 
		// son de practica basicas..
		System.out.println("La edad es " + aniosActual + " Años " + mesActual + " meses " + diasActual + " dias");
		
		teclado.close();
	}

}
