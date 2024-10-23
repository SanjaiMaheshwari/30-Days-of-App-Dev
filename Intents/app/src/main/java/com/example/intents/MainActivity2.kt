package com.example.intents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)


        val btnIntent = findViewById<Button>(R.id.btnCP)

        btnIntent.setOnClickListener{
            Toast.makeText(this, "Course Uploaded Successfully", Toast.LENGTH_SHORT).show()


            intent= Intent(applicationContext,MainActivity3::class.java)
            startActivity(intent)
        }
    }
}