fun main(args: Array<String>) {
    /* creacion de una lista */
    val numeros = listOf(1, 2, 3, 4, 5)

    /*  Una vez creada la lista, se puede acceder a sus elementos utilizando corchetes [ ] y el índice del elemento que se desea acceder: */
    val tercerNumero = numeros[2] // el tercer elemento es el índice 2
    println(tercerNumero)

    /* creacion de una lista mutable */
    val nombres = mutableListOf("Juan", "Pedro", "Ana")
    nombres.add("María") // agregar un nuevo elemento al final de la lista
    nombres.removeAt(1) // eliminar el elemento en el índice 1 (Pedro)

    /* iteracion de una lista con el ciclo for */
    val numeros = listOf(1, 2, 3, 4, 5)

    for (numero in numeros) {
        println(numero)
    }

    /* indexOf halla la primera coincidencia y devuelve su indice */
    val numeros = listOf(1, 2, 3, 4, 5)
    val indice = numeros.indexOf(3) // devuelve 2

    /* iterara cada uno de los elementos de la lista */
    val numeros = listOf(1, 2, 3, 4, 5)
    numeros.forEach { numero -> println(numero) } // imprime cada número en la consola
}