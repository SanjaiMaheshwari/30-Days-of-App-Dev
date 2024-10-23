package com.example.recyclerview

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NewsDeatilsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news_deatils)


        val heading = intent.getStringExtra("heading")
        val newsContent = intent.getStringExtra("newsContent")
        val imageId = intent.getIntExtra("imageId", R.drawable.img1)

        val headingTV = findViewById<TextView>(R.id.newsHeading)
        val headingIV = findViewById<ImageView>(R.id.newsImage)
        val newsContentTV = findViewById<TextView>(R.id.newsContent)


        headingTV.text = heading
        newsContentTV.text = newsContent
        headingIV.setImageResource(imageId)
    }
}