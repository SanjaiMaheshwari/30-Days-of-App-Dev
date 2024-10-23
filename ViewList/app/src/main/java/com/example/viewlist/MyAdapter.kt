package com.example.viewlist

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView
import java.util.zip.Inflater

class MyAdapter(private val context : Activity, private val arrayList: ArrayList<User>) :
    ArrayAdapter<User>(context,R.layout.eachitem,arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.eachitem, null)


        val image = view.findViewById<CircleImageView>(R.id.profile_image)
        val name = view.findViewById<TextView>(R.id.Name)
        val lastMsj = view.findViewById<TextView>(R.id.lastMsj)
        val lastMsjTime = view.findViewById<TextView>(R.id.lastMsjTime)

        name.text = arrayList[position].name
        lastMsj.text = arrayList[position].lastMsj
        lastMsjTime.text = arrayList[position].lastMsjTime
       image.setImageResource(arrayList[position].imageId.toInt())

        return view
    }
}


