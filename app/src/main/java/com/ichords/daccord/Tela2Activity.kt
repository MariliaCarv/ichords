package com.ichords.daccord

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ScrollView
import androidx.appcompat.app.AppCompatActivity

class Tela2Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Criar um ScrollView
        val scrollView = ScrollView(this)

        // Criar um LinearLayout
        val linearLayout = LinearLayout(this)
        linearLayout.orientation = LinearLayout.VERTICAL

        // Adicionar elementos ao LinearLayout

        // Adicionar uma imagem usando ImageView
        val imageView1 = ImageView(this)
        imageView1.setImageResource(R.drawable.telaa1)
        linearLayout.addView(imageView1)

        val imageView2 = ImageView(this)
        imageView2.setImageResource(R.drawable.telaa2)
        linearLayout.addView(imageView2)

        // Adicionar o LinearLayout ao ScrollView
        scrollView.addView(linearLayout)

        // Definir o ScrollView como o conteúdo da atividade
        setContentView(scrollView)
    }
}
