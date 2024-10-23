package com.example.activitylifecycle

import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        val toast = Toast.makeText(this, "Second Activity ", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()
    }
    override fun onStart() {
        super.onStart()
        val toast = Toast.makeText(this, "Now onStart() calls", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()
    }

    override fun onResume() {
        super.onResume()
        val toast = Toast.makeText(this,"Now onResume() calls ", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()
    }


    override fun onPause() {
        super.onPause()
       val toast =  Toast.makeText(this, "Now onPause() calls", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()
    }

    override fun onStop() {
        super.onStop()
        val toast = Toast.makeText(this, "Now onStop() calls ", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()
    }

    override fun onRestart() {
        super.onRestart()
        val toast =  Toast.makeText(this, "Now onRestart() calls ", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()
    }

    override fun onDestroy() {
        super.onDestroy()
       val toast=  Toast.makeText(this, "Now onDestory() calls ", Toast.LENGTH_SHORT)
        toast.setGravity(Gravity.CENTER,0,0)
        toast.show()
    }

    }


