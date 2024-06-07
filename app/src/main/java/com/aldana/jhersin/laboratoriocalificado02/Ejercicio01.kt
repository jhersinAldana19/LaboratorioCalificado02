package com.aldana.jhersin.laboratoriocalificado02
<<<<<<< HEAD

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.aldana.jhersin.laboratoriocalificado02.databinding.ActivityEjercicio01Binding

class Ejercicio01 : AppCompatActivity() {

    private lateinit var binding: ActivityEjercicio01Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEjercicio01Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.showButton.setOnClickListener {
            binding.greenView.visibility = View.VISIBLE
        }

        binding.hideButton.setOnClickListener {
            binding.greenView.visibility = View.GONE
        }
    }
}
=======
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Ejercicio01 : AppCompatActivity() {

    private lateinit var greenView: View
    private lateinit var showButton: Button
    private lateinit var hideButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio01)

        greenView = findViewById(R.id.greenView)
        showButton = findViewById(R.id.showButton)
        hideButton = findViewById(R.id.hideButton)

        showButton.setOnClickListener {
            greenView.visibility = View.VISIBLE
        }

        hideButton.setOnClickListener {
            greenView.visibility = View.GONE
        }
    }
}


>>>>>>> 6006dfd2fc917166038a8b9e60c836852cd545a8
