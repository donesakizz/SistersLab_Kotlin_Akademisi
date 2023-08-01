package UygulamaSeanslari3

fun main() {

    /*
    * Verilen bir listedeki tüm elemanları toplayan bir fonksiyon yazın.
    * */

    val arrayListem = ArrayList<Int>()
    arrayListem.add(15)
    arrayListem.add(30)
    arrayListem.add(50)
    arrayListem.add(12)
    arrayListem.add(23)
    arrayListem.add(18)

    println("ArrayList toplamı: ${arrayListinToplami(arrayListem)}")
}

fun arrayListinToplami(listem1:ArrayList<Int>) : Int{
    var toplam = 0

    for (i in 0 until listem1.size) {
        toplam += listem1[i]
    }
    return toplam
}