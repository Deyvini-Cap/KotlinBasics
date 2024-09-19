package com.example.firsttest.sintaxis

fun main(){
    val name = "Jose Galdamez"
    val role = "admin"
    val age = 17

    if ((age >= 18) && (age <= 50)){
        println("$name es mayor de edad.")
    } else if (age > 50){
        println("$name es un adulto mayor.")
    } else{
        println("$name es menor de edad")
    }

    if(role == "user"){
        println("Tienes acceso a tu perfil")
    }

    if(role == "admin"){
        println("Tienes acceso a todos los contenidos")
    }

    if(role == "quest"){
        println("Solo lectura")
    }
}