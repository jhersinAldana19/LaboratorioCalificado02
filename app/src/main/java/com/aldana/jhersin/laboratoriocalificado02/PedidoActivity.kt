package com.aldana.jhersin.laboratoriocalificado02

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PedidoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)

        displayOrderDetails()
    }

    private fun displayOrderDetails() {
        val name = intent.getStringExtra("NAME")
        val number = intent.getStringExtra("NUMBER")
        val products = intent.getStringExtra("PRODUCTS")
        val city = intent.getStringExtra("CITY")
        val address = intent.getStringExtra("ADDRESS")

        val tvName = findViewById<TextView>(R.id.tvName)
        val tvNumber = findViewById<TextView>(R.id.tvNumber)
        val tvProducts = findViewById<TextView>(R.id.tvProducts)
        val tvCity = findViewById<TextView>(R.id.tvCity)
        val tvAddress = findViewById<TextView>(R.id.tvAddress)

        tvName.text = getString(R.string.nombre_cliente, name)
        tvNumber.text = getString(R.string.numero_cliente, number)
        tvProducts.text = getString(R.string.productos, products)
        tvCity.text = getString(R.string.ciudad, city)
        tvAddress.text = getString(R.string.direccion, address)
    }
}

