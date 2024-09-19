package com.example.firsttest.sintaxis

fun main(){
    val jose = Person("Jose", "Galdamez", CivilStatus.Single)
    val yenifer = Person("Yenifer", "Rosales", CivilStatus.Comprometed)
    val pedro = Person("Pedro", "Lopez", CivilStatus.Single)

    if(jose.civilStatus == pedro.civilStatus){
        println("Tienen el mismo estado civil")
    }else{
        println("No tienen el mismo estado civil")
    }
}