package UygulamaSeanslari1
//Kullanıcının girdiği bir sayıyı ondalıklı sayıya dönüştüren bir programı nasıl yazarsınız?
fun main() {
    println("Ondalıklı sayıya dönüştürmek istediğiniz tam sayıyı girin:")
    val girilenSayi = readLine()

    // Kullanıcının girdiği sayıyı Double tipine dönüştürme işlemi
    val ondalikliSayi = girilenSayi?.toDoubleOrNull()

    if (ondalikliSayi != null) {
        println("Ondalıklı Sayı: $ondalikliSayi")
    } else {
        println("Hatalı giriş! Lütfen geçerli bir tam sayı girin.")
    }
}

