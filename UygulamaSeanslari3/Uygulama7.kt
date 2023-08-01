package UygulamaSeanslari3

//Bir HashSet içerisindeki elemanları başka bir HashSet'e ekleyen bir fonksiyon yazın

fun main(){
    val hashSet1 = hashSetOf<Int>(1,2,3,4)

    println(kopyala(hashSet1))



}

fun kopyala(hashSet1: HashSet<Int>) : HashSet<Int> {
    val hashSet2 = HashSet <Int>()
    hashSet2.addAll(hashSet1)
    return hashSet2
}