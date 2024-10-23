package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnIntent=findViewById<Button>(R.id.btnClick)

        btnIntent.setOnClickListener{
            Toast.makeText(this, "CLick ME ", Toast.LENGTH_SHORT).show()


            intent= Intent(applicationContext,MainActivity2::class.java)
            startActivity(intent)
        }
    }
}