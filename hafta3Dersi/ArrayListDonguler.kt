package hafta3Dersi

fun main(){
    val meyveler = ArrayList<String>()

    meyveler.add("çilek")
    meyveler.add("muz")
    meyveler.add("elma")
    meyveler.add("kivi")
    meyveler.add("karpuz")

    //for ile liste kullanımı
    for (meyve in meyveler){
        println("sonuç: $meyve")
    }
    for((indeks , meyve) in meyveler.withIndex()){
        println(" $indeks .indeks  $meyve")
    }
}