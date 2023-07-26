package hafta2Dersi

//Aynı veri tipine sahip birden çok elemanı tutmak için kullanılır
//Aynı tipte elemanlar tutulur(Örn.Int deger tutacaksak tüm elemanlarımız int olmalı
//val diziAdi:Array<Tip> =arrayOf(eleman1 ,eleman2, eleman3..)  eleman1 in indeksi 0 ,eleman2 nin indeksi 1 dir
fun main(){

    val isimler: Array<String> = arrayOf("Ali", "Veli", "Mehmet","Ayse")
    println("isimler: ${isimler.joinToString() }") //ekrana yazdırmak için 1.yöntem




    print("İsimler:")
    for(i in isimler.indices){ //ekrana yazdırmak için 2.yöntem
        print(isimler[i])
        if (i<isimler.size-1){
            print(",")
        }
    }




    val notlar1:Array<Double> = arrayOf(85.5 ,98.0 ,78.5, 95.3)
    val notlar:DoubleArray =doubleArrayOf(85.5 ,98.0 ,78.5, 95.3)
    println("Notlar:${notlar.joinToString() }")




    val yaslar: IntArray = intArrayOf(25,16,23,21)
    println("Yaşlar: ${yaslar.joinToString() }")




    val sayilar: Array<Int> = arrayOf(1,2,3,4,5)
    for (sayi in sayilar){
        println(sayi)
    }




    val numaralar: Array<Int> = arrayOf(10,23,45,67)

    for(index in numaralar.indices){
        val deger = numaralar[index] //index unresolved reference olur in den önce yazmazsan
        println("$index . Indexteki deger: $deger")
    }




    val toplamaIslemi: Array<Int> = arrayOf(1,5,6,8,16)
    var toplam = 0
    for(sayi in toplamaIslemi){
        toplam += sayi
    }
    println("Dizi elemanlarının toplamı :$toplam")




    val numaralar1: Array<Int> = arrayOf(10,20,36,24,88,44)

    var enBuyuk = numaralar1[0]
    var enKucuk = numaralar1[0]

    for (sayi in numaralar1){
        if (sayi >enBuyuk){
            enBuyuk = sayi
        }
        if(sayi < enKucuk){
            enKucuk = sayi
        }
    }
    println("En büyük değer: $enBuyuk")
    println("En küçük değer: $enKucuk")




    //Dizimizdeki elemanları küçükten büyüğe sıralar
    val sayilar1: Array<Int> = arrayOf(46,90,12,45,78,5,2)
    sayilar1.sort()
    println(" Sıralı dizi: ${sayilar1.joinToString()}")



    //Dizimizdeki elemanları büyükten küçüğe sıralar
    val sayilar2: Array<Int> = arrayOf(46,90,12,45,78,5,2)
    sayilar2.sortDescending()
    println(" Sıralı dizi: ${sayilar2.joinToString()}")
}