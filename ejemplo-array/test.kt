

fun main(args: Array<String>) {
    /* Para declarar un arreglo en Kotlin, se utiliza la palabra clave arrayOf seguida de los valores separados por comas entre parentesis */

    val numeros = arrayOf<Int>(1,2,4,5) 
    
   /*  Una vez creado un arreglo, se puede acceder a sus elementos utilizando corchetes [ ] y el índice del elemento que se desea acceder: */
   println(numeros[0]);

   /* para saber cuantos elementos tiene un array */
   println(numeros.size)

   /*Iterar sobre los elementos del array utilzando un metodo for */
   for(numero in numeros){
        println(numero)
   }

   /* Iterar sobre los índices de los elementos del array utilizando un ciclo for */

   for (indice in numeros.indices) {
        println("Elemento en la posición $indice es ${numeros[indice]}")
   }

   /* BUscar el indice de un elemento */
   val indice = numeros.indexOf(3) // Buscar el índice del elemento 3

   /* creacion de un nuevo array filtrando elementos */
   val numeros = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
   val numerosPares = numeros.filter { numero -> numero % 2 == 0 }

   /* creacion de un nuevo array modificando sus elementos */
   val numeros = arrayOf(1, 2, 3, 4, 5)
   val cuadrados = numeros.map { numero -> numero * numero }

    /* creacion de un nuevo array reduciendo los elementos de un array a un solo elemento */
    val numeros = arrayOf(1, 2, 3, 4, 5)
    val suma = numeros.reduce { acumulador, numero -> acumulador + numero }

    /* recorrer cada unos de los elementos de un array */
    val palabras = arrayOf("hola", "mundo", "en", "Kotlin")
    palabras.forEach { palabra -> println(palabra) }



}

