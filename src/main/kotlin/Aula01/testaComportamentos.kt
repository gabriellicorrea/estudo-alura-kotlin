package Aula01

import ContaCorrente
import ContaPoupanca

fun testaComportamentos() {
    val contaGabi = ContaCorrente("Gabi", 1234)
    contaGabi.deposita(100.0)
    println("Titular da conta: " + contaGabi.titular)
    println("Numero da conta: " + contaGabi.numero)
    println("Saldo: " + contaGabi.saldo)

    println("------------------------------------------------")

    val contaKaue = ContaPoupanca("Kaue", 4321)

    contaKaue.deposita(200.0)
    println("Titular da conta: " + contaKaue.titular)
    println("Numero da conta: " + contaKaue.numero)
    println("Saldo: " + contaKaue.saldo)

    println("Deposito realizado na conta do Kaue")
    contaKaue.deposita(460.0)
    println("saldo atual " + contaKaue.saldo)


    println("Deposito realizado na conta do Gabi")
    contaGabi.deposita(2000.0)
    println("saldo atual " + contaGabi.saldo)

    println("Saque realizado na conta do Kaue")
    contaKaue.saca(260.0)
    println("saldo atual " + contaKaue.saldo)

    println("Saque realizado na conta da Gabi")
    contaGabi.saca(2000.0)
    println("saldo atual " + contaGabi.saldo)

    if (contaKaue.transfere(50.0, contaGabi)) {
        println("Transferencia realizada com sucesso!")
    } else
        println("Transferencia não realizada com sucesso!")
    println("saldo conta kaue " + contaKaue.saldo)

    println("saldo conta Gabi " + contaGabi.saldo)
}