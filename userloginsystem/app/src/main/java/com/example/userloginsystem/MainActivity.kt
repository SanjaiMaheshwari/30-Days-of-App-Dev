package com.example.userloginsystem

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase


class MainActivity : AppCompatActivity() {

    lateinit var database: DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val btnSign = findViewById<Button>(R.id.btnSignup)
        val etName = findViewById<TextInputEditText>(R.id.etName)
        val etMail = findViewById<TextInputEditText>(R.id.etMail)
        val userpassword = findViewById<TextInputEditText>(R.id.etPassword)
        val userid = findViewById<TextInputEditText>(R.id.etUserName)

        btnSign.setOnClickListener {
            val name = etName.text.toString()
            val mail = etMail.text.toString()
            val id = userid.text.toString()
            val pass = userpassword.text.toString()
            val user = users(name,mail,id,pass)


            database = FirebaseDatabase.getInstance().getReference("users")
            database.child(id).setValue(user).addOnSuccessListener {

                Toast.makeText(this, "User Register Successfully", Toast.LENGTH_SHORT).show()
            }.addOnSuccessListener {
                Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show()
            }
        }
    }
}