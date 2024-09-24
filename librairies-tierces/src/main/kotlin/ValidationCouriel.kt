package org.example
import org.apache.commons.validator.EmailValidator
fun main(){
    val listeEmails = arrayOf("jo@pipo.org", "ma_mu@m.ca", "a.a@a.ca", "a.a@a.aa", "ab@ab", "a.b@ab", "jo")
    val valide = EmailValidator.getInstance()

    for (email in listeEmails){
        val isValid = valide.isValid(email)
        println("Email: $email is valid: $isValid")
    }
}