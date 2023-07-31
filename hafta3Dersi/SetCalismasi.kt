package hafta3Dersi

/*
*****Set(HashSet)
* ArrayList ile aynı özelliklere sahiptir.Bazı farklılıkları vardır
* 1.farklılık Eklenen veriler düzensiz rastgele yerleşir
* 2.farklılık aynı isimle iki veriyi kaydedemiyoruz
*
* setOf sadece verileri okuyabildiğimiz bir yapı
* mutableSetOf ve HashSet aynı anlama geliyor sadece isimleri farklı
* üzerinde değişiklik yapabildiğimiz ve veri okuyabildiğimiz yapılar
* HashSet
 */

fun main(){
    val meyveler = setOf<String>("çilek" , "muz","elma","kivi")
    val iller = mutableSetOf<String>("Bursa" ,"İstanbul","Ankara" ,"İzmir")
    val sayilar = HashSet<Int>()

    sayilar.add(10)
    sayilar.add(20)
    sayilar.add(30)

    println(sayilar.toString())

    sayilar.add(20)
    println(sayilar.toString()) //aynı isimle iki veri kaydetmez hashSet

    sayilar.add(25)
    println(sayilar.toString())

    //Diğer özellikler
    println(sayilar.elementAt(3))//indeksini yazdığımız elemanı getirir

    println(sayilar.size) //boyutu belirtir
    println(sayilar.count())//boyutu belirtir

    println(sayilar.isEmpty())//listenin boş mu dolu mu olduğu kontrol edilir

    println(sayilar.contains(19))//Listenin içinde bu eleman var mı yok mu kontrolü Boolean değer döndürür

    for(s in sayilar){
        println(s)
    }

    //indeksleriyle listeyi yazdırmak için kullandığımız for döngüsü
    for((i,s) in sayilar.withIndex()){
        println("$i  -> $s")
    }

    sayilar.remove(10)//silmek istediğimiz değeri giriyoruz
    println(sayilar.toString())

    sayilar.clear() //Listenin tüm verilerini siler
    println(sayilar.toString())


}