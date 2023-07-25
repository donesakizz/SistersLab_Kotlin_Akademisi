package UygulamaSeanslari1

import java.lang.Math.sqrt

//İki sayının asal olup olmadığını kontrol eden bir fonksiyonu yazın
fun main() {
    val sayi1 = 19
    val sayi2 = 37

    if (kontrolAsal(sayi1, sayi2)) {
        println("$sayi1 ve $sayi2 asal sayılardır.")
    } else {
        println("$sayi1 ve $sayi2 asal sayılar değildir.")
    }
}

fun asalMi(sayi: Int): Boolean {
    if (sayi <= 1) {
        return false
    }

    for (i in 2 until sayi) {
        if (sayi % i == 0) {
            return false
        }
    }

    return true
}

fun kontrolAsal(sayi1: Int, sayi2: Int): Boolean {
    return asalMi(sayi1) && asalMi(sayi2)
}




