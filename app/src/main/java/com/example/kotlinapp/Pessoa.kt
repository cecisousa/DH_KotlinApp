package com.example.kotlinapp

class Pessoa {

    var nome: String = "Ceci"

    lateinit var novoNome: String

    fun mostrarNome() : String {
        return nome
    }

}