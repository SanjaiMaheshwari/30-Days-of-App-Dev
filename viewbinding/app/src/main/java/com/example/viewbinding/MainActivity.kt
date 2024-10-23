package com.example.viewbinding

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn.setOnClickListener{

            if (binding.checkBox2.isChecked){
                // Open New Activity

                Toast.makeText(this, "Open New Activity ", Toast.LENGTH_SHORT).show()
            }
            else{
                binding.checkBox2.buttonTintList = ColorStateList.valueOf(Color.RED)
                Toast.makeText(this, "Please accept T&C", Toast.LENGTH_SHORT).show()
            }
        }

    }
}