package com.ichords.daccord

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Botão Tutorial
        val buttonTutorial = findViewById<ImageButton>(R.id.botaotutorial1)
        buttonTutorial.setOnClickListener {
            // Navegar para a segunda tela (Tela2Activity)
            val intent = Intent(this, Tela2Activity::class.java)
            startActivity(intent)
        }
    }
}
