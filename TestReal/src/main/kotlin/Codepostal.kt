package org.example
fun main(){
    isValidZipCode("H1Y1E1")
}
fun isValidZipCode(zippy: String): Boolean {
    val regex = "^[A-Za-z]\\d[A-Za-z]([-\\s]?)\\d[A-Za-z]\\d$".toRegex()
    return regex.matches(zippy)
}