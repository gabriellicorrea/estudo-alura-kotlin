package Aula01

abstract class Conta(val titular: String, val numero: Int  ){
    var saldo = 0.0
        protected set

    fun deposita(valor: Double){
        if(valor > 0){
            this.saldo += valor
        }
    }

    abstract fun saca(valor: Double)

    fun transfere(valor: Double, destino: Conta): Boolean{
        if(saldo >= valor){
            saldo -= valor
            destino.deposita(valor)
            return true
        }
        return false
    }

//    fun getSaldo(): Double{
//        return saldo
//    }
//
//    fun setSaldo(valor: Double){
//        if(valor > 0){
//            saldo = saldo
//        }
//
//    }
}