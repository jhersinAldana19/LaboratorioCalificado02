package com.aldana.jhersin.laboratoriocalificado02
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


