fun main(){
    println("Ingresa el dia")
    var dia = readLine()
    when(dia){
        "Lunes" -> println("quimica,edu fisica,estadistica")
        "Martes" -> println("quimica,edu fisica,estadistica")
        "Miercoles" -> println("quimica,edu fisica,estadistica")
        "Jueves" -> println("quimica,edu fisica,estadistica")
        "Viernes" -> println("quimica,edu fisica,estadistica")
        else -> {
            println("Ingresaste un dia incorrecto")
        }
    }
   
}