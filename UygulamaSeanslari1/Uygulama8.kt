package UygulamaSeanslari1

/*Meyve" adlı bir üst sınıf oluşturun ve bu sınıfta meyvelerin adı ve tatlılık derecesi gibi özellikleri tanımlayın.
 Ardından "Elma" adlı bir alt sınıf oluşturun ve bu sınıfta elmalara özgü özellikleri ekleyin.
 "Elma" sınıfı "Meyve" sınıfından kalıtım almalıdır.
 Elma sınıfında "vitaminDegeri" adlı bir özelliği ve "yiyebilir" adlı bir metodu ekleyin.

 */

// Meyve sınıfı (üst sınıf)
open class Meyve(val ad: String, val tatliLikDerecesi: Int) {
    // Üst sınıfta herhangi bir metot olmasa da, alt sınıflar bunları kullanabilir.
}

// Elma sınıfı (alt sınıf)
class Elma(ad: String, tatliLikDerecesi: Int, val vitaminDegeri: String) : Meyve(ad, tatliLikDerecesi) {
    // Alt sınıfın özgü metodu
    fun yiyebilir() {
        println("$ad meyvesi yenebilir.")
    }
}

fun main() {
    // Elma nesnesi oluşturma
    val elma = Elma("Elma", 7, "C vitamini")

    // Elma nesnesinin özelliklerini ekrana yazdırma
    println("Meyve Adı: ${elma.ad}")
    println("Tatlılık Derecesi: ${elma.tatliLikDerecesi}")
    println("Vitamin Değeri: ${elma.vitaminDegeri}")

    // Elma nesnesinin metodu çağırma
    elma.yiyebilir()
}
