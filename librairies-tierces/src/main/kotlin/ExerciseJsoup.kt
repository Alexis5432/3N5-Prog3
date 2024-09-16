package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

fun main(args: Array<String>){
    var url = args[0]
    val doc: Document = Jsoup.connect(url).get()
    val balise: List<Element> = doc.select("a")
    print(balise)
}