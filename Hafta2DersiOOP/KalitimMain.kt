package com.example.Hafta2DersiOOP

//Kalıtım bir sınıfın özelliklerini başka bir sınıfa aktarabilir
//Kalıtım sınıflar arası geçerli
//Eğer ben bir özelliğimi başka sınıfa aktaracaksam classın başına open getirilmelidir
//Özelliği hangi sınıftan alıyorsak o bizim için superclasstır
//Diğer altsınıflar subclass şeklinde tanımlanır
//Kalıtım ile birlikte gelen kavramımız Overrindg
fun main() {
    var topkapiSarayi = Saray(10,5)
    var bogazVilla = Villa(4,true)

    println(topkapiSarayi.pencereSayisi)
    println(topkapiSarayi.kuleSayisi)

    println(bogazVilla.pencereSayisi)
    println(bogazVilla.garajVarMi)
}