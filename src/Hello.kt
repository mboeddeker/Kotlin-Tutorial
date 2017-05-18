/*
Kotlin ist Zukunft, ähnlich Swift und schnell zu erlernen.
In diesem Tutorial lernen wir Kotlin in der Basis zu benutzen,
wie kleine normale Java Programme.

In einem anderen Tutorial, lernen wir, wie wir Kotlin in der Android Umgebung
nutzen können

Eine Kotlin Anwendung wird ähnlich gestartet wie in Java. und zwar mit

fun main(args: Array<String>){}

In IDEA können wir auch einfach nur 'main' tippen und die IDE macht es zu dem,
was es werden soll.
 */

fun main(args: Array<String>) {

    /*
    Hier schreiben wir alle Programm Anweisungen herein.
     */



    // VARIABLEN & VALUES
    /*
    Eine Variable wird in Kotlin mit 'var' instanziert, ähnlich wie bei Swift.
    Variablen sind veränderbar.
     */

    var hausNummer = 10
    // Diese können auch verändert werden
    hausNummer = 20

    // Values mit dem Vorwort 'val' ist nicht veränderbar.
    val postleitZahl = 55221
    //postleitZahl = 000000

    /*
    Kotlin erkennt automatisch den Datentypen einer Variable, wenn dieser Eindeutig ist.
    Es ist aber immer besser, den Typen anzugeben. Int, Double, String etc.
    Dadurch kann es mir nicht passieren, dass ich ausversehen etwas falsch deklariere, besonders
    bei großem Code.
     */

    var myName: String = "Marvin"
    //myName = 9

    //TYPEN LISTE zu lesen unter https://kotlinlang.org/docs/reference/basic-types.html
    // GOOGLE : Kotlin Types


    // STRINGS
    /*
    Strings sind in eigentlich jeder Sprache schöne mächtige Datentypen, auch in Kotlin.
    Und obwohl sie mächtig sind, sind sie einfach zu bedienen!
     */

    val meinString: String = "Mein String ist dieser hier!"
    val zweiZeiler: String = "Dies ist die erste Zeile. Eine Zweite?\nGerne hier!"
    val tabString: String = "Und nun mit etwas\tAbstand!"
    println(meinString)
    println(zweiZeiler)
    println(tabString)

    /*
    Diese Beispiele sind recht einfach, besonders schön in Kotlin, das habe ich bisher noch nie gesehen, wenn ich
    3 Anführungszeichen nehme, kann ich einfach alles dazwischen hauen, was ich möchte!
     */

    val superString: String = """
    val meinString: String = "Mein String ist dieser hier!"
    val zweiZeiler: String = "Dies ist die erste Zeile. Eine Zweite?\nGerne hier!"
    val tabString: String = "Und nun mit etwas\tAbstand!"
    println(meinString)
    println(zweiZeiler)
    println(tabString)
    """
    println(superString)

    /*
    Das war alles schön zur Formatierung etc pp, doch wie kann ich nun noch besser mit Strings arbeiten?
    Was wir nutzen können sind sogenannten Template Expressions, die wir, wie schon oben gesehen mit dem $
    beginnen.
     */

    val templateString = "$meinString hat eine Länge von ${meinString.length} Zeichen!"
    println(templateString)

    /*
    Das heißt: wir können innerhalb von Strings noch Funktionen oder Variablen aufrufen, die nicht vom Typen String sind
    und einfach umgewandelt werden. Ein wunderbares Feature, das so vieles einfacher macht
     */

    // OPTIONALS
    /*
    Ich nenne dieses Thema einfach mal optionals, weil mir dieses Prinzip aus der Swift Entwicklung sehr vertraut ist.
    Manchmal habe ich variablen, den weise ich zwar einen Typen zu, aber keinen Wert. Sie sind vllt nur befüllt.
    Dies muss ich Kotlin explizit zu erkenne geben.
     */

    var optionalerName: String? = null
    println(optionalerName?.length)
    //Um die Fehlerquote zu verringern, kann ich einen alternativen Wert festlegen!
    println(optionalerName?.length ?: 4)

    var optionalerName2: String? = "ABC"
    println(optionalerName2?.length)
    println(optionalerName2?.length ?: 4)


    // FUNCTIONS
    /*
    Funktionen oder auch Methoden beinhalten in der Regel eure Programmlogiken. Ein einfaches Beispiel.
     */

    fun hello(){
        println("Hello")
    }

    hello()

    // Funktionen können auch Parameter mitgegeben werden.
    fun helloMr(name: String = "Klister"){
        println("Hello Mr. $name")
    }

    helloMr()
    helloMr("Nikolaus")

    // Nun ich möchte auch mal einfach Dinge direkt mit der Funktion zurück geben, ein Beispiel dazu kenne wir schon.
    // Wenn wir String.length ausgeben, ist dies eine Funktion extra für Strings, dir mir einen Zahl ZURÜCK GIBT!
    fun numberOfSomeThing(): Int {
        return 4
    }

    println("Ich lasse mir ${numberOfSomeThing()} zurück geben")


    // Wenn ich zum Beispiel eine Email an viele Adressen schicken möchte,
    // kann ich auch das Keyword 'vararg' nutzen für meine Parameter und
    // darin mehrere Argumente speichern. Diese sollten aber den gleichen Typen haben

    fun sendEmailTo(vararg emails: String){
        println("Email an alle ${emails.size} gesendet!")
    }




}