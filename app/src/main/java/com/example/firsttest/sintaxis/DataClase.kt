package com.example.firsttest.sintaxis

fun main(){
    val jose = Person("Jose", "Galdamez", CivilStatus.Married)
    val yenifer = Person("Yenifer", "Rosales", CivilStatus.Comprometed)

    println(jose.name)
    println(yenifer.name)

}