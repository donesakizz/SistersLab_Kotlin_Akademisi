package UygulamaSeanslari1

/*Bir "Öğrenci" adlı sınıf oluşturun ve öğrencilerin adı, soyadı ve sınıfı gibi özellikleri içeren özellikleri tanımlayın.
 Ardından, bu sınıftan beş öğrenci nesnesi oluşturun ve
 bu öğrencilerin özelliklerini ekrana yazdıran bir fonksiyon yazın

 */


// Ogrenci sınıfı tanımlaması
class Ogrenci(val ad: String, val soyad: String, val sinif: String) {
    // Öğrenci bilgilerini ekrana yazdıran fonksiyon
    fun bilgileriYazdir() {
        println("Ad: $ad")
        println("Soyad: $soyad")
        println("Sınıf: $sinif")
    }
}

fun main() {
    // Beş öğrenci nesnesi oluşturma
    val ogrenci1 = Ogrenci("Selin", "Aksoy", "10-A")
    val ogrenci2 = Ogrenci("Veli", "Akpınar", "9-B")
    val ogrenci3 = Ogrenci("Mehmet", "Akdemir", "11-C")
    val ogrenci4 = Ogrenci("Zehra", "Akyıldız", "12-D")
    val ogrenci5 = Ogrenci("Hasan", "Akserçe", "10-B")

    // Öğrencilerin bilgilerini ekrana yazdırma
    println("Öğrenci 1:")
    ogrenci1.bilgileriYazdir()

    println("\nÖğrenci 2:")
    ogrenci2.bilgileriYazdir()

    println("\nÖğrenci 3:")
    ogrenci3.bilgileriYazdir()

    println("\nÖğrenci 4:")
    ogrenci4.bilgileriYazdir()

    println("\nÖğrenci 5:")
    ogrenci5.bilgileriYazdir()
}
