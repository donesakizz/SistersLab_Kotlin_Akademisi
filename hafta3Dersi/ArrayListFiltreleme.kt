package hafta3Dersi

fun main(){

    val ogr1 = Ogrenci(1,"Ahmet","4A")
    val ogr2 =Ogrenci(2,"Mehmet","5B")
    val ogr3 = Ogrenci(3,"Aslı","6C")
    val ogr4 = Ogrenci(4,"Sıla","8A")

    val ogrenciArrayList = ArrayList<Ogrenci>()
    ogrenciArrayList.add(ogr1)
    ogrenciArrayList.add(ogr2)
    ogrenciArrayList.add(ogr3)
    ogrenciArrayList.add(ogr4)

    val sonucListe = ogrenciArrayList.filter { it.ogrenciNo > 2 }

    for(sonucListeleme in sonucListe){
        println("**********")
        println("Öğrenci No: ${sonucListeleme.ogrenciNo}")
        println("Öğrenci Ad : ${sonucListeleme.ogrenciAd}")
        println("Öğrenci Sınıf: ${sonucListeleme.ogrenciSinif}")
    }

    //filtrelemeye başka bir örnek
    val filtreliListe = ogrenciArrayList.filter { it.ogrenciAd.contains("A") }
    for(sonucListeleme in filtreliListe){
        println("*********Adında A içerenler*************")
        println("Öğrenci No: ${sonucListeleme.ogrenciNo}")
        println("Öğrenci Ad : ${sonucListeleme.ogrenciAd}")
        println("Öğrenci Sınıf: ${sonucListeleme.ogrenciSinif}")
    }

    val filtreliListe1 = ogrenciArrayList.filter { it.ogrenciSinif =="5B" }
        for(sonucListeleme in filtreliListe1){
            println("*********Sınıfı 5B olan*************")
            println("Öğrenci No: ${sonucListeleme.ogrenciNo}")
            println("Öğrenci Ad : ${sonucListeleme.ogrenciAd}")
            println("Öğrenci Sınıf: ${sonucListeleme.ogrenciSinif}")
        }


}