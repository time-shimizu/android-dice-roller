package com.example.diceroller

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    lateinit var anotherDiceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        anotherDiceImage = findViewById(R.id.another_dice_image)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
        val clearButton: Button = findViewById((R.id.clear_button))
        clearButton.setOnClickListener { clearDice() }
    }

    private fun rollDice() {
        diceImage.setImageResource(getRandomDiceImage())
        anotherDiceImage.setImageResource(getRandomDiceImage())
    }

    private fun getRandomDiceImage(): Int {
        return when((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun clearDice() {
        diceImage.setImageResource(R.drawable.empty_dice)
        anotherDiceImage.setImageResource(R.drawable.empty_dice)
    }
}
