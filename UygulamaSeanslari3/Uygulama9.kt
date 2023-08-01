package UygulamaSeanslari3

//Bir SetOf'taki elemanları diğer bir SetOf'tan çıkaran bir fonksiyon yazın

fun main(){
    // val set1 = setOf(1,2,3,4,5)
    // val set2 = setOf(1,2,3)

    val setListe1 = setOf<Int> (1,2,3,4,5)
    val setliste2 = setOf<Int>(1,2,3)
    val sonuc=setOfdanCikar(setListe1 , setliste2)
    println(sonuc)


}

fun setOfdanCikar( set1 : Set<Int> ,set2 :Set<Int>) : Set<Int> {
    return  set1.minus(set2)
}