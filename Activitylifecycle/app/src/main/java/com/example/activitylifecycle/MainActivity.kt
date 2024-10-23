package com.example.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "OnCreate() calls ", Toast.LENGTH_SHORT).show()
        var text = findViewById<TextView>(R.id.txt1)
        text.setOnClickListener {
            intent = Intent(applicationContext, MainActivity2::class.java)
            startActivity(intent)
        }
    }
    
    override fun onStart() {
        super.onStart();
        Toast.makeText(applicationContext, "Now onStart() calls", Toast.LENGTH_SHORT).show(); //onStart Called }
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(applicationContext, "Now onResume() calls", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(applicationContext, "Now onPause() calls", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(applicationContext, "Now onStop() calls ", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(applicationContext, "Now onRestart() calls ", Toast.LENGTH_SHORT).show()
    }
    
    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(applicationContext, "Now onDestory() calls ", Toast.LENGTH_SHORT).show()
    }

}