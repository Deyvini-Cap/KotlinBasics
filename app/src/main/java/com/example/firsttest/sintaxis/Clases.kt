package com.example.firsttest.sintaxis

fun main(){

    val jose = Usuario(
        "Jose",
        32,
        "jose@galdamez.com",
        "DNI45849058")

    val erick = Usuario(
        "Erick",
        32,
        "erick@galdamez.com",
        "DNI78")

    val yenifer = Usuario(
        "Yenifer",
        32,
        "yenifer@galdamez.com",
        "DNI234534asdf"
    )

    jose.addFriend(yenifer)
    yenifer.addFriend(erick)
    erick.addFriend(yenifer)
    jose.addFriend(erick)
    yenifer.addFriend(jose)
    erick.addFriend(jose)

    jose.getFriends()
    yenifer.getFriends()
    erick.getFriends()
}