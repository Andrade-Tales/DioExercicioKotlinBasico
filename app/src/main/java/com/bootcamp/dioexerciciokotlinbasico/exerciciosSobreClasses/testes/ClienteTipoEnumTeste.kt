package com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses.testes

import com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses.ClienteTipo

fun main() {
    // ITERAÇÃO DO OBJETO CLIENTE TIPO
    ClienteTipo.values().forEach {
        println("${it.name} é ${it.descricao}")
    }


}