package hafta3Dersi

class BirinciThread: Thread() {

    //run metodu bize thread özelliğini sağlamış olacak
    override fun run() {

        for (i in 100..199){
            println("Birinci Thread : $i")
            Thread.sleep(100)
        }
    }
}