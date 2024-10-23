package com.example.implict_intent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webButton=findViewById<CardView>(R.id.cardWeb)
        val CameraButton=findViewById<CardView>(R.id.cardCamera)


        webButton.setOnClickListener{
            intent= Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.google.com/")
            startActivity(intent)

        }


        CameraButton.setOnClickListener{

            intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)

        }




    }
}