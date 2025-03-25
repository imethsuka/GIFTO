package com.imethsuka.gifto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class obScreen3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ob_screen3)

        findViewById<Button>(R.id.GSButton).setOnClickListener {
            // Navigate to signUp activity
            startActivity(Intent(this, signUp::class.java))
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish() // Close the onboarding screens
        }
    }
}