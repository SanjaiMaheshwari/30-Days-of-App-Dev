package com.example.navigationview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val bottom = findViewById<BottomNavigationView>(R.id.bottomNavigation)

        // by default, home fragment should be visible to the user

        bottom.setOnItemSelectedListener {
            when (it.itemId) {

                R.id.item1 -> replaceWithFragment(Home())
                R.id.item2 -> replaceWithFragment(Search())
                R.id.item3 -> replaceWithFragment(Profile())
            else -> {
        }
        }
        true
    }


        replaceWithFragment(Home())

    }
    private fun replaceWithFragment(fragment : Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayout, fragment)
        fragmentTransaction.commit()

    }
}