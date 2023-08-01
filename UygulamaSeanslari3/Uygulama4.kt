package UygulamaSeanslari3

//Bir listedeki elemanları tersine çeviren bir fonksiyon yazın.
fun main() {
    val listem1 = arrayListOf(10, 20, 30, 40)

    println(tersineCevir(listem1))
}

fun tersineCevir(arrayListem : List<Int>) : List<Int> {
    //reversed methodunu kullanabilmek  için parametre olarak List verilmeli arrayList değil
     return arrayListem.reversed()
}