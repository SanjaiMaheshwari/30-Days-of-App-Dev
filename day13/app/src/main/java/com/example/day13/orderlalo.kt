package com.example.day13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class orderlalo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_orderlalo)

        val orderofcustomer=intent.getStringExtra(MainActivity.KEY)

        val text6=findViewById<TextView>(R.id.sb2)

        text6.text = "ORDER PLACED " + orderofcustomer.toString()
    }
}