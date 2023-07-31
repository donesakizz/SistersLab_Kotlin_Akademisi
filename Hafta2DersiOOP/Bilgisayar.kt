package com.example.Hafta2DersiOOP

class Bilgisayar(var renk:String, var hiz:Int ,var calisiyorMu :Boolean) {//taslak oluşturma
    /*
    var renk:String = "Gri"
    var hiz : Int=10
    var calisiyorMu :Boolean = true

     */
    fun BilgiAl(){
        println("Renk : $renk")
        println("Hız : $hiz")
        println("calisiyor mu : $calisiyorMu")

    }

    fun calisiyorMu(){
        calisiyorMu =true
        println(" Calişiyor mu değerin : $calisiyorMu")
    }
}