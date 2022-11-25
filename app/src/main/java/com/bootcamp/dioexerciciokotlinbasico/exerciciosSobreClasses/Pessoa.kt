package com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses

class Pessoa {

    // PRORPIEDADES DE UMA CLASSE
    var nome: String = "Jether"
    var cpf: String = "123.123.123-12"

    // CONSTRUTOR SECUNDÁRIO
    constructor()

    // FUNÇÃO DENTRO DO ESCOPO DA CLASSE PESSOA
    fun pessoaInfo() = "$nome e $cpf"
}

   // FUNÇÃO FORA DO ESCOPO DA CLASSE PESSOA
fun main() {
    val jether = Pessoa()

    println(jether.pessoaInfo())
}