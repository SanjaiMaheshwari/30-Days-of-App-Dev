package com.example.recyclerview

import android.content.Intent
import android.os.Bundle
import android.provider.Telephony.Mms.Intents
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var myRecyclerView: RecyclerView
    lateinit var newArrayList: ArrayList<News>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


    myRecyclerView = findViewById(R.id.recyclerView)

        val newsImageArray = arrayOf(
            R.drawable.img1,
            R.drawable.img2,
            R.drawable.img3,
            R.drawable.img4,
            R.drawable.img5,
            R.drawable.img6
        )

        val newsHeadingArray = arrayOf(
            "U.K. Foreign Secretary James Cleverly raises issue of BBC tax searches with EAM Jaishankar",
            "Cooking gas prices hiked by ₹50 for domestic, ₹350.50 for commercial cylinders",
            "Joe Biden appoints two prominent Indian-American corporate leaders to his Export Council",
            "Sergey Lavrov will raise suspected bombing of Nord Stream II at G20: Russian Foreign Ministry",
            "Belarusian leader Lukashenko visits China amid Ukraine tensions",
            "China rips new U.S. House committee on countering Beijing",
            "Largest gathering of Foreign Ministers hosted by any G20 presidency: Foreign Secretary Vinay Kwatra"
        )

        val newsContent = arrayOf(
          getString(R.string.newsContent), getString(R.string.newsContent),
          getString(R.string.newsContent), getString(R.string.newsContent),
          getString(R.string.newsContent), getString(R.string.newsContent)

            )

        // to set hav bhav of item inside recyclerview , vertically scrolling , horizontaly unifrom grid

        myRecyclerView.layoutManager = LinearLayoutManager(this)
        newArrayList = arrayListOf<News>()

        for (index in newsImageArray.indices){
            val news = News(newsHeadingArray[index],newsImageArray[index],newsContent[index])
            newArrayList.add(news)
        }
        val  myAdapter = myAdapter(newArrayList,this)
        myRecyclerView.adapter = myAdapter

        myAdapter.setOnItemClickListener(object  : myAdapter.onItemClickListener{
            override fun onItemClick(position: Int) {

                // on clicking each item, what action do you want to perform

                val intent  = Intent(applicationContext,NewsDeatilsActivity::class.java)
                intent.putExtra("heading",newArrayList[position].newHeading)
                intent.putExtra("imageId",newArrayList[position].newsImage)
                intent.putExtra("newsContent",newArrayList[position].newsContent)

                startActivity(intent)

            }


        })

    }
}