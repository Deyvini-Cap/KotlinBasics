package com.example.firsttest.sintaxis

fun main(){
/*
    val friends = listOf("Ross","Monica","Joey")

    friends.forEach{ name ->
        println(name)
    }
*/

    /*
    mylambda("Jose", {
        println("Hola $it")
    })

     */
    mylambda("Jose"){ fullname ->
        println("ola, $fullname")
    }

}



fun mylambda( name:String, saludar: (name: String) -> Unit ){

    println("Estoy entrando a la funcion lambda")
    saludar("$name Galdamez")
    println("Estoy saliendo de la funcion lambda")
}