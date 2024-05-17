package com.aldana.jhersin.laboratoriocalificado02

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PedidoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pedido)

        val name = intent.getStringExtra("NAME")
        val number = intent.getStringExtra("NUMBER")
        val products = intent.getStringExtra("PRODUCTS")
        val city = intent.getStringExtra("CITY")
        val address = intent.getStringExtra("ADDRESS")

        findViewById<TextView>(R.id.txtName).text = name
        findViewById<TextView>(R.id.txtNumber).text = number
        findViewById<TextView>(R.id.txtProducts).text = products
        findViewById<TextView>(R.id.txtCity).text = city
        findViewById<TextView>(R.id.txtAddress).text = address
    }
}


