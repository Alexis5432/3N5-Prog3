package org.example

import org.jsoup.Jsoup
import org.jsoup.nodes.Document
import org.jsoup.nodes.Element

fun main(args: Array<String>){
    var url = args[0]
    val doc: Document = Jsoup.connect(url).get()
    val balise: List<Element> = doc.select("a")
    println(balise)
}

//String html = "<p>An <a href='http://example.com/'><b>example</b></a> link.</p>";
//Document doc = Jsoup.parse(html);
//Element link = doc.select("a").first();
//
//String text = doc.body().text(); // "An example link"
//String linkHref = link.attr("href"); // "http://example.com/"
//String linkText = link.text(); // "example""
//
//String linkOuterH = link.outerHtml();
//// "<a href="http://example.com"><b>example</b></a>"
//String linkInnerH = link.html(); // "<b>example</b>"