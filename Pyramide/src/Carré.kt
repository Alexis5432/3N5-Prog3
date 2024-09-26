fun main() {
    val longueur = 5 // Longueur du carré
    val hauteur = 5  // Hauteur du carré

    dessinerCarreHollow(longueur, hauteur)
}

fun dessinerCarreHollow(longueur: Int, hauteur: Int) {
    for (i in 1..hauteur) {
        for (j in 1..longueur) {
            // Imprime un astérisque pour le premier et le dernier rangée,
            // ou pour le premier et le dernier colonne
            if (i == 1 || i == hauteur || j == 1 || j == longueur) {
                print("* ")
            } else {
                print("  ") // Espace vide pour l'intérieur du carré
            }
        }
        println() // Passer à la ligne suivante
    }
}