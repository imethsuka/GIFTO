package com.imethsuka.gifto

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageButton

class profile : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val navHome = findViewById<ImageButton>(R.id.nav_home)
        val navCart = findViewById<ImageButton>(R.id.nav_cart)
        val navStore = findViewById<ImageButton>(R.id.nav_store)
        val navSettings = findViewById<ImageButton>(R.id.nav_settings)

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

        navStore.setOnClickListener {
            val intent = Intent(this, store::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        navSettings.setOnClickListener {
        }
    }
}