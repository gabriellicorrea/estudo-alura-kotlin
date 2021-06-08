fun main() {
    println("hello word")



    testaCopiaEReferencia()
    //teste()
    //testaCondicoes(saldo)
}

fun testaCopiaEReferencia(){
    val contaGabi = Conta()
    contaGabi.titular = "Gabi"
    contaGabi.numero = 1234
    contaGabi.setSaldo(-100.0)
    println("Titular da conta: " + contaGabi.titular)
    println("Numero da conta: " + contaGabi.numero)
    println("Saldo: " + contaGabi.getSaldo())

    println("------------------------------------------------")

    val contaKaue = Conta()
    contaKaue.titular = "Kaue"
    contaKaue.numero = 4321
    contaKaue.setSaldo(140.0)
    println("Titular da conta: " + contaKaue.titular)
    println("Numero da conta: " + contaKaue.numero)
    println("Saldo: " + contaKaue.getSaldo())

//    println("Deposito realizado na conta do Kaue")
//    contaKaue.deposita(460.0)
//    println("saldo atual " + contaKaue.saldo)
//
//
//    println("Deposito realizado na conta do Gabi")
//    contaGabi.deposita(2000.0)
//    println("saldo atual " + contaGabi.saldo)
//
//    println("Saque realizado na conta do Kaue")
//    contaKaue.saca(260.0)
//    println("saldo atual " + contaKaue.saldo)
//
//    println("Saque realizado na conta da Gabi")
//    contaGabi.saca(2000.0)
//    println("saldo atual " + contaGabi.saldo)
//
//    if(contaKaue.transfere(50.0, contaGabi)){
//        println("Transferencia realizada com sucesso!")
//    }else
//        println("Transferencia não realizada com sucesso!")
//
//    println("saldo conta kaue "+ contaKaue.saldo)
//
//    println("saldo conta Gabi "+ contaGabi.saldo)
}



class Conta{
    var titular = ""
    var numero = 0
    private var saldo = 0.0

    fun deposita(valor: Double){
        this.saldo += valor
    }

    fun saca(valor: Double){
        if(saldo >= valor){
            saldo -= valor
        }
    }

    fun transfere(valor: Double, destino: Conta): Boolean{
        if(saldo >= valor){
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

    fun getSaldo(): Double{
        return saldo
    }

    fun setSaldo(valor: Double){
        if(valor > 0){
            saldo = saldo
        }

    }
}

fun teste(){
    for(i in 1..5) {
        val titular = "Gabi $i"
        val numeroConta = 1000 + i
        var saldo = i + 10.0


        println("Titular da conta $titular")
        println("Numero da conta $numeroConta")
        println("Saldo da conta $saldo")
        println("------------------------------")

        when {
            saldo > 0.0 -> println("Saldo positivaço")

            saldo == 0.0 -> println("Saldo neutro")

            else -> println("Saldo negativo")
        }

    }
}
fun testaCondicoes(saldo: Double){
    if(saldo > 0.0) {
        println("Saldo positivo")
    }else if(saldo  == 0.0){
        println("Saldo neutro")
    }else {
        println("Saldo negativo")
    }
}