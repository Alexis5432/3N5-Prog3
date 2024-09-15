package org.example

fun main (args: Array<String>){
    val motDeLaList: Set<String> = args.toSet()
    var mot = motDeLaList.sorted()
    mot.forEach{ println(it)}


}