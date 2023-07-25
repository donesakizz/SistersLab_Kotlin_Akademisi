package UygulamaSeanslari1

//Kullanıcının girdiği iki sayının toplamını, farkını, çarpımını ve bölümünü hesaplayan bir fonksiyonu nasıl yazarsınız?
fun main(){
    println("İki sayıyı girin:")
    print("Sayı 1: ")
    val sayi1 = readLine()?.toDoubleOrNull() ?: return

    print("Sayı 2: ")
    val sayi2 = readLine()?.toDoubleOrNull() ?: return


    val toplam = toplamHesapla(sayi1, sayi2)
    val fark = farkHesapla(sayi1, sayi2)
    val carpim = carpimHesapla(sayi1, sayi2)
    val bolum = bolumHesapla(sayi1, sayi2)

    println("Toplam: $toplam")
    println("Fark: $fark")
    println("Çarpım: $carpim")
    println("Bölüm: $bolum")
}

fun toplamHesapla(sayi1: Double, sayi2: Double): Double {
    return sayi1 + sayi2
}

fun farkHesapla(sayi1: Double, sayi2: Double): Double {
    return sayi1 - sayi2
}

fun carpimHesapla(sayi1: Double, sayi2: Double): Double {
    return sayi1 * sayi2
}

fun bolumHesapla(sayi1: Double, sayi2: Double): Double {
    if (sayi2 == 0.0) {
        println("Hata: Bölen sıfır olamaz!")
        return Double.NaN
    }
    return sayi1 / sayi2
}