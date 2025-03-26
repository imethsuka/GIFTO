package com.imethsuka.gifto

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Navigation setup
        val navProfile = findViewById<ImageButton>(R.id.nav_profile)
        val navCart = findViewById<ImageButton>(R.id.nav_cart)
        val navStore = findViewById<ImageButton>(R.id.nav_store)
        val navSettings = findViewById<ImageButton>(R.id.nav_settings)

        navProfile.setOnClickListener {
            val intent = Intent(this, profile::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        navCart.setOnClickListener {
            val intent = Intent(this, cart::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        navStore.setOnClickListener {
            val intent = Intent(this, store::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        navSettings.setOnClickListener {
            // If you have a settings page, uncomment this
            // val intent = Intent(this, Settings::class.java)
            // startActivity(intent)
            // overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}