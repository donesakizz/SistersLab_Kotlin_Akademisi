package UygulamaSeanslari3

//İki listenin elemanlarını birleştirip sıralayan bir fonksiyon yazın


fun main() {
    val liste1 =  arrayListOf(3, 1, 4, 2)
    val liste2 = arrayListOf(9, 6, 7, 5, 8)
    val birlesikListe = birlestirVeSirala(liste1, liste2)
    println("Birleştirilmiş ve Sıralanmış Liste: $birlesikListe")
}

fun birlestirVeSirala(liste1: List<Int>, liste2: List<Int>): List<Int> {
    val birlestirilmisListe = liste1 + liste2
    return birlestirilmisListe.sorted()
}