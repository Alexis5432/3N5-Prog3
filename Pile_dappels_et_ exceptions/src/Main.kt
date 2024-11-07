import kotlin.jvm.Throws

fun main() {
   val tableau = arrayOf("Pomme", "Orange", "Poire", "Kiwi")

    try{
        val index = trouveru(tableau, "Pomme")
        print("L'élément à été trouver à l'index $index")
    }
    catch (e : ElementNonTrouver){
        println(e.message)
    }

    try {
     val mauvais = trouveru(tableau, "Raisin ")
        print("L'élément à été trouver à l'index $mauvais")
    }
    catch (e : ElementNonTrouver){
        println(e.message)
    }

}
fun trouveru(tableau: Array<String>, element: String): Int  {
    for ( i in tableau.indices){
        if(tableau[i] == element){
            return i
        }
    }
throw ElementNonTrouver("L'élément $element n'est pas de le tableau")
}