package hafta2Dersi

fun main() {
    val liste = ArrayList<String>() //ArrayListleri tanımlamanın 1.yöntemi
    val liste2 : ArrayList<Int> = ArrayList<Int>() //ArrayList tanımlama 2.yöntem

    val meyveler = ArrayList<String>()
    meyveler.add("Çilek") //0
    meyveler.add("Kivi") //1
    meyveler.add("Kiraz")//2
    meyveler.add("Armut")//3
    println(meyveler.toString())

    // veriye erişme biçimi 1.yöntem
    val str = meyveler.get(2)
    println(str)

    //veriye erişme biçimi 2.yöntem
    val str1 = meyveler[3]
    println(str1)

    meyveler[2] ="Ananas"
    println(meyveler.toString())

    meyveler.add("Karpuz")//sona ekler
    meyveler.add(3,"Kavun")//belirtidiğimiz indekse ekler kaydırma yapar
    println(meyveler.toString())
}