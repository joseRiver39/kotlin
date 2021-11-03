package com.jaru.operaciones2

fun main(){

    val Operaciones = Operaciones(6,7,4)

    Operaciones.sumar()
    Operaciones.restar()
    Operaciones.multiplicar()

}


class Operaciones(val a:Int,val b:Int,val c:Int){

    fun sumar(){

        val resultado =a + b
        println("el resultado  de  la suma es :$resultado")

    }
    fun restar(){

        val resultado =a - c
        println("el resultado  de  la resta es :$resultado")

    }
    fun multiplicar(){

        val resultado =a * c
        println("el resultado  de  la multiplicacion es :$resultado")

    }


}