package com.example.Hafta2DersiOOP

//PolyMorphism cok biçimlilik anlamına gelir
//Kalıtımla birlikte gelen bir özellik
fun main(){
    val hayvan : Hayvan = Kopek() //Hayvan tipinde ama kopek sınıfının özelliklerini taşıyor
    hayvan.sesCikar()
}