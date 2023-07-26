package hafta1Dersi

import java.util.Scanner

//equals() bir nesnenin başka bir nesneyle eşit olup olmadığını kontrol eder
//ignoreCase girilen parametreyle yapılan karşılaştırmada küçük büyük harf farkını gözardı etmek içindir
fun main(){

    var sayi =-10
    if (sayi > 0){
        println("Sayı pozitiftir")
    }else if (sayi == 0){
        println("Sayi sıfırdır")
    }
    else{
        println("Sayı negatiftir")
    }



    val scanner = Scanner(System.`in`)

    println("Bir meyve adı giriniz")
    val meyve = scanner.nextLine()

    if (meyve.equals("elma", ignoreCase = true)){
        println("Evet , girdiğiniz kelime elmadır")
    }else{
        println("Girdiğiniz kelime elmadan farklı bir kelimedir")
    }

}