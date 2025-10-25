package com.example.my_application

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ImplicitActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_implicit)

        val googleBtn = findViewById<Button>(R.id.button_google)
        val youtubeBtn = findViewById<Button>(R.id.button_youtube)

        googleBtn.setOnClickListener {
            val implicit = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"))
            startActivity(implicit)
        }

        youtubeBtn.setOnClickListener {
            val implicit = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/"))
            startActivity(implicit)
        }
    }
}