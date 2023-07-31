package hafta3Dersi

fun main(){
    //Başka değer atamayacağımız için val olarak tanımlıyoruz
    val u1 =Urun(1,"Saat",150.0)
    val u2 =Urun(2,"TV",175.0)
    val u3 =Urun(3,"Bilgisayar",960.0)

    //Listenin tipi bir nesnedir
    val urunler = ArrayList<Urun>()

    //listeye eleman ekledik
    urunler.add(u1)
    urunler.add(u2)
    urunler.add(u3)

    //listeyi ekrana bastırma işlemi for ile
    for(urun in urunler){
        println("**********")
        println("Ürün no : ${urun.urunNo}")
        println("Ürün no : ${urun.urunAd}")
        println("Ürün no : ${urun.urunFiyat}")

    }
}