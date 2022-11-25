package com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses

import java.math.BigDecimal

// CLASSE FUNCIONARIO HERDANDO PRORPIEDADES DA CLASSE PESSOA
// OVERRIDE: SOBRESCRITA SEJA DE MÉTODO OU ATRIBUTO
abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: Double
) : Pessoa(nome, cpf) {

    protected abstract fun calculoAuxilio(): Double

    override fun toString(): String = """
    Nome: $nome
    Cpf: $cpf
    Salario: $salario
    Auxilio: ${calculoAuxilio()}
    """.trimIndent()
}
