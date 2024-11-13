package modulo_5_array2;

public class M5_Ejercicio_6 {
	
	/*En las fiestas de un barrio hay competiciones deportivas que premian el desempeño 
	  en ellas con cupones que luego puedes cambiar 
	  por golosinas. Una barra de caramelo se puede cambiar por 10 cupones, 
	  y un chicle por 3 cupones.
	  Escribe una clase CandyCalculator que tenga un método candyCalculator que permita:
	 A. Calcular, dado un número dado de cupones, cuantas barras de caramelo y chicles puedes obtener si gastas todos tus cupones en 
	    barras de caramelo primero, y utilizas los cupones restantes en chicles.
	 B. También te tiene que devolver el número de cupones restantes que no puedes gastar.
	 C. Devuelve los valores en un array en donde la posición [0] representa las barras
	    de caramelo, la posición [1] los chicles y la 
	    posición [2] los cupones restantes.*/

    public static void main(String[] args) {
    	System.out.println("===> Fiesta del barrio 🥳🥳🥳 <===");

        int cupones = 29; // Ejemplo de número de cupones
        int[] resultado = CandyCalculator.candyCalculator(cupones);

        System.out.println("Con " + cupones + " cupones:");
        System.out.println("Barras de caramelo: " + resultado[0]);
        System.out.println("Chicles: " + resultado[1]);
        System.out.println("Cupones restantes: " + resultado[2]);
    }

    // Clase interna CandyCalculator
    public static class CandyCalculator {

        // Método que calcula la cantidad de barras de caramelo, chicles y cupones sobrantes
        public static int[] candyCalculator(int cupones) {
            int[] resultado = new int[3]; // Array para almacenar barras, chicles y cupones restantes

            // A. Calcular la cantidad de barras de caramelo (10 cupones cada una)
            resultado[0] = cupones / 10; // Barras de caramelo que se pueden obtener
            cupones %= 10; // Actualizar los cupones restantes después de obtener barras

            // B. Calcular la cantidad de chicles (3 cupones cada uno)
            resultado[1] = cupones / 3; // Chicles que se pueden obtener
            cupones %= 3; // Actualizar los cupones restantes después de obtener chicles

            // C. Cupones restantes que no se pueden gastar
            resultado[2] = cupones;

            return resultado;
        }
    }
}
