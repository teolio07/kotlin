fun main(){
     println("Ingrese su nombre")
     var nombre = readLine()
     println("Ingresa su codigo")
     var codigo = readLine()

     var validacion = if(codigo == "123"){
          "tiene acceso"
     }else{
          "no tiene acceso"
     }

     println("$nombre $validacion")
}