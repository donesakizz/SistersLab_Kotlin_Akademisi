package UygulamaSeanslari2
/*
Bir "Hayvan" adlı üst sınıf oluşturun ve bu sınıfta hayvanların ses çıkarma özelliği için "sesCikar" adında bir metot tanımlayın.
 Ardından "Kedi" ve "Kopek" adlı iki alt sınıf oluşturun.
  Her bir alt sınıf, "sesCikar" metotunu kendi türüne uygun şekilde ezerek (override ederek) kendi sesini çıkartsın.
   Sonrasında bir "HayvanBarinagi" adlı sınıf oluşturun ve
 bu sınıfta "sesCikar" metodu parametre olarak aldığı hayvan nesnesini çağırarak hayvanın sesini çıkartsın.
  Polymorphism özelliğini kullanarak bu sınıfları nasıl bir arada kullanabilirsiniz?

 */
// Hayvan sınıfı (üst sınıf)
open class Hayvan {
    open fun sesCikar() {
        println("Bilinmeyen bir ses çıkıyor.")
    }
}

// Kedi sınıfı (alt sınıf)
class Kedi : Hayvan() {
    override fun sesCikar() {
        println("Miyav miyav")
    }
}

// Köpek sınıfı (alt sınıf)
class Kopek : Hayvan() {
    override fun sesCikar() {
        println("Hav hav")
    }
}

// HayvanBarinagi sınıfı
class HayvanBarinagi {
    fun sesCikar(hayvan: Hayvan) {
        hayvan.sesCikar()
    }
}

fun main() {
    // HayvanBarinagi nesnesi oluşturma
    val barinak = HayvanBarinagi()

    // Kedi ve Köpek nesneleri oluşturma
    val kedi = Kedi()
    val kopek = Kopek()

    // HayvanBarinagi sınıfı ile çeşitli hayvanları kullanma
    barinak.sesCikar(kedi)
    barinak.sesCikar(kopek)
}
