package modulo_5_array2;

public class M5_Ejercicio_7{
/*  Implementa la función int contarVocales(String) que dada una cadena, 
 *  cuenta el número de vocales que existe en la misma. No 
    importa que las vocales estén en mayúsculas o minúsculas y el resto de caracteres 
    que no sean vocales son ignorados. También se ignoran las vocales acentuadas.
  Ejemplos:
  "AeIoU" devuelve 5 (cuenta las vocales tanto mayúsculas como minúsculas)
  "nacio una abeja bajo el sol“  devuelve 12 (no cuenta las consonantes)
  "¿Nació una abeja bajo el Sol?“  devuelve 11 (Ignora las vocales acentuadas y otros caracteres) 
 * */

	public static int contarVocales(String cadena) {
		int contador = 0; // inicializamos el contador
		
		cadena = cadena.toLowerCase();
		
		for (int i = 0; i < cadena.length(); i++) {
            char C = cadena.charAt(i);
            
            if(C == 'a' ||C == 'e' ||C == 'i' ||C == 'o' ||C == 'u') {
            	contador++;
            }	
		}
		 return contador;// Devolvemos el número total de vocales no acentuadas
	}
	
	public static void main(String[] args) {
		System.out.println("===> Contador de Vocales <===");
		
		// Ejemplos de uso de la función contarVocales
        System.out.println(contarVocales("AeIoU")); // Debe devolver 5
        System.out.println(contarVocales("nacio una abeja bajo el sol")); // Debe devolver 12
        System.out.println(contarVocales("¿Nació una abeja bajo el Sol?")); // Debe devolver 11

	}

}
