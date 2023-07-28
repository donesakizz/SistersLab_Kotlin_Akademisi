package Hafta2Odevleri.Odev1

import kotlin.math.PI

/*
  Bir "GeometrikSekil" adlı üst sınıf oluşturun.
  Ardından "Dikdortgen" ve "Daire" adında iki alt sınıf oluşturun.
  Her alt sınıfın kendine özgü alan ve çevre hesaplayan işlevleri olsun.
  (Dikdörtgen alan = uzunluk x genişlik,
  çevre = 2 x (uzunluk + genişlik),
  Daire alan = π x yarıçap x yarıçap, çevre = 2 x π x yarıçap)
  Not: ortak kullanılanlar GeometrikSeklin özelliği olacak
    */

// GeometrikSekil adlı üst sınıfı oluşturulur
open class GeometrikSekil {
    open fun alanHesapla(): Double {
        return 0.0
    }

    open fun cevreHesapla(): Double {
        return 0.0
    }
}

// Dikdortgen adlı alt sınıfı oluşturulur ve GeometrikSekil sınıfından kalıtım alınır
class Dikdortgen(val uzunluk: Double, val genislik: Double) : GeometrikSekil() {
    // Dikdortgen'in alanını hesaplayan fonksiyon
    override fun alanHesapla(): Double {
        return uzunluk * genislik
    }

    // Dikdortgen'in çevresini hesaplayan fonksiyon
    override fun cevreHesapla(): Double {
        return 2 * (uzunluk + genislik)
    }
}

// Daire adlı alt sınıfı oluşturulur ve GeometrikSekil sınıfından kalıtım alınır
class Daire(val yaricap: Double) : GeometrikSekil() {
    // Daire'nin alanını hesaplayan fonksiyon
    override fun alanHesapla(): Double {
        return PI * yaricap * yaricap
    }

    // Daire'nin çevresini hesaplayan fonksiyon
    override fun cevreHesapla(): Double {
        return 2 * PI * yaricap
    }
}

fun main() {
    val dikdortgen = Dikdortgen(6.0, 5.0)
    val daire = Daire(5.0)

    println("Dikdortgen Alanı: ${dikdortgen.alanHesapla()}")
    println("Dikdortgen Çevresi: ${dikdortgen.cevreHesapla()}")

    println("Daire Alanı: ${daire.alanHesapla()}")
    println("Daire Çevresi: ${daire.cevreHesapla()}")
}
