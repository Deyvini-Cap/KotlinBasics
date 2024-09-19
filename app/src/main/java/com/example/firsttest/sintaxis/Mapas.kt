package com.example.firsttest.sintaxis

fun main(){

    val mapOfPokemos = mutableMapOf("pikachu" to "electric", "chamander" to "fire")

    println(mapOfPokemos["pikachu"])

    mapOfPokemos.put("squirtle", "water")
    mapOfPokemos["Mew"] = "psychic"

    println(mapOfPokemos["squirtle"])
    println(mapOfPokemos["Mew"])

    println("Todos los pokemos")
    println(mapOfPokemos)
}