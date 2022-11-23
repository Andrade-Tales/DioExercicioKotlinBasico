package com.bootcamp.dioexerciciokotlinbasico.exerciciosMatematicos

import java.util.*

class ConsumoMedioAutomovel {

    // Consumo Médio do Automóvel

/*
Você deve calcular o consumo médio de um automóvel onde será informada a
distância total percorrida (em Km) e o total de combustível consumido (em
litros).
- Entrada
Você receberá dois valores: um valor inteiro X com a distância total percorrida
(em Km), e um valor real Y que representa o total de combustível consumido,
com um dígito após o ponto decimal.
- Saída
Exiba o valor que representa o consumo médio do automóvel (3 casas após a
vírgula), incluindo no final a mensagem "km/l".
*/

}

fun main(args: Array<String>) {

    val leitor = Scanner(System.`in`)

    println("Entre com a distância total percorrida em km: ")
    val x: Int = leitor.nextInt()

    println("Entre com o total de combustível consimido: ")
    val y = leitor.nextFloat()

    println("A média de consumo é: ")
    val media = x.div(y)

    println(String.format("%.3f km/l", media))
}