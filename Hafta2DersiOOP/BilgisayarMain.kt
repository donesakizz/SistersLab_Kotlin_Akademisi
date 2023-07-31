package com.example.Hafta2DersiOOP

//Nullable - null Safety bir değişkenin null olmasını kontrol altına almak için kullanılır ?,!!
// emin olduğunu belirtir her koşulda bunu çalıştırır
// lateit var referans tiplerinde geçerli yani nesne olmalıdır
fun main(){
    lateinit var mac:Bilgisayar
    //val mac = Bilgisayar("kırmızı",25,true)//Nesne oluşturma
    /*
    println( mac.renk)
    println(mac.hiz)
    println(mac.calisiyorMu)

    mac.renk = "Beyaz"
    mac.hiz = 23
    mac.calisiyorMu = true

    println(mac.renk)
    println(mac.hiz)
    println(mac.calisiyorMu)

     */

    /*
    println(mac.renk)
    println(mac.hiz)
    println(mac.calisiyorMu)

    mac.hiz=30
    mac.renk="beyaz"
    mac.calisiyorMu= true

    println("----Özellikler değiştirildikten sonra")
    println(mac.renk)
    println(mac.hiz)
    println(mac.calisiyorMu)

     */

   /*
    mac.BilgiAl()
    mac.renk= "SİYAH"
    mac.BilgiAl()

    mac.calisiyorMu()
     val intel = Bilgisayar("mavi",30,true)
    intel.BilgiAl()

    */

    /*
    // bu kod bende çalışmadı tekrar bak !!-> uygulamayı çöküyor
    var str1:String? = null
    //str1?.trim()
    str1!!.trim()

     */
}