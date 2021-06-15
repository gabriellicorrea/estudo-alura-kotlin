package br.com.alura.bytebank.teste

fun testeSaldo(){
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