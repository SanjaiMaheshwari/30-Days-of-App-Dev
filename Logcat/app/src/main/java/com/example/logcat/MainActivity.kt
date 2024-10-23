package com.example.logcat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textview = findViewById<TextView >(R.id.tv)

        Log.i("INFO Tag " , "This is My Info")

        textview.setOnClickListener{

            val intent=Intent(this,MainActivity2::class.java)

            startActivity(intent)
        }
    }
}