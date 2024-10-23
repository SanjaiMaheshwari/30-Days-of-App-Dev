package com.example.viewlist

import android.content.Intent
import android.icu.text.Transliterator.Position
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    lateinit var userArrayList : ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val name = arrayOf("Saumya SIngh","Adnan","Gulzaman","Rayan","Sahil")

        val lastMsj = arrayOf("I am Good", "Hey Jani", "Dig Dig", "Awasome","Paisa Mokl")

        val lastMsjTime = arrayOf("6:30 AM", "7:00 AM", "7:30 AM", "8:00 AM", "9:00 AM")

        val phoneNum = arrayOf("03133925458","034063656112","03160122133","03313711985","03486975905")

        val imageId = intArrayOf(R.drawable.pic5,R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4)

        userArrayList = ArrayList()

        for (index in name.indices) {
            val user = User(name[index], lastMsj[index], lastMsjTime[index], phoneNum[index],
                imageId[index].toString()
            )
            userArrayList.add(user)
        }



        val view = findViewById<ListView>(R.id.listView)
        view.isClickable = true
        view.adapter = MyAdapter(this,userArrayList)



        view.setOnItemClickListener { adapterView, view, i, l ->

            val userName = name[i]
            val userPhone = phoneNum[i]
            val imageId = imageId[i]

            val intent  = Intent(this,User::class.java)
            intent.putExtra("name",userName)
            intent.putExtra("phone",phoneNum)
            intent.putExtra("imageId",imageId)
            startActivity(intent)
        }

    }

}