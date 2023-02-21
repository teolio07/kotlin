fun main(args: Array<String>) {
    /* creacion de un conjunto mutable */
    
    val numerosMutable = mutableSetOf(1, 2, 3, 4, 5) // conjunto mutable

    /* saber si un elemento esta presente en un conjunto */

    val numeros = setOf(1, 2, 3, 4, 5)

    if (numeros.contains(3)) {
        println("El conjunto contiene el número 3")
    }

    /*Imprimir el conjunto resultante sin números impares*/
    val numeros = mutableSetOf(1, 2, 3, 4, 5)

    numeros.removeIf { it % 2 != 0 }

    println(numeros) 

    /* iteracion de un conjunto */
    val nombres = setOf("Ana", "Luis", "María", "Carlos")

    for (nombre in nombres) {
        println(nombre)
    }


    val numeros = setOf(1, 2, 3, 4, 5)
    /* imprimir los elementos de un conjunto */
    numeros.forEach { println(it) } // Iterar sobre cada elemento e imprimirlo
    
    val numerosDobles = numeros.map { it * 2 } // Crear una nueva colección con cada elemento multiplicado por 2

    val numerosPares = numeros.filter { it % 2 == 0 } // Crear una nueva colección con solo los elementos pares

    val indexTres = numeros.indexOf(3) // Encontrar el índice del elemento "3" no se recomienda
}