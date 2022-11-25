package com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses

import java.math.BigDecimal

// CONTRUTOR PRIMÁRIO
class Conta(

    // PROPRIEDADE DA CLASSE CONTA
    val agencia: String,
    val numero: String,
    val saldo: BigDecimal
) {
    // FUNÇÃO DA CLASSE CONTA
    fun deposito(valor: BigDecimal) {

    }

    fun saque(valor: BigDecimal) {
        
    }
}

