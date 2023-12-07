package com.ichords.daccord

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Botão 2
        val button2 = findViewById<ImageButton>(R.id.Button2)
        button2.setOnClickListener {
            // Navegar para a segunda tela (Tela2Activity)
            val intent = Intent(this, Tela2Activity::class.java)
            startActivity(intent)
        }
    }
}
