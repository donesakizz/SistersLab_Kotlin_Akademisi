package UygulamaSeanslari3

//Bir HashSet'in belirli bir elemanı içerip içermediğini kontrol eden bir fonksiyon yazın.

fun main(){
    val hashSetListe = hashSetOf<Int>(1 ,2, 3, 4,5)
    val sonuc= icindemi(hashSetListe,5)
    println(sonuc)

}

fun icindemi(HashSet : HashSet<Int> ,aranansayi:Int) :Boolean {
    return HashSet.contains(aranansayi)
}