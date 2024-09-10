package org.example

import java.io.File

fun main(args: Array<String>) {
    var nomFichier1: String = args[0]
    var fichier1 : File = File(nomFichier1)
     if (fichier1.exists()){
         try{
             var text1: String = fichier1.readText()
             println(text1)
             var liste1: List<String> = text1.split("\n")
             println(liste1)
             var espace: String = liste1.joinToString("\n-------------\n")
             println(espace)
         } catch (e:Exception){
             println("Le fichier $nomFichier1 ne peut pas être lu.")

     }}else {
         println("Le fichie $nomFichier1 n'existe pas!")
     }

}