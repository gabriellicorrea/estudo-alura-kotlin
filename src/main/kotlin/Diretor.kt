class Diretor (
     nome: String,
     cpf: String,
     salario: Double,
     val senha: Int,
     val plr: Double

) : Funcionario(nome = nome, cpf = cpf, salario = salario){

    override val bonificacao: Double
        get() {
            return salario * 0.3
        }

    fun autentica(senha: Int){
       // if(this.senha == senha)
    }


}