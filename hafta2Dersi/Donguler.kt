package hafta2Dersi

import java.util.Scanner

//Döngüler belirli bir işlemi bir veya daha fazla tekrarlanmasını istediğimiz durumlar için kullanılır
//Döngü çeşitleri ........For , While
//While verilen bir koşul doğru olduğu sürece çalışır
//For belirli bir aralıktaki
//Dizilerde listlerde for sıklıkla kullanılır
fun main(){

    var i =1
    while (i<=5){
        println("Sayı: $i")
        i++
    }




    val scanner = Scanner(System.`in`)
    println("Carpım tablosunu görmek istediğiniz sayıyı giriniz")
    val sayi = scanner.nextInt()

    var k = 1
    while (k <= 10){
        val carpim = sayi*k
        println("$sayi x $k =$carpim")
        k++
    }
    scanner.close()


    //For için örnek

    val baslangic = 1
    val bitis =10

    for (i in baslangic .. bitis){
        println("Sayi: $i")

    }


    //aşagıdaki kod değerlerde çakışma olmaması için yorum satırına alındı .
   // Aşagıdaki kod ayrı bir fileda veya üst kodlar/* */ satırına alınarak çalıştırılıabilinir

    /*
    val scanner = Scanner(System.`in`)
    println("Faktöriyelini hesaplamak istediğimiz sayıyı girin")
    val girilensayi=scanner.nextInt()

    var faktoriyel =1
    var hesaplama =""
    for(m in 1..girilensayi){
        faktoriyel*= m

        hesaplama +=if (m==1) "$m" else "x $m"
    }
    println("$girilensayi! = $hesaplama =$faktoriyel")
    scanner.close()

     */
}