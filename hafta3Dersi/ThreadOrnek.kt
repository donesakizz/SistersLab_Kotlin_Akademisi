package hafta3Dersi

//Thread yapısı aynı anda birden fazla işlem yapmamıza olanak tanır
//1.yöntem Thread(){} ---Kalıtım yöntemiyle tanımlama
//2.yöntem Runnable{} --- Interface yöntemiyle

fun main(){

    val birinciThread = BirinciThread()
    birinciThread.start()//Thread mantığı için start methodu gerekli

    val ikinciThread = Thread(IkinciThread()) //Interface tanımlamalarda bu şekilde nesne oluşturulur
    ikinciThread.start()

    for(i in 900..999){
        println("Main Thread : $i")
        Thread.sleep(100)//yavaşlatma işlemi
    }

}