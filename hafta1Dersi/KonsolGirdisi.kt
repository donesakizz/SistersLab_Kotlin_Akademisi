package hafta1Dersi

import java.util.Scanner

fun main(){

    println("Adınızı Giriniz")

    val girdiAd = Scanner(System.`in`)

    val ad = girdiAd.next()
    println("Merhaba $ad")



    println("Yaşınızı Giriniz")
    var girdiYas = Scanner(System.`in`)

    var sayi = girdiYas.nextInt()
    println("Yaşınız $sayi")
}