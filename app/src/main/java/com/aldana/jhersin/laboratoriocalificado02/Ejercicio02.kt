package com.aldana.jhersin.laboratoriocalificado02

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.aldana.jhersin.laboratoriocalificado02.databinding.ActivityEjercicio02Binding

class Ejercicio02 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio02Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio02Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setListeners()
    }

    private fun setListeners() {
        binding.btnRegister.setOnClickListener {
            registerOrder()
        }
    }

    private fun registerOrder() {
        val name = binding.edtName.text.toString()
        val number = binding.edtNumber.text.toString()
        val products = binding.edtProducts.text.toString()
        val city = binding.edtCity.text.toString()
        val address = binding.edtAddress.text.toString()

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

