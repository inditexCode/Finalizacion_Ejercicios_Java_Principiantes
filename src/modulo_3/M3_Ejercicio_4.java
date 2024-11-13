package modulo_3;

import java.util.Scanner;

public class M3_Ejercicio_4 {

	public static void main(String[] args) {
		
/*  Calculadora de Operaciones Matemáticas
    Descripción: Crea un programa en Java que simule una calculadora básica. 
    El programa debe pedir al usuario que ingrese dos números y luego elegir 
    una operación matemática (suma, resta, multiplicación o división) usando switch.
    Además, si el usuario selecciona una división, el programa debe verificar 
    si el divisor es cero utilizando una sentencia if-else para evitar errores 
    de división por cero.
*/
	System.out.println("===> Calculadora Matemática <===");	
     
	Scanner teclado = new Scanner(System.in);
	System.out.println("Ingrese un número."); 
	int num1 = teclado.nextInt();
	System.out.println("Ingrese el segundo número");
	int num2 = teclado.nextInt();
	
	System.out.println("que operación desea realizar ? ");
	System.out.println("1 - Suma");
	System.out.println("2 - Resta");
	System.out.println("3 - Multiplicación");
	System.out.println("4 - División");

	int opcion = teclado.nextInt();
	
	switch(opcion) {
	case 1:
		System.out.println("Total de la suma: " + (num1 + num2) );
		break;
	case 2:
		System.out.println("Total de la resta: " + (num1 - num2));
		break;
	case 3:
		System.out.println("Total de la multiplicación: " + (num1 * num2));
		break;
	case 4:

		if(num2 == 0) {
			System.out.println("Error no se puede dividir por 0");
		}else {
			System.out.println("Total de la división: " + (num1 / num2));
		}
		break;
		default:
			System.out.println("Error opción inválida, vuelva a elegir");
		break;
	}
 
	teclado.close();
	
	
	
	}

}
