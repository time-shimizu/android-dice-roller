package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val countUpButton: Button = findViewById(R.id.count_up_button)
        countUpButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()
        var randomInt = (1..6).random()
        var resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()
    }

    private  fun countUp() {
        var resultText: TextView = findViewById(R.id.result_text)
        if (resultText.text == "Hello World!") {
            resultText.text = 1.toString()
        } else if (resultText.text.toString().toInt() >= 6) {
            return
        } else {
            resultText.text = (resultText.text.toString().toInt() + 1).toString()
        }
    }
}
