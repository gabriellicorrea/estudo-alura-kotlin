package br.com.alura.bytebank.teste

abstract class Funcionario(
    val nome: String,
    val cpf: String,
    var salario: Double,

){
    abstract val bonificacao: Double



}