package modulo_5_array2;

public class M5_Ejercicio_8 {
	
/* Implementa la función int contarConsonantes(String cadena) 
   que, dada una cadena, cuenta el número de consonantes que existe en la misma. 
   Ignora vocales, caracteres especiales y consonantes acentuadas.
   La función debe contar tanto consonantes mayúsculas como minúsculas sin diferenciarlas.

     Ejemplos
   "Hola Mundo" → devuelve 5 (las consonantes son H, L, M, N y D).
   "¿Viva la vida?" → devuelve 5 (las consonantes son V, V, L, V, D).
   "¡Qué día tan soleado!" → devuelve 7 (las consonantes son Q, D, T, N, S, L,D). 
*/
	
	public static int contarConsonantes(String cadena) {
		
		int contador = 0;
		cadena = cadena.toLowerCase();
		
		for (int i = 0; i < cadena.length(); i++) {
			char C = cadena.charAt(i);
			
	if((C >= 'a' && C <= 'z') &&!(C == 'a'|| C == 'e'||C == 'i'||C == 'o'||C == 'u'  )) {
		contador++;
	}
  }
		return contador;
	}

	public static void main(String[] args) {
		
		System.out.println("===> Contar Consonantes <===");
		System.out.println(contarConsonantes("Hola Mundo"));
		System.out.println(contarConsonantes("¿Viva la vida?"));
		System.out.println(contarConsonantes("¡Qué día tan soleado!"));


	}

}
