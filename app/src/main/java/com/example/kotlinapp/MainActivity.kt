package com.example.kotlinapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinapp.adapter.RecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
//
//    private val nome: String = "Cecilia"
//    private var nome2: String = "Patricia"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val pessoa = Pessoa()
//        pessoa.nome = "Silvia"

        val adapter = RecyclerViewAdapter(nomesAlunos())
        recycler_view.adapter = adapter
        recycler_view.layoutManager = LinearLayoutManager(this)
    }

    private fun nomesAlunos(): List<String>{
        val nomesAlunos = mutableListOf<String>()

        nomesAlunos.add("Ana")
        nomesAlunos.add("Bia")
        nomesAlunos.add("Ceci")
        nomesAlunos.add("Dai")
        nomesAlunos.add("Elisa")
        nomesAlunos.add("Fabi")
        nomesAlunos.add("Gabi")
        nomesAlunos.add("Helen")
        nomesAlunos.add("Julia")

        return nomesAlunos
    }
}
