fun main(args: Array<String>) {


for (hauteur in args){
    triangle(hauteur.toInt())
    

}


}
fun triangle (hauteur:Int){
    var emplacement = hauteur
    var longeur = 1
    var espace = 5
    var ligne = ""


    for(i in 1..hauteur) {
        ligne = " ".repeat(espace) + "*".repeat(longeur)
        longeur += 2
        espace--
        println(ligne)
    }

}
