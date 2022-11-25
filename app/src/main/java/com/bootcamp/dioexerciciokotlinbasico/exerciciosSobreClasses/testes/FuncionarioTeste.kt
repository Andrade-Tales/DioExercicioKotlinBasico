package com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses.testes

import com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses.Funcionario
import com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses.Pessoa
import java.math.BigDecimal

fun main() {
    val jether = Pessoa("Jether", "123456789")
    println(jether.nome)
    println(jether.cpf)

    val glasgow = Funcionario("Jether Rodrigues", "123456789", BigDecimal.valueOf(2000.0))
    println(glasgow.nome)
    println(glasgow.cpf)
    println(glasgow.salario)
}