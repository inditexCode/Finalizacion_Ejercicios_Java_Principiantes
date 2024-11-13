package modulo_5_array2;
/*
 * 1 - Invertir los Elementos de un Array
       Objetivo: Crear un array de números enteros con 5 elementos.
       Luego, usar un bucle para invertir el orden de los elementos 
       y mostrar el array invertido.
Ejemplo:
Array original: 1, 2, 3, 4, 5
Array invertido: 5, 4, 3, 2, 1 
----------------------------------------------------------------------------------
 * 2 - Contar Ocurrencias de un Número en un Array
   Objetivo: Crear un array de números enteros con 10 elementos.
    Luego, pedir al usuario que ingrese un número y contar cuántas veces aparece 
    ese número en el array.
   Ejemplo:
   Array: 1, 3, 7, 8, 3, 9, 2, 3, 4, 5
   Si el usuario ingresa 3, la salida debe ser: El número 3 aparece 3 veces en el array. 
 * ---------------------------------------------------------------------------------
 * 3 - Clasificar Números en Pares e Impares
       Objetivo: Crear un array de números enteros con 8 elementos. 
   Recorrer el array y, usando condicionales, clasificar cada número en pares e impares.
   Guardar los números pares en un array y los impares en otro array, 
   y luego imprimir cada array por separado.
   --------------------------------------------------------------------
   4 - Objetivo: Crear un programa que muestre un menú con tres opciones:
       1) Verduras, 2) Frutas, 3) Salir. Dependiendo de la opción seleccionada,
      el programa debe mostrar una lista de frutas o verduras que se almacenan en un array de String.
   Funcionalidad:
   Opción 1: Muestra todas las verduras.
   Opción 2: Muestra todas las frutas.
   Opción 3: Salir del programa.
   ------------------------------------------------------------------------------------
  5 - Objetivo: Crear un programa que simule una tienda de tecnología con tres categorías
  *   de productos: Laptops, Teléfonos, y Tablets. El usuario puede elegir una categoría
  *   para ver los productos disponibles o salir del programa.
      Funcionalidad:
  Opción 1: Muestra todas las laptops disponibles.
  Opción 2: Muestra todos los teléfonos disponibles.
  Opción 3: Muestra todas las tablets disponibles.
  Opción 4: Sale del programa.
   
   
---------------------------------------------------------------------------------------
  6 - En las fiestas de un barrio hay competiciones deportivas que premian el desempeño 
  en ellas con cupones que luego puedes cambiar 
  por golosinas. Una barra de caramelo se puede cambiar por 10 cupones, 
  y un chicle por 3 cupones.
  Escribe una clase CandyCalculator que tenga un método candyCalculator que permita:
 A. Calcular, dado un número dado de cupones, cuantas barras de caramelo y chicles puedes obtener si gastas todos tus cupones en 
    barras de caramelo primero, y utilizas los cupones restantes en chicles.
 B. También te tiene que devolver el número de cupones restantes que no puedes gastar.
 C. Devuelve los valores en un array en donde la posición [0] representa las barras
    de caramelo, la posición [1] los chicles y la 
    posición [2] los cupones restantes. 
    -----------------------------------------------------------------------------------
 7 -
    Implementa la función int contarVocales(String) que dada una cadena, 
 *  cuenta el número de vocales que existe en la misma. No 
    importa que las vocales estén en mayúsculas o minúsculas y el resto de caracteres 
    que no sean vocales son ignorados. También se ignoran las vocales acentuadas.
  Ejemplos:
 "AeIoU" devuelve 5 (cuenta las vocales tanto mayúsculas como minúsculas)
 "nacio una abeja bajo el sol“  devuelve 12 (no cuenta las consonantes)
 "¿Nació una abeja bajo el Sol?“  devuelve 11
  (Ignora las vocales acentuadas y otros caracteres)   
     
----------------------------------------------------------------------------------------   
 8 - Implementa la función int contarConsonantes(String cadena) 
   que, dada una cadena, cuenta el número de consonantes que existe en la misma. 
   Ignora vocales, caracteres especiales y consonantes acentuadas.
   La función debe contar tanto consonantes mayúsculas como minúsculas sin diferenciarlas.

     Ejemplos
   "Hola Mundo" → devuelve 5 (las consonantes son H, L, M, N y D).
   "¿Viva la vida?" → devuelve 5 (las consonantes son V, V, L, V, D).
   "¡Qué día tan soleado!" → devuelve 7 (las consonantes son Q, D, T, N, S, L,D).
   -------------------------------------------------------------------------------------
  9 - El Juego de la Memoria
    Instrucciones: El juego muestra 5 cartas, cada una con un número aleatorio 
    entre 1 y 10. El jugador debe intentar recordar la posición de las cartas y adivinar 
    cuál carta tiene el número que se le pide. Si lo adivina, gana. Si no, pierde.
    --------------------------------------------------------------------------------
  10 -  Juego: Adivina el Número
    Instrucciones: El juego tiene un array con 5 números predefinidos.
    El jugador debe adivinar en qué posición del array se encuentra un número.
    El jugador tiene 3 intentos para adivinar.
    Si lo adivina, gana. Si no, pierde.
   
 * */
 