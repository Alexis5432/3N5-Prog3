package org.example

fun main (args: Array<String>){
    var liste: MutableList<Double> = mutableListOf()
    for (i in args){
        liste.add(i.toDouble())
    }
    liste.reverse()
    print(liste)
    triInverse(liste)
}
fun triInverse(liste:List<Double>): List<Double>{
    return liste.sortedDescending()
}