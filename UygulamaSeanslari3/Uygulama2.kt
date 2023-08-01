package UygulamaSeanslari3

//Bir listedeki tek sayıları filtreleyen bir fonksiyon yazın

fun main() {
    val Listem = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val tekSayilar = tekSayilarfiltreleme(Listem)
    println("Tek sayılar: $tekSayilar")
}

fun tekSayilarfiltreleme(listem1: List<Int>): List<Int> {
    val tekSayilar = listem1.filter { it % 2 == 1 } as List<Int>
    return tekSayilar
}