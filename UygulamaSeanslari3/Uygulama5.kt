package UygulamaSeanslari3

//Verilen bir listedeki tekrar eden elemanları HashSet olarak döndüren bir fonksiyon yazın.

fun main() {
    val liste = arrayListOf(1, 2, 3, 4, 5,  6, 7,1,2,4)

    val tekrarEden = tekrarEdenElemanlar(liste)
    println("Tekrar eden elemanlar: $tekrarEden")
}

fun tekrarEdenElemanlar(listem1 : ArrayList<Int>) : HashSet<Int> {
    val tekrarEden = HashSet<Int>()
    val setliste = HashSet<Int>()

    for (sayi in listem1) {
        if (!setliste.add(sayi)) {
            tekrarEden.add(sayi)
        }
    }

    return tekrarEden
}