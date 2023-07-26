package UygulamaSeanslari2
/*
Bir "MuzikAleti" adlı üst sınıf oluşturun ve
 bu sınıfta müzik aletlerinin ses çıkarma özelliği için "sesCikar" adında bir metot tanımlayın.
 Ardından "Gitar" ve "Piyano" adlı iki alt sınıf oluşturun.
 Her bir alt sınıf, "sesCikar" metotunu kendi türüne uygun şekilde ezerek (override ederek) kendi sesini çıkartsın.
 Bir "MuzikDersi" adlı sınıf oluşturun ve
 bu sınıfta "sesCikar" metodu parametre olarak aldığı müzik aleti nesnesini çağırarak müzik aletinin sesini çıkartsın.
 Polymorphism özelliğini kullanarak bu sınıfları nasıl bir arada kullanabilirsiniz?
 */
// MuzikAleti sınıfı (üst sınıf)
open class MuzikAleti {
    open fun sesCikar() {
        println("Bilinmeyen bir ses çıkıyor.")
    }
}

// Gitar sınıfı (alt sınıf)
class Gitar : MuzikAleti() {
    override fun sesCikar() {
        println("Gitar çalınıyor: do re mi")
    }
}

// Piyano sınıfı (alt sınıf)
class Piyano : MuzikAleti() {
    override fun sesCikar() {
        println("Piyano çalınıyor: fa sol la si")
    }
}

// MuzikDersi sınıfı
class MuzikDersi {
    fun cal(muzikAleti: MuzikAleti) {
        muzikAleti.sesCikar()
    }
}

fun main() {
    // MuzikDersi nesnesi oluşturma
    val muzikDersi = MuzikDersi()

    // Gitar ve Piyano nesneleri oluşturma
    val gitar = Gitar()
    val piyano = Piyano()

    // MuzikDersi sınıfı ile çeşitli müzik aletlerini kullanma
    muzikDersi.cal(gitar)
    muzikDersi.cal(piyano)
}
