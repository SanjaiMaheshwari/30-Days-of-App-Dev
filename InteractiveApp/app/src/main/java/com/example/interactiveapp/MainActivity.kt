package com.example.interactiveapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import com.example.interactiveapp.R.id.linearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLight = findViewById<Button>(R.id.BtnLight)
        val btnDark = findViewById<Button>(R.id.btnDark)
        val layout = findViewById<LinearLayout>(R.id.linearLayout)


    btnLight.setOnClickListener{
        Toast.makeText(this, "You are in Light Mood", Toast.LENGTH_SHORT).show()

        layout.setBackgroundColor(R.color.Yellow)
    }

        btnDark.setOnClickListener{
            Toast.makeText(this, "You are in Dark Mood ", Toast.LENGTH_SHORT).show()
            layout.setBackgroundColor(R.color.black)
        }

    }
}






