package com.example.t2intractiveui

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val buttonRed = findViewById<Button>(R.id.btnRed)
        val buttonBlue = findViewById<Button>(R.id.btnBlue)
        val buttonBlack = findViewById<Button>(R.id.btnBlack)
        val buttonGray = findViewById<Button>(R.id.btnGary)
        val buttonGreen = findViewById<Button>(R.id.btnGreen)
        val buttonYellow = findViewById<Button>(R.id.btnYellow)
        val buttonMehroon = findViewById<Button>(R.id.btnMehroon)
        val buttonPink = findViewById<Button>(R.id.btnPink)
        val buttonBrown = findViewById<Button>(R.id.btnBrown)
        val buttonPurple = findViewById<Button>(R.id.btnPurple)
        val layout= findViewById<LinearLayout>(R.id.main)

        buttonRed.setOnClickListener {
            layout.setBackgroundResource(R.color.Red)
        }

        buttonBlue.setOnClickListener {
            layout.setBackgroundResource(R.color.Blue)
        }

        buttonBlack.setOnClickListener {
            layout.setBackgroundResource(R.color.Black)
        }

        buttonGreen.setOnClickListener {
            layout.setBackgroundResource(R.color.green)
        }

        buttonGray.setOnClickListener {
            layout.setBackgroundResource(R.color.gray)
        }

        buttonMehroon.setOnClickListener {
            layout.setBackgroundResource(R.color.maroon)
        }

        buttonPurple.setOnClickListener {
            layout.setBackgroundResource(R.color.purple)
        }

        buttonPink.setOnClickListener {
            layout.setBackgroundResource(R.color.Pink)
        }

        buttonBrown.setOnClickListener {
            layout.setBackgroundResource(R.color.Brown)
        }

        buttonYellow.setOnClickListener {
            layout.setBackgroundResource(R.color.Yellow)
        }



    }
}