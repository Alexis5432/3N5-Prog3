package org.example
import java.io.File
import java.io.IOException

fun main(){
    val fichier = File("vide.txt")
    if (fichier.createNewFile()){
        println("Fichier vide.txt à été créé")
    }
    else{
        println("Une erreur est apparue")
    }
    val nom = "Alexis Bourgeois"
    val fichierNom =  File("../Parent.txt")
    fichierNom.writeText(nom)
    println("Le fichier a été créé")

}