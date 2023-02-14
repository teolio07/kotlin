fun main(){
    var opcion1 = arrayOf("caldo de costilla","arepa","chocolate")
    var opcion2 = arrayOf("Fruta","yogurt")

    println("Ingrese la respuesta del mesero")
    var respuesta1 = readLine()
    var respuesta2 = readLine()

    if(respuesta1 == "true" && respuesta2 == "true"){
        println("por favor la primera opcion")
    }else if(respuesta1 == "false" && respuesta2 == "true"){
        println("por favor la segunda opcion")
    }else{
        println("no encuentro lo que busco")
    }
}