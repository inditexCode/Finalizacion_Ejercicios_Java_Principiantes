package modulo_1;

import java.util.Scanner;

public class M1_Ejercicio_2 {

	public static void main(String[] args) {
		
 /*2 - La gravedad de la Luna es aproximadamente el 17% de la gravedad de la Tierra. 
 * Se pide: Crear un programa que, dado un peso de la Tierra, 
 * calcule su equivalente en la Luna.El programa debe mostrar por pantalla un mensaje
 * similar a este: “Un peso de 30 kilos en la Tierra equivalen a X kilos en la Luna”.*/
		
		System.out.println("===> Calculamos kilos en la tierra a kilos en la luna <===");
		double GRAVEDAD_LUNA = 0.17;

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Ingrese los kilos que quiere calcular:");
		double pesoTierra = teclado.nextDouble();
		
		double pesoLuna = pesoTierra * GRAVEDAD_LUNA;
		
		System.out.println("Kilos en la tierra => " + pesoTierra + " <= " + pesoLuna);
		
		teclado.close();
	}

}
