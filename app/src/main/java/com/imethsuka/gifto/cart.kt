package com.imethsuka.gifto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton

class cart : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val navProfile = findViewById<ImageButton>(R.id.nav_profile)
        val navHome = findViewById<ImageButton>(R.id.nav_home)
        val navStore = findViewById<ImageButton>(R.id.nav_store)
        val navSettings = findViewById<ImageButton>(R.id.nav_settings)
        val btnCheckout = findViewById<Button>(R.id.btnCheckout111)

        btnCheckout.setOnClickListener {
            val intent = Intent(this, checkout::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

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

        navStore.setOnClickListener {
            val intent = Intent(this, store::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        navSettings.setOnClickListener {

        }
    }
}