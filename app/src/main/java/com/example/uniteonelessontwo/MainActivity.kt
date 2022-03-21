package com.example.uniteonelessontwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton = findViewById<Button>(R.id.generateNumber)

        rollButton.setOnClickListener {
            generateNumber()

        }

    }

    private fun generateNumber() {

        val number = Dice(6).roll().toString()

        val textView = findViewById<TextView>(R.id.number)
        textView.text = number
        getToastMessage("You number is $number")
    }

    private fun getToastMessage(toastMessage: String) {
        Toast.makeText(applicationContext,toastMessage, Toast.LENGTH_SHORT).show()
    }
}