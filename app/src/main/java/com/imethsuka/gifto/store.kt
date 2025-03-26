package com.imethsuka.gifto

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton

class store : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_store)

        val navProfile = findViewById<ImageButton>(R.id.nav_profile)
        val navHome = findViewById<ImageButton>(R.id.nav_home)
        val navCart = findViewById<ImageButton>(R.id.nav_cart)
        val navSettings = findViewById<ImageButton>(R.id.nav_settings)

        navProfile.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        navHome.setOnClickListener {
            val intent = Intent(this, Home::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        navCart.setOnClickListener {
            val intent = Intent(this, cart::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        navSettings.setOnClickListener {
            // Settings navigation if needed
        }
    }
}