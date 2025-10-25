package com.example.lifecycleapp

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.my_application.R

class LifecycleActivity : AppCompatActivity() {

    private val TAG = "ActivityLifecycle"
    private lateinit var lifecycleText: TextView
    private lateinit var clearButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lifecycle)

        lifecycleText = findViewById(R.id.lifecycleText)
        clearButton = findViewById(R.id.clearButton)

        clearButton.setOnClickListener {
            lifecycleText.text = "Activity Lifecycle Logs Cleared"
        }

        showMessage("onCreate called")
    }

    override fun onStart() {
        super.onStart()
        showMessage("onStart called")
    }

    override fun onResume() {
        super.onResume()
        showMessage("onResume called")
    }

    override fun onPause() {
        super.onPause()
        showMessage("onPause called")
    }

    override fun onStop() {
        super.onStop()
        showMessage("onStop called")
    }

    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy called")
    }

    // Helper function to update UI, Toast, and Log
    private fun showMessage(msg: String) {
        lifecycleText.append("\n$msg")
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
        Log.d(TAG, msg)
    }
}
