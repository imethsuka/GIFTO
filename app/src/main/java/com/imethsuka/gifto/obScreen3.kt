package com.imethsuka.gifto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class obScreen3 : AppCompatActivity() {  // Changed from 'signIn' to 'obScreen3'
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ob_screen3)

        findViewById<Button>(R.id.GSButton).setOnClickListener {
            // Navigate to signIn activity
            startActivity(Intent(this, signIn::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish() // Optional: Close the onboarding screens
        }

        // Remove skipText reference if not present in your layout
    }
}