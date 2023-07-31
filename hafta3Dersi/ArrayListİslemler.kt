package hafta3Dersi

fun main(){
    val meyveler = ArrayList<String>()

    meyveler.add("çilek")
    meyveler.add("muz")
    meyveler.add("elma")
    meyveler.add("kivi")
    meyveler.add("karpuz")

    println(meyveler.isEmpty())//Dizinin boş mu dolu mu olduğunu kontrol ediyor dizi boş ise true dolu ise false dönüyor
    println(meyveler.count())//Dizi boyutunu verir
    println(meyveler.first())//Dizinin ilk elemanını getirir
    println(meyveler.last())//Dizinin son elemanını getirir
    println(meyveler.contains("elma"))//Dizinin içinde bu eleman var mı? Kontrolünü yapar
    println(meyveler.contains("portakal"))
    println(meyveler.max())//Harf sırasına göre sıralar ve sondaki elemanı getirir(ç türkçe karakter olduğu son
    println(meyveler.min())//Harf sırasına göre sıralar ve baştaki elemanı getirir

    meyveler.sort()//Liste sıralama
    println(meyveler.toString())

    meyveler.reverse()//Listeyi çevirir
    println(meyveler.toString())

    meyveler.removeAt(3)//Silme işlemi index ile
    println(meyveler.toString())

    meyveler.remove("kivi")//Silme işlemi eleman ile
    println(meyveler.toString())

    meyveler.clear()
    println(meyveler.toString())

}