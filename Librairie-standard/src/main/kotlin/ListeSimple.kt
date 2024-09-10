package org.example
fun main (){
println(repete(4,4))
}
fun repete(n:Int,nombreFois: Int): List<Int>{
    var List = mutableListOf<Int>()
    for (i in 1..n){
        repeat(nombreFois){
            List.add(i)
        }
    }
    return List
}