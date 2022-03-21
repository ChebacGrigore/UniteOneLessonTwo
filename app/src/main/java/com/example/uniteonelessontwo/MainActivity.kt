package com.example.uniteonelessontwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
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
        val textView = findViewById<TextView>(R.id.number)
        textView.text = (0..6).random().toString()
    }
}