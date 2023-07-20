package Odev2

import java.util.Scanner

/*
Kullanıcıdan yaşını girmesini isteyecek
Girilen yaşa göre,18 veya daha büyükse "Oy kullanabilirsiniz!" mesajını
küçükse "Oy kullanamazsınız mesajını ekrana yazdırır.
Eğer geçerli bir sayı girilmezse ,"Geçerli bir yaş girmediniz" mesajını ekrana yazdıracak
ve sayı dışında text girdiğinde uygulama hata vermesin sayı giriniz uyarısını try-catch blogu ile verecek programın kodları
 */

fun main(){
    println("Yaşınızı Giriniz")

    var yas=Scanner(System.`in`)


    try {
        var yasiAl =yas.nextInt()
        if (yasiAl>=18){
            println("Oy kullanabilirsiniz")
        }else {
            println("Oy kullanamazsın")
        }
    }catch (e:Exception){
        println("Yaşınızı sayı olarak girin")
    }
}