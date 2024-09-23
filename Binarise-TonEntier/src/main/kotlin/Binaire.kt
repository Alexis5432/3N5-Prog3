package org.example

fun main(args: Array<String>){
    val chaine = args[0]
    val nombre = chaine.toInt()
    val binaire :String = Integer.toBinaryString(nombre)
    println(binaire)
}