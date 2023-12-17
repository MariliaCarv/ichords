package com.ichords.daccord

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.ImageButton
import android.widget.MediaController
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class Tela3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tela3)

        // Referencie o VideoView do layout
        val videoView = findViewById<VideoView>(R.id.comotocar)

        // Forneça o URI do vídeo
        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.comotocar)

        // Configure um controlador de mídia para controlar a reprodução
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        // Defina o URI do vídeo no VideoView
        videoView.setVideoURI(videoUri)

        // Inicie a reprodução do vídeo
        videoView.start()

        val button4 = findViewById<ImageButton>(R.id.botaoproximo2)
        button4.setOnClickListener {
            val intent = Intent(this, Tela4Activity::class.java)
            startActivity(intent)
        }
    }
}
