package hafta1Dersi

// tek satır yorum kodları için kullanılır

/*
Birden fazla satırlı yorumlar
*/

//print kendinden sonra gelen texti yanına yazdırır
//println kendinden sonra gelen texti yanına yazdırır

//var(variable =değişkem)
// val (value =sabit)

//Büyük harfle başlamaz
//Rakamla başlamaz
//Özel karakter içermez
//Türkçe karakter içermemelidir
/*
\t - tab boşluk bırakmak için kullanılır
\n - bir alt satıra inmek için kullanılır
\" -çift tırnak
\' - tek tırnak
 */
fun main(){

    println("\"Merhaba dünya\"")
    println("\'Hello world")
    println("ilk ders")


    var sayiDeğiskeni=5
    var sayidegişkeni=5
    var sayi1=20
    //var 1sayi =6

    println("Merhaba bu \"android\" \n \t eğitiminde \\ dilini öğreneceğiz")



    //var yada val değişkenimizin adı :tür = atadığımız değer
    //Int tam sayı ,Long sonunda L ve büyük sayı, String tırnak içinde ,
    //char karakter atamalarında '',float virgüllü değerler için kullanılır,double ondalıklı sayılar için kullanılır
    val sayi : Long =430000000000000000L
    val text ="fatma"
    val text1:Char ='F'
    val sayi2 =43.2f

    var kisiAdi:String ="Döne"
    var kisiYas:Int=26
    var kisiBoy:Float=1.62f
    var kisiBasHarf:Char ='D'

    //println(kisiAdi)


    var a:Int =24
    var b:Int =35

    println(" $a * $b =${a*b} tür")

    var x =60
    var y =33
    var cikarma =x-y
    println("$x - $y nin sonucu $cikarma")


    var integer =38
    integer =29.7.toInt()

    val pi =3.14
    var yariCap = 2.0
    var alan =pi*yariCap * yariCap

    println("Dairenin alanı $alan ")

    //a = a+3 kısaltması a+= 3
    //a = a-3 kısaltması a-= 3
    //a = a*3 kısaltması a*= 3
    //a = a/3 kısaltması a/= 3
    var c =10
    c+= 20  // + dan sonra bosluk olmamalı yoksa toplma yapacağını sanar = gelince hata verir
    println(c)

    //Tür Dönüşümü

    var i:Int = 42
    var d:Double =42.45
    var z:Float = 42.89f

    var sonuc1:Int = d.toInt()
    var sonuc2:Double =i.toDouble()
    var sonuc3:Int = z.toInt()
    println(sonuc1)
    println(sonuc2)
    println(sonuc3)

    //Sayısaldan metne dönüşüm
    var str1 =i.toString()
    var str2 =d.toString()
    var str3 = z.toString()

    println(str1) //Stringe çevrilmiş olsa bile konsolda sayı olarak verdi ama stringe cevrilmiştir

    var metin ="45"
    println(metin)

    //Metin Sayısal
    var yazi1 ="34"

    /*
    //aşağıdaki kodda oluşacak hatayı try-catch içine alıyoruz
    var x = yazi1.toInt()
    println(x)

    */

    try {
        var x = yazi1.toInt()
        println(x)

    }catch (e:Exception){
        println("Dönüşümde hata var")
    }


}