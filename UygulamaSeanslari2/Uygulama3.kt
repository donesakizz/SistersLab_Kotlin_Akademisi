package UygulamaSeanslari2

/*
Bir Integer türünde ArrayList oluşturun ve kullanıcıdan alınan 5 adet sayıyı bu listeye ekleyin.
Ardından, listedeki sayıları toplayan bir fonksiyon yazın ve sonucu ekrana yazdırın
 */
fun main() {
    val sayilarListesi = ArrayList<Int>()

    // Kullanıcıdan 5 adet sayı alınması
    for (i in 1..5) {
        print("Sayı $i: ")
        val sayi = readLine()?.toIntOrNull()
        if (sayi != null) {
            sayilarListesi.add(sayi)
        } else {
            println("Hatalı giriş! Lütfen geçerli bir sayı girin.")
            return
        }
    }

    val toplam = toplamHesapla(sayilarListesi)
    println("Sayıların Toplamı: $toplam")
}

fun toplamHesapla(liste: ArrayList<Int>): Int {
    var toplam = 0
    for (sayi in liste) {
        toplam += sayi
    }
    return toplam
}
