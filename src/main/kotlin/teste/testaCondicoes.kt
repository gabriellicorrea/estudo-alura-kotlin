package teste

fun testaCondicoes(saldo: Double){
    if(saldo > 0.0) {
        println("Saldo positivo")
    }else if(saldo  == 0.0){
        println("Saldo neutro")
    }else {
        println("Saldo negativo")
    }
}
