package hafta1Dersi

class DegiskenKapsami {
    var x = 50 //Global değerler
    var y =5

    fun topla(){
        var x =40 //Local her zaman globalden baskındır
        var z =x +y //Local değerler
        println(z)
    }
    fun bolme(){
        var bol =x/y
        println(bol)
    }
}