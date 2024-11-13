package modulo_1;

import java.util.Scanner;

public class M1_Ejercicio_1 {

	public static void main(String[] args) {
		/* 1 - Ejercicio: Calculadora de área de un círculo
   Enunciado: Crea un programa que calcule el área de un círculo. 
   El usuario debe ingresar el radio del círculo y el programa debe mostrar el área
   calculada utilizando la fórmula Área = π * radio². Usa el valor de π como 3.1416. */
		
		
		System.out.println("===> Calculamos el area de un círculo <===");
	    
		double PI = 3.1416;
		
		Scanner teclado =  new Scanner(System.in);
        
		System.out.print("Ingresá el radio del círculo: ");
		double radio = teclado.nextDouble();
		
		double area = PI * radio*radio;
		System.out.println("El área del circulo es: " + area);

		teclado.close();
	}

}
