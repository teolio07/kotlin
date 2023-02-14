fun main(){
    /* calcular la nota final de n estudiantes sabiendo que el taller vale el 20%
        quiz 30% y la evaluacion 50% (do while) */
    println("Ingresa cuantos estudiantes vas a calcular la nota")
    var contador = Integer.parseInt(readLine())
    var i = 0
    do{

       var porcentajeTaller = 0.2
       var porcentajeQuiz = 0.3
       var porcentajeEvaluacion = 0.5

       println("Ingrese nombre estudiante")
       var nombre = readLine()
       println("Ingresa la nota del taller")
       var notaTaller = readLine()
       println("Ingresa la nota del quiz")
       var notaQuiz = readLine()
       println("Ingresa la nota de la evaluacion")
       var notaEvaluacion = readLine()

      

       var notaFinal = (notaTaller!!.toFloat()*porcentajeTaller)+(notaQuiz!!.toFloat()*porcentajeQuiz)+(notaEvaluacion!!.toFloat()*porcentajeEvaluacion)
       println("$nombre su nota final fue: $notaFinal")
       i++
    }while(i <= contador)

}