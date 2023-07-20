package Odev1

import java.util.*

/*Dışarıdan kullanıcı adı ve şifre girişi alınacak .
 Girilen bu kullanıcı ve şifre önceden belirlenen kullanıcı adı ve şifreyle eşleştirilecek.
 Kullanıcı adında büyük-küçük harf farkı göz ardı edilecek ,ancak şifrede büyük-küçük harf farkı olması gerekmektedir
 Kullanıcı adı ve şifre daha önce belirlenen kullanıcı adı ve şifreyle uyuşuyorsa hoş geldiniz diyecek
 eşleşmiyorsa kullanıcı adı ve şifre hatalı uyarı verecek programın kodunu yazın
 */

fun main() {


    println("Kullanıcı adınızı Yazın")
    var kullaniciAd = Scanner(System.`in`)
    var kAd= kullaniciAd.nextLine()

    //println("$kAd")

    if (kAd.equals("Deniz",ignoreCase = true)){
        println("$kAd hoşgeldiniz")
    }else{
        println("Hatalı Giriş")
    }



    println("Şifrenizi Yazın")
    var sifre =Scanner(System.`in`)
    var sifreAl=sifre.nextLine()

    //println("$sifreAl")

    if (sifreAl.equals("Deniz123456" ,ignoreCase = false)){
        println("Hos Geldiniz ")
    }else{
        println("Hatalı Giriş")
    }


}