fun main() {


    val gabi = Funcionario(
        nome = "Gabrielli",
        cpf = "123.567.890.00",
        salario = 1000.0,

    )

    println("nome ${gabi.nome} " )
    println( "cpf  ${gabi.cpf}")
    println( "salario  ${gabi.salario}")
    println( "bonificacao  ${gabi.bonificacao()}")
    println("****************************************")

    val kaue = Gerente(
        nome = "Kaue",
        cpf = "009.876.543.21",
        salario = 2500.0,
        senha = 1234
    )

    println("nome ${kaue.nome} " )
    println( "cpf  ${kaue.cpf}")
    println( "salario  ${kaue.salario}")
    println( "bonificacao  ${kaue.bonificacao()}")



    val bia = Diretor(
        nome = "bia",
        cpf = "009.876.654.12",
        salario = 3000.0,
        senha = 1234,
        plr = 20.0
    )

    println("nome ${bia.nome} " )
    println( "cpf  ${bia.cpf}")
    println( "salario  ${bia.salario}")
    println( "bonificacao  ${bia.bonificacao()}")

    println("****************************************")

    val maya = Analista(
        nome = "maya",
        cpf = "444.444.444-44",
        salario = 3000.0
    )

    println("nome ${maya.nome} " )
    println( "cpf  ${maya.cpf}")
    println( "salario  ${maya.salario}")
    println( "bonificacao  ${maya.bonificacao()}")

    println("****************************************")

    val calculadora = CalculadoraBonificacao()
    calculadora.registra(gabi)
    calculadora.registra(kaue)
    calculadora.registra(bia)
    calculadora.registra(maya)





    println("total de bonificação: ${calculadora.total}")

}
