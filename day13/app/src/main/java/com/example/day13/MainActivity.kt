package com.example.day13

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    // Creating Key

    companion object {
        const val KEY = " com.example.day13.MainActivity.KEY"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text1=findViewById<TextView>(R.id.et1)
        val text2=findViewById<TextView>(R.id.et2)
        val text3=findViewById<TextView>(R.id.et3)
        val text4=findViewById<TextView>(R.id.et4)
        val button=findViewById<Button>(R.id.btnOr)


        button.setOnClickListener {

            val orderplaced = text1.text.toString() + "  " + text2.text.toString() + "  " + text3.text.toString() + "  " + text4.text.toString()



            intent= Intent(this,orderlalo::class.java)
            intent.putExtra(KEY,orderplaced)
            startActivity(intent)
        }
    }
}