package Hafta2Odevleri.Odev5

/*
Bir "Kullanici" adlı sınıf oluşturun ve ad ve soyad gibi özellikleri içeren nullable özellikler tanımlayın.
 Kullanıcı adı ve soyadı null olabileceğini göz önünde bulundurarak bu özelliklere nasıl erişebilirsiniz?

 */

class Kullanici(val ad: String?, val soyad: String?) {
    fun bilgileriYazdir() {
        val tamAd = if (ad != null && soyad != null) {
            "$ad $soyad"
        } else if (ad != null) {
            ad
        } else if (soyad != null) {
            soyad
        } else {
            "İsim ve soyisim belirtilmemiş."
        }
        println("Ad ve Soyad: $tamAd")
    }
}

fun main() {
    val kullanici1 = Kullanici("Ahmet", "Yılmaz")
    val kullanici2 = Kullanici("Mehmet", null)
    val kullanici3 = Kullanici(null, "Kaya")
    val kullanici4 = Kullanici(null, null)

    kullanici1.bilgileriYazdir()
    kullanici2.bilgileriYazdir()
    kullanici3.bilgileriYazdir()
    kullanici4.bilgileriYazdir()
}