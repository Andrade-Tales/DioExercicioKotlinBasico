package com.bootcamp.dioexerciciokotlinbasico.exerciciosSobreClasses

// CLASSE DO TIPO ENUM QUE TEM SUA REPRESENTAÇÃO PRÓPRIA DE UM OBJETO COM VALORES FIXOS
enum class ClienteTipo(val descricao: String) {

    PF("Pessoa Física"),
    PJ("Pessoa Jurídica");


}