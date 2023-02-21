fun main(args: Array<String>) {
    /* creacion de un par */
    val persona = Pair("Juan", 30)

    /* accediendo a un par */
    println(persona.first) // Imprime "Juan"
    println(persona.second) // Imprime "30"

    /* modificacion */
    val parOriginal = Pair("a", 1) // Crear un par con los valores "a" y 1
    val parNuevo = parOriginal.copy(second = 2) // Crear un nuevo par con el valor adicional 2

    /* toList */
    val par = Pair("a", 1)
    val lista = par.toList() // Devuelve una lista con los elementos "a" y 1

    /* Equals */
    val par1 = Pair("a", 1)
    val par2 = Pair("a", 1)
    val par3 = Pair("b", 2)

    par1.equals(par2) // Devuelve true
    par1.equals(par3) // Devuelve false

}