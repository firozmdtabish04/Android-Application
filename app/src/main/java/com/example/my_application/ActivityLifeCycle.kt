package com.example.my_application

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class ActivityLifeCycle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_life_cycle)
        Toast.makeText(this, "onCreate() called", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart() called", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume() called", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        Toast.makeText(this, "onPause() called", Toast.LENGTH_SHORT).show()
        super.onPause()
    }

    override fun onStop() {
        Toast.makeText(this, "onStop() called", Toast.LENGTH_SHORT).show()
        super.onStop()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart() called", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        Toast.makeText(this, "onDestroy() called", Toast.LENGTH_SHORT).show()
        super.onDestroy()
    }
}
