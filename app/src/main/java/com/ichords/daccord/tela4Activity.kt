package com.ichords.daccord

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Tela4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela4)

        // Configura o botão para praticar
        val buttonPraticar = findViewById<Button>(R.id.botaopraticar)
        buttonPraticar.setOnClickListener {
            // Navegar para a próxima tela (por exemplo, TelaPraticaActivity)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Configura o botão do tutorial
        val buttonTutorial = findViewById<ImageButton>(R.id.botaotutorial3)
        buttonTutorial.setOnClickListener {
            // Navegar para a tela do tutorial (por exemplo, TelaTutorialActivity)
            val intent = Intent(this, Tela2Activity::class.java)
            startActivity(intent)
        }

        // Configura o botão da música
        val buttonMusica = findViewById<ImageButton>(R.id.botaomusica2)
        buttonMusica.setOnClickListener {
            // Navegar para a tela de música (por exemplo, TelaMusicaActivity)
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}
