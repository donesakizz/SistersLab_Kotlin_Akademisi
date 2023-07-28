package Hafta2Odevleri.Odev2

/*
 Bir "Oyuncu" adlı üst sınıf oluşturun.
 Ardından "Futbolcu" ve "Basketbolcu" adında iki alt sınıf oluşturun.
 Her bir alt sınıfın kendine özgü özellikleri ve işlevleri olsun.
 Oyuncuların "oyna" işlevi olan bir program yazın
 */

// Oyuncu adlı üst sınıfı oluşturulur
open class Oyuncu(val ad: String, val yas: Int)

// Futbolcu adlı alt sınıfı oluşturulur ve Oyuncu sınıfından kalıtım alınır
class Futbolcu(ad: String, yas: Int, val mevki: String) : Oyuncu(ad, yas) {
    // Futbolcu'nun top oynama işlevi
    fun topOyna() {
        println("$ad isimli futbolcu $mevki mevkisinde top oynuyor.")
    }
}

// Basketbolcu adlı alt sınıfı oluşturalur ve Oyuncu sınıfından kalıtımı alınır
class Basketbolcu(ad: String, yas: Int, val pozisyon: String) : Oyuncu(ad, yas) {
    // Basketbolcu'nun top oynama işlevi
    fun topOyna() {
        println("$ad isimli basketbolcu $pozisyon pozisyonunda top oynuyor.")
    }
}

fun main() {
    val futbolcu = Futbolcu("hasan", 25, "Forvet")
    val basketbolcu = Basketbolcu("Hüseyin", 28, "Kaleci")

    futbolcu.topOyna()
    basketbolcu.topOyna()
}
