package org.Bourgeois

fun main(){
 println(isValidEmail("a..b@popi.org"))
}
fun isValidEmail(courriel: String): Boolean {

    val regex = "^[a-zA-Z]\\d[a-zA-Z]([\\s-]?\\d[a-zA-Z]\\d)?$".toRegex()
    return courriel.matches(regex)
}