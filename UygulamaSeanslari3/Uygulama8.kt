package UygulamaSeanslari3

//Verilen bir listeyi SetOf olarak döndüren bir fonksiyon yazın (tekrar eden elemanları çıkarın).

fun main(){
    val listem1 = listOf(1,2,3,4,5)
    println(setOfaCevir(listem1))

}

fun setOfaCevir(liste: List<Int>) : Set<Int> {
    return liste.toSet()
}
