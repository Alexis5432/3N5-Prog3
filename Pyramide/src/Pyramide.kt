fun main(args: Array<String>) {
    for (element in args){
        var hauteur = element.toIntOrNull()

        if (hauteur != null && hauteur >0){
            pyramide(hauteur)
        }
        else{
            println("Hauteur invalide")
        }
    }

}

fun pyramide(hauteur: Int) {
    var etoile = "*"
    var espace = " "
    for (element in 1..hauteur) {
        var espace = " ".repeat(hauteur- element)
        var etoile = "*".repeat(2 * element - 1 )
        println (espace + etoile )
    }
}