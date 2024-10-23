package com.example.custumize_alert_box

import android.app.Dialog
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    // Create a veriable of type Dialog

    // Builtin CLass Dialog
    lateinit var dialog:Dialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnClick = findViewById<Button>(R.id.btnClick)

        dialog = Dialog(this)
        dialog.setContentView(R.layout.activity_custom_alertbox)

        dialog.window?.setBackgroundDrawable(getDrawable(R.drawable.bd_alert_box))


        // Creating the Variable for the Custome_alertbox.xml
        var btnGood = dialog.findViewById<Button>(R.id.btnGood)
        var btnSF = dialog.findViewById<Button>(R.id.btnFeedBack)

        btnGood.setOnClickListener {
            dialog.dismiss()
        }

        btnSF.setOnClickListener {
            // Intents or Toast

            Toast.makeText(this, "Send Feed Back", Toast.LENGTH_SHORT).show()
        }

        btnClick.setOnClickListener {

            dialog.show()
        }

    }
}