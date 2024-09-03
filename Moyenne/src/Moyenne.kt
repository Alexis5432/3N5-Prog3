import kotlin.random.Random

fun main(){
    creeTableauAleatoire(100)
}

fun creeTableauAleatoire(n: Int): Array<Int> {
    // ton code ici
   return  Array(n) { Random.nextInt()}
}

