package com.example.firsttest.sintaxis

fun main(){

    var friends = listOf<String>("Jose", "Maria", "Peter")
    var ages = listOf<Int>(20, 23, 30)

    /*
    println(friends[1])
    println(ages[1])
    */

    // println(friends.first())
    // println(friends.last())

    // SET
    // friends.set(0,"Juan") // no se puede editar una lista

    var newFriends = mutableListOf("Jose", "Maria", "Peter")

    newFriends.set(0,"Erick")

    println(newFriends[0])

    newFriends.add("Mariela")

    println(newFriends)



}