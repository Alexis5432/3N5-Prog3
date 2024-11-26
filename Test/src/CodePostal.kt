fun main() {
    isValidZipCode("H1Y1E1, H1Y 1E1, h3Y 1E8")
}

fun isValidZipCode(zippy: String): Boolean {
    val regex = "^[A-Za-z]\\d[A-Za-z]([-\\s]?)\\d[A-Za-z]\\d$".toRegex()
    return zippy.matches(regex)
}