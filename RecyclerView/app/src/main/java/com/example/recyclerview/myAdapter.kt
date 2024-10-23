package com.example.recyclerview

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView.OnItemClickListener
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView
import com.google.android.material.shape.Shapeable

class myAdapter(var newsArrayList:ArrayList<News>, var context : Activity) :  RecyclerView.Adapter<myAdapter.MyViewHolder>() {

    private lateinit var myListener : onItemClickListener

    interface onItemClickListener {

        fun onItemClick(position: Int)

    }

    fun setOnItemClickListener (listener : onItemClickListener)  {
        myListener = listener
    }

    // To create a new view instance
    // when Layout Manager is fails to find a suitable views for each item.

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myAdapter.MyViewHolder {
        val viewItem = LayoutInflater.from(parent.context).inflate(R.layout.eachrow, parent,false)
        return MyViewHolder(viewItem,myListener)
    }

    // populate item with data
    override fun onBindViewHolder(holder: myAdapter.MyViewHolder, position: Int) {
        var currentItem = newsArrayList[position]
        holder.hTitle.text = currentItem.newHeading
        holder.hImage.setImageResource(currentItem.newsImage)
    }

    // how many list items are present in your array.
    override fun getItemCount(): Int {
        return newsArrayList.size
    }


    // it hold the views so views are not created everytime , so memory can be saved
    class MyViewHolder (itemView : View,  listener : onItemClickListener): RecyclerView.ViewHolder(itemView){
        val  hTitle = itemView.findViewById<TextView>(R.id.headingTitel)
        val hImage =  itemView.findViewById<ShapeableImageView>(R.id.headingImage)

        init {
            itemView.setOnClickListener {
                listener.onItemClick(adapterPosition)
            }
        }
    }

}