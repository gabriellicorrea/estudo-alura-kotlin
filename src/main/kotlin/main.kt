fun main() {
    println("hello word")

    val titular = "Gabi"
    val numeroConta = 1000
    var saldo = 0.0
    saldo = 1000.0 + 500
    saldo -= 5000

    println("Titular da conta $titular")
    println("Numero da conta $numeroConta")
    println("Saldo da conta $saldo")

    if(saldo > 0.0) {
        println("Saldo positivo")
    }else if(saldo  == 0.0){
        println("Saldo neutro")
    }else {
        println("Saldo negativo")
    }
}