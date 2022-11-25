package com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses.testes

import com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses.Analista


fun main() {
    val glasgow = Analista("Glasgow Rodrigues", "123456789", 2000.0)
    ImprimeRelatorioFuncionario.imprime(glasgow)
}
