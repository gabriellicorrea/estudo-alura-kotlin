package br.com.alura.bytebank.modelo

import br.com.alura.bytebank.teste.Funcionario

abstract class FuncionarioAdmin(
      nome: String,
     cpf: String,
     salario: Double,
    protected val senha: Int

) : Funcionario(
    nome  = nome,
    cpf = cpf,
    salario = salario
){
    open fun autentica(senha: Int): Boolean{
        println("Autentica func adm")
        if(this.senha == senha){
            return true
        }
        return false
    }
}