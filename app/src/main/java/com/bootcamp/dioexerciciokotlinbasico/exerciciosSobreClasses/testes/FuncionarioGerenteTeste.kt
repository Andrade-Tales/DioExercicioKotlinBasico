package com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses.testes

import com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses.Analista

fun main() {
    val maria = Analista("Maria Camargo", "123456789", 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}

