package com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses.testes

import com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses.Pessoa

fun main() {
    val jether = Pessoa("Jether", "123456789")
    println(jether.nome)
    println(jether.cpf)
}