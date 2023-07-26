package hafta2Dersi

import java.util.*

fun main(){
    sayiDegerlendir(23)
     val scanner = Scanner(System.`in`)
     println("Lütfen bir sayi girin")
     val deger = scanner.nextInt()
     sayiDegerlendir(deger)



    val scanner1 = Scanner(System.`in`)
    println("Lütfen bir karakter giriniz")
    val karakter = scanner1.next().first()
    karakterDegerlendir(karakter)
    scanner1.close()//hafızada sıkıntıyı önler hafızada yer kaplamaz
}
fun sayiDegerlendir(deger:Int){
    when(deger){
        1 -> println("Sayi 1'e eşittir")
        2,3 -> println("Sayi 2 veya 3'e eşittir")
        in 4 .. 10 -> println("Sayı 4 ile 10 arasında")
        else -> println("Sayı hiçbir koşulu sağlamıyor")
    }
}

fun karakterDegerlendir(karakter:Char){
    when(karakter){
        'A','E','I','O','U' -> println("Vokal Harf")
        in 'a' ..'z' -> println("Küçük harf")
        in '0' ..'9' -> println("Sayi")
        else -> println("özel karakter veya büyükharf")

    }
}
