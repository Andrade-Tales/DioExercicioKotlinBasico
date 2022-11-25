package com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses

import java.math.BigDecimal

// CLASSE FUNCIONARIO HERDANDO PRORPIEDADES DA CLASSE PESSOA
// OVERRIDE: SOBRESCRITA SEJA DE MÉTODO OU ATRIBUTO
abstract class Funcionario(
    nome: String,
    cpf: String,
    val salario: BigDecimal
) : Pessoa(nome, cpf) {

    abstract fun calculoAuxilio(): 
}
