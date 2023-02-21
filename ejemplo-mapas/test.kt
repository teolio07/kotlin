fun main(args: Array<String>) {
    /* Un mapa puede ser mutable o inmutable ya sea la necesidad mapOf o mutableMapOf*/
    val diccionario = mapOf(
        "hola" to "saludo amistoso",
        "adiós" to "despedida",
        "sí" to "afirmación",
        "no" to "negación"
    )

    /* accediendo a un elemento si no existe imprime null*/
    println(diccionario["hola"]) // Imprime "saludo amistoso"
    println(diccionario["gracias"]) // Imprime "null"

    /* modificando elementos de un mapa */
    val numeros = mutableMapOf(
    "uno" to 1,
    "dos" to 2,
    "tres" to 3
    )

    numeros["cuatro"] = 4 //actualiza
    numeros.put("cinco", 5) //agrega
    numeros.remove("tres") // remueve


    /* iterando un mapa con for */
    for ((clave, valor) in numeros) {
        println("$clave = $valor")
    }


    /* creacion nuevo mapa con mapValues */
    val numeros = mapOf(
        "uno" to 1,
        "dos" to 2,
        "tres" to 3
    )
    
    val numerosDobles = numeros.mapValues { it.value * 2 }
    
    println(numerosDobles) // {uno=2, dos=4, tres=6}

    /* creacion de un nuevo array filtrando elementos */
    val numerosPares = numeros.filterValues { it % 2 == 0 }

    /* iteracion con forEach */
    numeros.forEach { (clave, valor) ->
        println("La clave $clave tiene el valor $valor")
    }

}