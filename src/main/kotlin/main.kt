fun main() {
    println("Olá, funcionarios.")

    val contaCorrente = ContaCorrente(
        titular = "Gabi,",
        numero = 1000
    )

    val contaPoupanca = ContaPoupanca(
        titular = "Kaue,",
        numero = 1000
    )

    contaCorrente.deposita(1000.0)
    contaPoupanca.deposita(1000.0)
    println("Saldo conta corrente: ${contaCorrente.saldo}")
    println("Saldo conta poupanca: ${contaPoupanca.saldo}")


    contaCorrente.saca(100.0)
    contaPoupanca.saca(100.0)

    println("Saldo apos saque corrente: ${contaCorrente.saldo}")
    println("Saldo apos saque poupanca: ${contaPoupanca.saldo}")

    contaCorrente.transfere(100.0, contaPoupanca )
    println("Saldo corrente apos transferir  ${contaCorrente.saldo}" )
    println("Saldo poupanca   ${contaPoupanca.saldo}" )
}
