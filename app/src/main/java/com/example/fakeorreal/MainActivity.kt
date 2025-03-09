package com.example.fakeorreal

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)
        val questionTextView = findViewById<TextView>(R.id.questionTextView)
        val buttonReal = findViewById<Button>(R.id.buttonReal)
        val buttonFake = findViewById<Button>(R.id.buttonFake)
        val button: Button = findViewById(R.id.button1)

        // Lógica para cambiar la imagen y la pregunta (solo ejemplo)
        buttonReal.setOnClickListener {
            // Aquí iría la lógica para manejar la respuesta "Real"
            questionTextView.text = "You chose Real!"
        }

        buttonFake.setOnClickListener {
            // Aquí iría la lógica para manejar la respuesta "Fake"
            questionTextView.text = "You chose Fake!"
        }

        button.setOnClickListener {
            // Cambiar la imagen cuando el botón sea presionado
            imageView.setImageResource(R.drawable.imagenunoia)  // Reemplaza con el nombre de tu nueva imagen}
        }
    }
}
