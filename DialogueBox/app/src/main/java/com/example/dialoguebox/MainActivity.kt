package com.example.dialoguebox

import android.content.DialogInterface
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.dialoguebox.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btn1.setOnClickListener{
            val builder1 = AlertDialog.Builder(this)
            builder1.setTitle("Are You Sure ")
            builder1.setMessage("Do You want to close the app")
            builder1.setIcon(R.drawable.baseline_check_24)
            builder1.setPositiveButton("yes", DialogInterface.OnClickListener { dialogInterface, i ->
                // What action should be performed when yes is clicked?
                finish()
            })

            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialogInterface, i ->
                // What action should be performed what no is clicked?
            })
            builder1.show()
        }

        binding.btn2.setOnClickListener{
            val options = arrayOf("Gulab-jaman", "Rass-Malai", "Kaju-Katli")
            val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("Which is your Favourite Sweet")
            builder2.setSingleChoiceItems(options,0,DialogInterface.OnClickListener { dialog, which ->

                // What Action Should be performed when user click on any option?

                Toast.makeText(this, "You CLicked On ${options[which]}", Toast.LENGTH_SHORT).show() })

            builder2.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // What action should be performed when yes is clicked?
            })

            builder2.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->
                // What action should be performed what no is clicked?
            })
            builder2.show()
        }


        binding.btn3.setOnClickListener{
            val options = arrayOf("Gulab-jaman", "Rass-Malai", "Kaju-Katli")
            val builder3 = AlertDialog.Builder(this)
            builder3.setTitle("Which is your Favourite Sweet")

            builder3.setMultiChoiceItems(options,null,DialogInterface.OnMultiChoiceClickListener { dialog, which , isChecked ->
            Toast.makeText(this, "You CLicked On ${options[which]}", Toast.LENGTH_SHORT).show() })

            builder3.setPositiveButton("Submit", DialogInterface.OnClickListener { dialogInterface, i ->
                // What action should be performed when yes is clicked?
            })

            builder3.setNegativeButton("Decline",DialogInterface.OnClickListener { dialogInterface, i ->
                // What action should be performed what no is clicked?
            })
            builder3.show()
        }




    }
}