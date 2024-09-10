package org.example

fun main() {
    var question: String = "Veuillez entrez votre nombre:"

    while(true){
        println(question)

        try{
            var reponse: Int = readln().toInt()
            println("Merci, votre nombre est ${reponse}")
            return
        }
        catch(e:Exception){
            println("Ceci n'est pas un nombre, veuillez entrer un nombre:")
        }


    }


}