package com.example.firsttest.sintaxis

fun main(){

    val name = "Jose Galdamez"
    val age = 32
    val role = "admin"

    when{
        age > 60 -> println("$name es un anciano")
        age > 30 -> println("$name es un adulto")
        age > 18 -> println("$name es un adulto joven")
        else -> println("$name es menor de edad")
    }

    when(role){
        "admin" -> println("Acceso total")
        "user" -> println("Acceso limitado")
        else -> println("Acceso denegado")
    }
}