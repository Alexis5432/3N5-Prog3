package org.example

fun main(args: Array<String>) {
    val liste: MutableList<Int> = mutableListOf()
    for (i in args) {
        liste.add(i.toInt())
    }
    println("Entrez un nombre :")

    var reponse: Int = readln().toInt()
    var resultat = trouveALaMain(reponse, liste)
    var resultatCompteALaMain = compteALaMain(reponse,liste)
    if (resultat) {
        println("Le nombre est dans la liste. Il est présent ${resultatCompteALaMain} de fois")
    } else {
        println("Le nombre n'est pas dans liste")
    }


//    Exercie Trouve :Marche mais dois enlever pour marcher comme il faut
//    var resultatTrouve = trouve(reponse,liste)
//    if (resultatTrouve) {
//        println("Le nombre est dans la liste")
//    } else {
//        println("Le nombre n'est pas dans liste")
//    }

}

fun trouveALaMain(element: Int, liste: List<Int>): Boolean {
    for (i in liste) {
        if (i == element) {
            return true
        }
    }
    return false
}

fun trouve(element: Int, liste: List<Int>): Boolean{
    return liste.contains(element)
}

fun compteALaMain(element: Int, liste: List<Int>): Int{
    var nombre = 0
    for (i in liste){
        if (i == element){
            nombre ++
        }
    }
    return nombre

}
fun compte(element: Int, liste: List<Int>):Int{
    var nombre = 0
    if (liste.contains(element)){
        nombre ++
    }
    return nombre
    //return liste.count {it == element}
}