package com.example.calculator

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.example.my_application.R

class CalculatorActivity : AppCompatActivity() {

    private lateinit var input1: EditText
    private lateinit var input2: EditText
    private lateinit var resultText: TextView

    private var operator: String = "+"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator_layout)

        // Initialize views
        input1 = findViewById(R.id.input_number1)
        input2 = findViewById(R.id.input_number2)
        resultText = findViewById(R.id.result_text)

        // Operator buttons
        findViewById<Button>(R.id.button_add).setOnClickListener { operator = "+" }
        findViewById<Button>(R.id.button_subtract).setOnClickListener { operator = "-" }
        findViewById<Button>(R.id.button_multiply).setOnClickListener { operator = "*" }
        findViewById<Button>(R.id.button_divide).setOnClickListener { operator = "/" }
        findViewById<Button>(R.id.button_percentage).setOnClickListener { operator = "%" }

        // Calculate button
        findViewById<Button>(R.id.button_calculate).setOnClickListener {
            calculate()
        }
    }

    private fun calculate() {
        val num1 = input1.text.toString().toDoubleOrNull()
        val num2 = input2.text.toString().toDoubleOrNull()

        if (num1 == null || num2 == null) {
            resultText.text = "Please enter valid numbers"
            return
        }

        val result = when (operator) {
            "+" -> num1 + num2
            "-" -> num1 - num2
            "*" -> num1 * num2
            "/" -> if (num2 != 0.0) num1 / num2 else "Cannot divide by 0"
            "%" -> (num1 / 100) * num2  // <-- Updated logic for percentage
            else -> "Unknown operation"
        }


        // Show result (rounded if numeric)
        resultText.text = if (result is Double) {
            "Result: %.2f".format(result)
        } else {
            "Result: $result"
        }
    }
}
