
import kotlin.random.Random

fun main(){
    println("Tableau: ${creeTableauAleatoire(5)} ")
    somme(creeTableauAleatoire(5))
    moyenne(creeTableauAleatoire(5))
    min(creeTableauAleatoire(5))
    max(creeTableauAleatoire(5))
}

fun creeTableauAleatoire(n: Int): Array<Int> {
    // ton code ici
    return Array(n) {Random.nextInt(0,100)}
}
fun somme (tableau: Array<Int>){
    val somme = tableau.sum()
    println("La somme est de : $somme")
}
fun moyenne (tableau: Array<Int>){
    val moyene = tableau.average()
    println("La moyenne est de : $moyene")
}
fun min (tableau: Array<Int>){
    val min = tableau.minOrNull()
    println("Le minimum est de : $min ")
}
fun max (tableau: Array<Int>){
    val max = tableau.max()
    println("le maximum est de : $max")
}