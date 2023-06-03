package com.elygium.listasactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.elygium.listasactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listaNumeros = ArrayList<Int>()

        listaNumeros.add(1)
        listaNumeros.add(10)
        listaNumeros.add(5)
        listaNumeros.add(4)
        listaNumeros.add(8)
        listaNumeros.add(9)

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, listaNumeros)
        binding.listView.adapter = adapter

        // Quando clicar em um dos itens da lista ele mostra a mensagem
        binding.listView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(this, "Clicado em ${listaNumeros.get(position)}", Toast.LENGTH_SHORT)
                .show()
        }
    }
}
// listaNumeros [1, 10, 5, 4, 8, 9]

//val primeiro = listaNumeros.get(0)
//1

//listaNumeros.removeAt(0)
// listaNumeros [10, 5, 4, 8, 9]

//listaNumeros.remove(5)
// listaNumeros [10, 4, 8, 9]

//val tamanho = listaNumeros.size
//4

//listaNumeros.clear()
// listaNumeros []