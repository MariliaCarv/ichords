package com.ichords.daccord

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela2)

        val buttonProximo = findViewById<ImageButton>(R.id.botaoproximo1)
        buttonProximo.setOnClickListener {
            // Navegar para a terceira tela (Tela3Activity)
            val intent = Intent(this, Tela3Activity::class.java)
            startActivity(intent)
        }

        val buttonMusica = findViewById<ImageButton>(R.id.botaomusica1)
        buttonMusica.setOnClickListener {
            // Navegar para a tela principal (MainActivity)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
