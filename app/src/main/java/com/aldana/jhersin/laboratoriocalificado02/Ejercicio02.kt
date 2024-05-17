package com.aldana.jhersin.laboratoriocalificado02

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Ejercicio02 : AppCompatActivity() {

    private lateinit var edtName: EditText
    private lateinit var edtNumber: EditText
    private lateinit var edtProducts: EditText
    private lateinit var edtCity: EditText
    private lateinit var edtAddress: EditText
    private lateinit var btnRegister: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio02)

        initViews()
        setListeners()
    }

    private fun initViews() {
        edtName = findViewById(R.id.edtName)
        edtNumber = findViewById(R.id.edtNumber)
        edtProducts = findViewById(R.id.edtProducts)
        edtCity = findViewById(R.id.edtCity)
        edtAddress = findViewById(R.id.edtAddress)
        btnRegister = findViewById(R.id.btnRegister)
    }

    private fun setListeners() {
        btnRegister.setOnClickListener {
            registerOrder()
        }
    }

    private fun registerOrder() {
        val name = edtName.text.toString()
        val number = edtNumber.text.toString()
        val products = edtProducts.text.toString()
        val city = edtCity.text.toString()
        val address = edtAddress.text.toString()

        if (name.isEmpty() || number.isEmpty() || products.isEmpty() || city.isEmpty() || address.isEmpty()) {
            showToast(getString(R.string.error_empty_fields))
        } else {
            val intent = Intent(this, PedidoActivity::class.java).apply {
                putExtra("NAME", name)
                putExtra("NUMBER", number)
                putExtra("PRODUCTS", products)
                putExtra("CITY", city)
                putExtra("ADDRESS", address)
            }
            startActivity(intent)
        }
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}
