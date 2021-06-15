package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.teste.Funcionario

class Analista(
    nome: String,
    cpf: String,
    salario: Double,
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {

    override val bonificacao: Double
        get(){
            return salario * 0.2
        }



}