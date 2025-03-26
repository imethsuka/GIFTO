package com.imethsuka.gifto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class obScreen2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ob_screen2) // Fixed: Was using screen1's layout

        findViewById<Button>(R.id.nextButton2).setOnClickListener {
            startActivity(Intent(this, obScreen3::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        findViewById<TextView>(R.id.skipText).setOnClickListener {
            startActivity(Intent(this, signIn::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}