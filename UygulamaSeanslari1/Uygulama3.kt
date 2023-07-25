package UygulamaSeanslari1

//Bir sayının faktöriyelini hesaplayan bir fonksiyonu nasıl oluşturursunuz?
fun main() {
    val sayi = 5
    val faktoriyelSonuc = faktoriyelHesapla(sayi)
    println("$sayi! = $faktoriyelSonuc")
}

fun faktoriyelHesapla(sayi: Int): Long {
    if (sayi == 0 || sayi == 1) {
        return 1
    }

    var faktoriyel: Long = 1
    for (i in 2..sayi) {
        faktoriyel *= i
    }
    return faktoriyel
}
