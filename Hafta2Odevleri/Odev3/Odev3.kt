package Hafta2Odevleri.Odev3

/*
Bir "Personel" adlı sınıf oluşturun ve
şirketteki personellerin özelliklerini (ad, soyad, pozisyon, maaş vb.) içeren nitelikleri ve "maasArttir" gibi işlevi ekleyin.

 */

class Personel(val ad: String, val soyad: String, val pozisyon: String, var maas: Double) {
    // Maas arttırma işlevi
    fun maasArttir(oran: Double) {
        maas += maas * (oran / 100)
    }

    // Personel bilgilerini yazdıran işlev
    fun bilgileriYazdir() {
        println("Ad: $ad")
        println("Soyad: $soyad")
        println("Pozisyon: $pozisyon")
        println("Maaş: $maas")
        println("----------------------------")
    }
}

fun main() {
    // Personel nesnelerini oluşturulur
    val personel1 = Personel("Ahmet", "Yılmaz", "Mühendis", 5000.0)
    val personel2 = Personel("Mehmet", "Kaya", "Teknisyen", 3500.0)

    // Personel bilgilerini yazdırılır
    personel1.bilgileriYazdir()
    personel2.bilgileriYazdir()

    // Maaşları arttıralım ve tekrar bilgileri yazdırılır
    personel1.maasArttir(10.0)
    personel2.maasArttir(15.0)

    println("Maaşlar arttırıldıktan sonra:")
    personel1.bilgileriYazdir()
    personel2.bilgileriYazdir()
}
