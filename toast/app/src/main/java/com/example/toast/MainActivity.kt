package com.example.toast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonUplaod = findViewById<Button>(R.id.btnUPL)
        val buttonDowland = findViewById<Button>(R.id.btnDow)

        buttonUplaod.setOnClickListener{
            Toast.makeText(applicationContext,"Upload Some Content",Toast.LENGTH_SHORT).show()
        }

        buttonDowland.setOnClickListener{
            Toast.makeText(applicationContext,"Dowland Uploaded Content ",Toast.LENGTH_SHORT).show()
        }
    }
}