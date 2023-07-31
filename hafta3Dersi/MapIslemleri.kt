package hafta3Dersi
/*
********Map(HashMap)
* Key ve value yapısı ile çalışır
* key ile verilere erişiriz
* Key ve value farklı türlerde olabilir
* Mutable olmazsa map üzerinde değişiklikler yapılamaz
* mapOf sadece üzerinde veri okuma yapabiliriz
* mutableMapOf ve HashMap ikisi aynı özelliklere sahip sadece isimleri farklı.Hem okuma hem de düzenleme yapılabilir
 */

fun main(){
    val sayilar = mapOf<Int,String>(1 to "Bir" ,2 to "İki")

    val oranlar = mutableMapOf(1.5 to "Oran1",3.4 to "Oran2") //Türü vermedik Kotlin tür çıkarımı yapıp kendi veriyor

    val iller = HashMap<Int ,String> ()

    //veri ekleme
    iller.put(16,"Bursa")
    iller.put(34,"İstanbul")

    println(iller.toString())

    //Veri Güncelleme
    iller.put(16,"Ankara")
    println(iller.toString())

    //Veri Okuma
    println(iller.get(34))

    //Mapin boyutu
    println(iller.size)
    println(iller.count())

    println(iller.isEmpty())//Mapin dolu mu boş mu olduğunu kontrol eder

    println(iller.containsKey(16))//Boolean değer döndürür
    println(iller.containsValue("Bursa"))//Boolean değeri döndürür

    // key ve value şeklinde ekrana bastırma
    for((anahtar,deger) in iller){
        println("$anahtar : $deger")
    }

    iller.remove(16)//silme
    println(iller.toString())

    iller.clear() //Hepsini silme işlemi
    println(iller.toString())


}