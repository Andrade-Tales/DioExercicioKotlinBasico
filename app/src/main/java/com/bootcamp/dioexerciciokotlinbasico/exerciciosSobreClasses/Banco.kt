package com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses

// DATA CLASS: CRIAÇÃO DE OBJETOS IMUTÁVEIS
data class Banco(

    val nome: String,
    val numero: Int,
) {
    // FUNÇÃO DA CLASSE
    fun info() = "$nome e $numero"
}


