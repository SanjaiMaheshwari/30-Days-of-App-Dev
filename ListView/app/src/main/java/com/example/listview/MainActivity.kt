package com.example.listview

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val listTask = findViewById<ListView>(R.id.listview)

        val taskList = arrayListOf<String>()

        taskList.add("Complete Saumya Simgh Course")
        taskList.add("Assignment to Read Topics")
        taskList.add( " Attend Exams from Monday")
        taskList.add("3 hours Daily app dev after mid")
        taskList.add("Work on Resume")
        taskList.add("Go home in Novmeber")

        val adapterForMyListView = ArrayAdapter(this,android.R.layout.simple_list_item_1,taskList)
        listTask.adapter = adapterForMyListView

        listTask.setOnItemClickListener { adapterView, view, i, l ->
            val text = "Clicked On Item" + (view as TextView).text.toString()
            Toast.makeText(this, text, Toast.LENGTH_SHORT).show()
        }
    }
}