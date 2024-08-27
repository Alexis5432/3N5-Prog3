package org.Bourgeois
fun main(){
    println(triangle(hauteur = 4) )
    println(triangle(hauteur = 8))
    println(triangle(hauteur = 10))
    println(triangle(hauteur = 100))




}
fun triangle(hauteur : Int) : String {

    var maString: String = ""

    for (i in 1..hauteur) {

        for (index in 1..i) {
            maString += "*"
        }
        maString += "\n"



    }
    return maString
}

