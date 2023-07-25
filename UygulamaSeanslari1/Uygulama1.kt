package UygulamaSeanslari1
//Kullanıcıdan isim ve yaş bilgisini girmesini isteyen bir programı yazın
fun main() {
    println("Merhaba! İsim ve yaşınızı girin.")

    // Kullanıcıdan isim ve yaş bilgisi alınır
    print("İsim: ")
    val isim = readLine()

    print("Yaş: ")
    val yas = readLine()?.toIntOrNull()

    // Girilen yaş geçerli bir sayı değilse veya null ise hata mesajı verilir.
    if (yas == null) {
        println("Hatalı giriş! Lütfen yaşınızı sayı olarak girin.")
        return
    }

    // Kullanıcıdan alınan bilgiler ekrana yazdırılır.
    println("Adınız: $isim")
    println("Yaşınız: $yas")
}
