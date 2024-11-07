fun uneFonction(){
    try {
        //du code…
    } catch (e: Exception){
        println("Erreur : $e")
    } catch (a: ArrayIndexOutOfBoundsException){
        println("Erreur : $a")
    }
}
//Oui car il est possible d'ajouter plusieurs catch .

//try {
//    //calculs compliqués...
//} catch (e: NumberFormatException) {}
//}
//mauvais car le catch manque le println
