package com.example.photoframe

import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    var currentImage = 0
    lateinit var image : ImageView
    var names = arrayOf("Sanjai Maheshwari", "Inzmam-Ul-Haq", "Haris"," Adnan and Usman")

    // 0 1 2 3 -> 0 1 2 3
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val prev = findViewById<ImageButton>(R.id.imgback)
        val next = findViewById<ImageButton>(R.id.imgnext)
        val text = findViewById<TextView>(R.id.textView)

        prev.setOnClickListener {

            val idCurrentImageString = "pic$currentImage"

            // convert sting id into integer address associated with it.

            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)

            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (4+ currentImage - 1)%4

            val idImageToShowString = "pic$currentImage"

            // convert sting id into integer address associated with it.

            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString,"id",packageName)

            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            text.text = names[currentImage]

        }

        next.setOnClickListener {

            val idCurrentImageString = "pic$currentImage"

            // convert sting id into integer address associated with it.

            val idCurrentImageInt = this.resources.getIdentifier(idCurrentImageString, "id", packageName)

            image = findViewById(idCurrentImageInt)
            image.alpha = 0f

            currentImage = (4+ currentImage + 1)%4
            val idImageToShowString = "pic$currentImage"

            // convert sting id into integer address associated with it.

            val idImageToShowInt = this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image = findViewById(idImageToShowInt)
            image.alpha = 1f
            text.text = names[currentImage]
        }

    }
}