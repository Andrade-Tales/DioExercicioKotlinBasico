package com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses.testes

import com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses.Gerente

fun main() {
    val maria = Gerente("Maria Camargo", "123456789", 5000.0, "senha123")
    ImprimeRelatorioFuncionario.imprime(maria)

    AutenticacaoTeste().autentica(maria)
}

