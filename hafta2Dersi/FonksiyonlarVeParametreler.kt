package hafta2Dersi

import java.util.*

//fun fonksiyonAdi(parametre1: Int,parametre2: String) . GeriDonusDegeri{}
//return geriDonusDegeri
//İki tip fonksiyon vardır.Deger döndüren ve deger döndürmeyen void
// Fonksiyonlar kodun okunabilirliğini artırıyor programı daha düzenli ve modüler hale getiriyor
fun main(){

    val sonuc = toplama(5,7)

    println("Toplama sonucu :$sonuc")



    yazdir("kodlama")

    zamanTarihGoster()
    selamla("Ahmet")
    selamla("Mehmet","Merhaba")//İstege baglı değer belirleme
    val rastgeleFonksiyon: ()-> Int =::rastgeleSayi
    val sayi = rastgeleFonksiyon()
    println("Rastgele sayı:$sayi")
}

fun toplama(sayi1: Int ,sayi2: Int ) :Int
{
    val toplam =sayi1 + sayi2
    return toplam
}

fun yazdir(metin: String) {
    println(metin)
}

fun zamanTarihGoster(){
    val simdikiZaman = Calendar.getInstance().time
    println("Şu anki zaman : $simdikiZaman")
}

fun selamla(isim:String ,zaman:String = "Günaydın"){
    println("$zaman , $isim")
}
fun rastgeleSayi():Int {
    return (1..100).random()
}